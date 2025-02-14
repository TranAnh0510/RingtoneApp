// Generated by data binding compiler. Do not edit!
package com.example.appa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.example.appa.R;
import java.lang.Deprecated;
import java.lang.Object;
import trim.TrimVideoView;

public abstract class ActivityEditMySoundBinding extends ViewDataBinding {
  @NonNull
  public final LottieAnimationView animationView;

  @NonNull
  public final EditText etName;

  @NonNull
  public final ImageView imBack;

  @NonNull
  public final ImageView imPlayPause;

  @NonNull
  public final ImageView imPrevious;

  @NonNull
  public final TrimVideoView trimView;

  @NonNull
  public final TextView tvDone;

  @NonNull
  public final TextView tvTheYellow;

  @NonNull
  public final TextView tvTimeStart;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final TextView tvTotalTime;

  @NonNull
  public final FrameLayout viewLoading;

  @NonNull
  public final LinearLayout viewPlayAudio;

  protected ActivityEditMySoundBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LottieAnimationView animationView, EditText etName, ImageView imBack, ImageView imPlayPause,
      ImageView imPrevious, TrimVideoView trimView, TextView tvDone, TextView tvTheYellow,
      TextView tvTimeStart, TextView tvTitle, TextView tvTotalTime, FrameLayout viewLoading,
      LinearLayout viewPlayAudio) {
    super(_bindingComponent, _root, _localFieldCount);
    this.animationView = animationView;
    this.etName = etName;
    this.imBack = imBack;
    this.imPlayPause = imPlayPause;
    this.imPrevious = imPrevious;
    this.trimView = trimView;
    this.tvDone = tvDone;
    this.tvTheYellow = tvTheYellow;
    this.tvTimeStart = tvTimeStart;
    this.tvTitle = tvTitle;
    this.tvTotalTime = tvTotalTime;
    this.viewLoading = viewLoading;
    this.viewPlayAudio = viewPlayAudio;
  }

  @NonNull
  public static ActivityEditMySoundBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_edit_my_sound, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityEditMySoundBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityEditMySoundBinding>inflateInternal(inflater, R.layout.activity_edit_my_sound, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityEditMySoundBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_edit_my_sound, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityEditMySoundBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityEditMySoundBinding>inflateInternal(inflater, R.layout.activity_edit_my_sound, null, false, component);
  }

  public static ActivityEditMySoundBinding bind(@NonNull View view) {
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
  public static ActivityEditMySoundBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityEditMySoundBinding)bind(component, view, R.layout.activity_edit_my_sound);
  }
}
