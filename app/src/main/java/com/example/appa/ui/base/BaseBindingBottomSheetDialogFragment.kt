package com.example.appa.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.appa.R

abstract class BaseBindingBottomSheetDialogFragment<B : ViewDataBinding> :
    BaseBottomSheetDialogFragment() {

    lateinit var binding: B
    abstract val layoutId: Int

    /**
     * Subclasses must implement the view after it is created.
     * @author AnhTTH
     */
    protected abstract fun onCreatedView(view: View?, savedInstanceState: Bundle?)

    /**
     * create and return a hierarchical View associated with the Fragment.
     * @author AnhTTH
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /**
         * initializes the binding object for the XML layout specified by layoutId.
         * @author AnhTTH
         */
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        return binding.getRoot()
    }

    /**
     * lifecycle method called when Fragment is created
     * @author AnhTTH
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * Set style for Bottom Sheet Dialog Fragment
         * @author AnhTTH
         */
        setStyle(STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme)
    }

    /**
     * called immediately after onCreateView when the View has been created
     * @author AnhTTH
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onCreatedView(view, savedInstanceState)
    }
}