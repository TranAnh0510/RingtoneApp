// Generated by data binding compiler. Do not edit!
package com.example.appa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.appa.R;
import com.example.appa.ui.customview.RippleCornerTextView;
import com.google.android.material.card.MaterialCardView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemChooseVideoBinding extends ViewDataBinding {
  @NonNull
  public final MaterialCardView cvImage;

  @NonNull
  public final ImageView imVideo;

  @NonNull
  public final RippleCornerTextView tvDuration;

  protected ItemChooseVideoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialCardView cvImage, ImageView imVideo, RippleCornerTextView tvDuration) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cvImage = cvImage;
    this.imVideo = imVideo;
    this.tvDuration = tvDuration;
  }

  @NonNull
  public static ItemChooseVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_choose_video, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemChooseVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemChooseVideoBinding>inflateInternal(inflater, R.layout.item_choose_video, root, attachToRoot, component);
  }

  @NonNull
  public static ItemChooseVideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_choose_video, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemChooseVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemChooseVideoBinding>inflateInternal(inflater, R.layout.item_choose_video, null, false, component);
  }

  public static ItemChooseVideoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemChooseVideoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemChooseVideoBinding)bind(component, view, R.layout.item_choose_video);
  }
}
