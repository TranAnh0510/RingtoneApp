// Generated by data binding compiler. Do not edit!
package com.example.appa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.appa.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemRecentActBinding extends ViewDataBinding {
  @NonNull
  public final CardView cvImageRingTone;

  @NonNull
  public final ImageView imDownload;

  @NonNull
  public final ImageView imMore;

  @NonNull
  public final ImageView imMoreInvisible;

  @NonNull
  public final ImageView imPlay;

  @NonNull
  public final ImageView imSound;

  @NonNull
  public final TextView tvDuration;

  @NonNull
  public final TextView tvNameRingTone;

  protected ItemRecentActBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cvImageRingTone, ImageView imDownload, ImageView imMore, ImageView imMoreInvisible,
      ImageView imPlay, ImageView imSound, TextView tvDuration, TextView tvNameRingTone) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cvImageRingTone = cvImageRingTone;
    this.imDownload = imDownload;
    this.imMore = imMore;
    this.imMoreInvisible = imMoreInvisible;
    this.imPlay = imPlay;
    this.imSound = imSound;
    this.tvDuration = tvDuration;
    this.tvNameRingTone = tvNameRingTone;
  }

  @NonNull
  public static ItemRecentActBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_recent_act, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemRecentActBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemRecentActBinding>inflateInternal(inflater, R.layout.item_recent_act, root, attachToRoot, component);
  }

  @NonNull
  public static ItemRecentActBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_recent_act, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemRecentActBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemRecentActBinding>inflateInternal(inflater, R.layout.item_recent_act, null, false, component);
  }

  public static ItemRecentActBinding bind(@NonNull View view) {
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
  public static ItemRecentActBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemRecentActBinding)bind(component, view, R.layout.item_recent_act);
  }
}
