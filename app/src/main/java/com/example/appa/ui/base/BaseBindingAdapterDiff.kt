package com.example.appa.ui.base

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.view.animation.AnimationSet
import android.view.animation.AnimationUtils
import android.view.animation.DecelerateInterpolator
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import java.util.concurrent.Executors

abstract class BaseBindingAdapterDiff<T, B : ViewDataBinding>(
    itemCallback: DiffUtil.ItemCallback<T>
) : ListAdapter<T, BaseBindingAdapterDiff.BaseHolder<B>>(
    AsyncDifferConfig.Builder(itemCallback)
        .setBackgroundThreadExecutor(Executors.newSingleThreadExecutor())
        .build()
) {

    /**
     * subclasses must implement data binding to ViewHolder.
     * @author AnhTTH
     */
    protected abstract fun onBindViewHolderBase(holder: BaseHolder<B>, position: Int)

    protected abstract val layoutIdItem: Int

    /**
     * creates and returns a BaseHolder, using DataBindingUtil to inflate the XML layout into a binding object
     * @author AnhTTH
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHolder<B> {
        val binding = DataBindingUtil.inflate<B>(
            LayoutInflater.from(parent.context),
            layoutIdItem,
            parent,
            false
        )
        return BaseHolder(binding)
    }

    /**
     * Performs data binding to views to access views in the layout
     * @author AnhTTH
     */
    override fun onBindViewHolder(holder: BaseHolder<B>, position: Int) {
        onBindViewHolderBase(holder, holder.adapterPosition)
    }

    /**
     * This class is a RecyclerView.ViewHolder that uses DataBinding
     * @author AnhTTH
     */
    class BaseHolder<B : ViewDataBinding>(var binding: B) : RecyclerView.ViewHolder(
        binding.root
    )
    private var lastPosition = -1
    protected fun setAnimation(viewToAnimate: View, position: Int, context: Context) {
        /** If the bound view wasn't previously displayed on screen, it's animated
         * @author AnhTTH
         */
        if (position > lastPosition) {
            val fadeIn = AlphaAnimation(0f, 1f)
            /**
             * Adjust the length of the fade-in effect as desired (unit: milliseconds)
             * @author AnhTTH
              */
            fadeIn.duration = 1000
            /**
             * Adjust the interpolator if necessary
             * @author AnhTTH
             */
            fadeIn.interpolator = DecelerateInterpolator()

            val slideInLeft = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left)
            /**
             * Use AnimationSet to combine both effects
             * @author AnhTTH
              */

            val animationSet = AnimationSet(false)
            animationSet.addAnimation(fadeIn)
            animationSet.addAnimation(slideInLeft)

            viewToAnimate.startAnimation(animationSet)
            lastPosition = position
        }
    }


}