package com.example.appa.ui.base

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetBehavior

abstract class BaseBindingFragment<B : ViewDataBinding, T : BaseViewModel> : BaseFragment() {
	lateinit var binding: B
	lateinit var viewModel: T
	private var lastClickTime: Long = 0

	protected abstract fun getViewModel(): Class<T>
	protected abstract fun registerOnBackPress()
    protected abstract fun onCreatedView(view: View?, savedInstanceState: Bundle?)
    abstract val layoutId: Int
	private var toast: Toast? = null
	private var handlerToast = Handler(Looper.getMainLooper())

    private val callBack = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            registerOnBackPress()
        }
    }

	override fun onDestroy() {
		super.onDestroy()
		handlerToast.removeCallbacksAndMessages(null)
	}

	/**
	 * Create the fragment's user interface using Data Binding
	 * @author AnhTTH
	 */
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?,
	): View? {
		binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
		return binding.root
	}

	/**
	 * initialize the viewModel using a ViewModelProvider fragment
	 * @author AnhTTH
	 */
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		viewModel = ViewModelProvider(this)[getViewModel()]
	}

	/**
	 * Performs user interface related operations after the view has been completely created
	 * @author AnhTTH
	 */
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		onCreatedView(view, savedInstanceState)
	}

	/**
	 * displays a short Toast message on the screen
	 *@author AnhTTH
	 */
    @SuppressLint("ShowToast")
    fun toast(text: String) {
		/**
		 * Cancel the current Toast if it is displayed
		 * @author AnhTTH
		 */
        toast?.cancel()
		/**
		 * Create a new Toast with the text provided and a short duration
		 * @author AnhTTH
		 */
        toast = Toast.makeText(context, text, Toast.LENGTH_SHORT)
		/**
		 * Show new Toast
		 * @author AnhTTH
		 */
        toast?.show()
		/**
		 * Cancel the Toast after 1.5 seconds to ensure it doesn't last too long.
		 * @author AnhTTH
		 */
        handlerToast.postDelayed({
            toast?.cancel()
        }, 1500)
    }

	fun initSheet(view: View): BottomSheetBehavior<*> {
		return BottomSheetBehavior.from<View>(view)
	}

}