package com.example.appa;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.appa.databinding.ActivityAudioBindingImpl;
import com.example.appa.databinding.ActivityCategoryBindingImpl;
import com.example.appa.databinding.ActivityEditMySoundBindingImpl;
import com.example.appa.databinding.ActivityGuideLineBindingImpl;
import com.example.appa.databinding.ActivityIntroBindingImpl;
import com.example.appa.databinding.ActivityMainBindingImpl;
import com.example.appa.databinding.ActivityMultiLangBindingImpl;
import com.example.appa.databinding.ActivityPermissionBindingImpl;
import com.example.appa.databinding.ActivityRecentBindingImpl;
import com.example.appa.databinding.ActivityRecordingBindingImpl;
import com.example.appa.databinding.ActivitySearchBindingImpl;
import com.example.appa.databinding.ActivitySplashBindingImpl;
import com.example.appa.databinding.ActivityVideoBindingImpl;
import com.example.appa.databinding.CustomBottomNavigationBindingImpl;
import com.example.appa.databinding.DialogAscendingBindingImpl;
import com.example.appa.databinding.DialogChangeNameMySoundBindingImpl;
import com.example.appa.databinding.DialogDeniedExternalStorageBindingImpl;
import com.example.appa.databinding.DialogDeniedMediaAudioBindingImpl;
import com.example.appa.databinding.DialogDeniedMediaVideoBindingImpl;
import com.example.appa.databinding.DialogDeniedWriteSettingBindingImpl;
import com.example.appa.databinding.DialogLoadingBindingImpl;
import com.example.appa.databinding.DialogOptionAllRecordBindingImpl;
import com.example.appa.databinding.DialogOptionCategoryBindingImpl;
import com.example.appa.databinding.DialogOptionFavoriteBindingImpl;
import com.example.appa.databinding.DialogOptionMySoundBindingImpl;
import com.example.appa.databinding.DialogOptionRecentBindingImpl;
import com.example.appa.databinding.DialogOptionSearchBindingImpl;
import com.example.appa.databinding.DialogRateBindingImpl;
import com.example.appa.databinding.DialogSortBindingImpl;
import com.example.appa.databinding.FragmentFavoriteBindingImpl;
import com.example.appa.databinding.FragmentMySoundBindingImpl;
import com.example.appa.databinding.FragmentRingtonesBindingImpl;
import com.example.appa.databinding.FragmentSettingBindingImpl;
import com.example.appa.databinding.ItemAudioBindingImpl;
import com.example.appa.databinding.ItemCateBindingImpl;
import com.example.appa.databinding.ItemCategoriesBindingImpl;
import com.example.appa.databinding.ItemCategoryDetailBindingImpl;
import com.example.appa.databinding.ItemChooseVideoBindingImpl;
import com.example.appa.databinding.ItemFavoritesBindingImpl;
import com.example.appa.databinding.ItemGridAudioBindingImpl;
import com.example.appa.databinding.ItemHistorySearchBindingImpl;
import com.example.appa.databinding.ItemIntroBindingImpl;
import com.example.appa.databinding.ItemMultiLangBindingImpl;
import com.example.appa.databinding.ItemMySoundsBindingImpl;
import com.example.appa.databinding.ItemRecentActBindingImpl;
import com.example.appa.databinding.ItemRecentBindingImpl;
import com.example.appa.databinding.ItemRecordingBindingImpl;
import com.example.appa.databinding.ItemSearchBindingImpl;
import com.example.appa.databinding.ItemVideoLinearBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYAUDIO = 1;

  private static final int LAYOUT_ACTIVITYCATEGORY = 2;

  private static final int LAYOUT_ACTIVITYEDITMYSOUND = 3;

  private static final int LAYOUT_ACTIVITYGUIDELINE = 4;

  private static final int LAYOUT_ACTIVITYINTRO = 5;

  private static final int LAYOUT_ACTIVITYMAIN = 6;

  private static final int LAYOUT_ACTIVITYMULTILANG = 7;

  private static final int LAYOUT_ACTIVITYPERMISSION = 8;

  private static final int LAYOUT_ACTIVITYRECENT = 9;

  private static final int LAYOUT_ACTIVITYRECORDING = 10;

  private static final int LAYOUT_ACTIVITYSEARCH = 11;

  private static final int LAYOUT_ACTIVITYSPLASH = 12;

  private static final int LAYOUT_ACTIVITYVIDEO = 13;

  private static final int LAYOUT_CUSTOMBOTTOMNAVIGATION = 14;

  private static final int LAYOUT_DIALOGASCENDING = 15;

  private static final int LAYOUT_DIALOGCHANGENAMEMYSOUND = 16;

  private static final int LAYOUT_DIALOGDENIEDEXTERNALSTORAGE = 17;

  private static final int LAYOUT_DIALOGDENIEDMEDIAAUDIO = 18;

  private static final int LAYOUT_DIALOGDENIEDMEDIAVIDEO = 19;

  private static final int LAYOUT_DIALOGDENIEDWRITESETTING = 20;

  private static final int LAYOUT_DIALOGLOADING = 21;

  private static final int LAYOUT_DIALOGOPTIONALLRECORD = 22;

  private static final int LAYOUT_DIALOGOPTIONCATEGORY = 23;

  private static final int LAYOUT_DIALOGOPTIONFAVORITE = 24;

  private static final int LAYOUT_DIALOGOPTIONMYSOUND = 25;

  private static final int LAYOUT_DIALOGOPTIONRECENT = 26;

  private static final int LAYOUT_DIALOGOPTIONSEARCH = 27;

  private static final int LAYOUT_DIALOGRATE = 28;

  private static final int LAYOUT_DIALOGSORT = 29;

  private static final int LAYOUT_FRAGMENTFAVORITE = 30;

  private static final int LAYOUT_FRAGMENTMYSOUND = 31;

  private static final int LAYOUT_FRAGMENTRINGTONES = 32;

  private static final int LAYOUT_FRAGMENTSETTING = 33;

  private static final int LAYOUT_ITEMAUDIO = 34;

  private static final int LAYOUT_ITEMCATE = 35;

  private static final int LAYOUT_ITEMCATEGORIES = 36;

  private static final int LAYOUT_ITEMCATEGORYDETAIL = 37;

  private static final int LAYOUT_ITEMCHOOSEVIDEO = 38;

  private static final int LAYOUT_ITEMFAVORITES = 39;

  private static final int LAYOUT_ITEMGRIDAUDIO = 40;

  private static final int LAYOUT_ITEMHISTORYSEARCH = 41;

  private static final int LAYOUT_ITEMINTRO = 42;

  private static final int LAYOUT_ITEMMULTILANG = 43;

  private static final int LAYOUT_ITEMMYSOUNDS = 44;

  private static final int LAYOUT_ITEMRECENT = 45;

  private static final int LAYOUT_ITEMRECENTACT = 46;

  private static final int LAYOUT_ITEMRECORDING = 47;

  private static final int LAYOUT_ITEMSEARCH = 48;

  private static final int LAYOUT_ITEMVIDEOLINEAR = 49;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(49);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.activity_audio, LAYOUT_ACTIVITYAUDIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.activity_category, LAYOUT_ACTIVITYCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.activity_edit_my_sound, LAYOUT_ACTIVITYEDITMYSOUND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.activity_guide_line, LAYOUT_ACTIVITYGUIDELINE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.activity_intro, LAYOUT_ACTIVITYINTRO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.activity_multi_lang, LAYOUT_ACTIVITYMULTILANG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.activity_permission, LAYOUT_ACTIVITYPERMISSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.activity_recent, LAYOUT_ACTIVITYRECENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.activity_recording, LAYOUT_ACTIVITYRECORDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.activity_search, LAYOUT_ACTIVITYSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.activity_video, LAYOUT_ACTIVITYVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.custom_bottom_navigation, LAYOUT_CUSTOMBOTTOMNAVIGATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_ascending, LAYOUT_DIALOGASCENDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_change_name_my_sound, LAYOUT_DIALOGCHANGENAMEMYSOUND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_denied_external_storage, LAYOUT_DIALOGDENIEDEXTERNALSTORAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_denied_media_audio, LAYOUT_DIALOGDENIEDMEDIAAUDIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_denied_media_video, LAYOUT_DIALOGDENIEDMEDIAVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_denied_write_setting, LAYOUT_DIALOGDENIEDWRITESETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_loading, LAYOUT_DIALOGLOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_option_all_record, LAYOUT_DIALOGOPTIONALLRECORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_option_category, LAYOUT_DIALOGOPTIONCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_option_favorite, LAYOUT_DIALOGOPTIONFAVORITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_option_my_sound, LAYOUT_DIALOGOPTIONMYSOUND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_option_recent, LAYOUT_DIALOGOPTIONRECENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_option_search, LAYOUT_DIALOGOPTIONSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_rate, LAYOUT_DIALOGRATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.dialog_sort, LAYOUT_DIALOGSORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.fragment_favorite, LAYOUT_FRAGMENTFAVORITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.fragment_my_sound, LAYOUT_FRAGMENTMYSOUND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.fragment_ringtones, LAYOUT_FRAGMENTRINGTONES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.fragment_setting, LAYOUT_FRAGMENTSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_audio, LAYOUT_ITEMAUDIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_cate, LAYOUT_ITEMCATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_categories, LAYOUT_ITEMCATEGORIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_category_detail, LAYOUT_ITEMCATEGORYDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_choose_video, LAYOUT_ITEMCHOOSEVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_favorites, LAYOUT_ITEMFAVORITES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_grid_audio, LAYOUT_ITEMGRIDAUDIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_history_search, LAYOUT_ITEMHISTORYSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_intro, LAYOUT_ITEMINTRO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_multi_lang, LAYOUT_ITEMMULTILANG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_my_sounds, LAYOUT_ITEMMYSOUNDS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_recent, LAYOUT_ITEMRECENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_recent_act, LAYOUT_ITEMRECENTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_recording, LAYOUT_ITEMRECORDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_search, LAYOUT_ITEMSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appa.R.layout.item_video_linear, LAYOUT_ITEMVIDEOLINEAR);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYAUDIO: {
          if ("layout/activity_audio_0".equals(tag)) {
            return new ActivityAudioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_audio is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCATEGORY: {
          if ("layout/activity_category_0".equals(tag)) {
            return new ActivityCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEDITMYSOUND: {
          if ("layout/activity_edit_my_sound_0".equals(tag)) {
            return new ActivityEditMySoundBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_edit_my_sound is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYGUIDELINE: {
          if ("layout/activity_guide_line_0".equals(tag)) {
            return new ActivityGuideLineBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_guide_line is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYINTRO: {
          if ("layout/activity_intro_0".equals(tag)) {
            return new ActivityIntroBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_intro is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMULTILANG: {
          if ("layout/activity_multi_lang_0".equals(tag)) {
            return new ActivityMultiLangBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_multi_lang is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPERMISSION: {
          if ("layout/activity_permission_0".equals(tag)) {
            return new ActivityPermissionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_permission is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRECENT: {
          if ("layout/activity_recent_0".equals(tag)) {
            return new ActivityRecentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_recent is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRECORDING: {
          if ("layout/activity_recording_0".equals(tag)) {
            return new ActivityRecordingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_recording is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSEARCH: {
          if ("layout/activity_search_0".equals(tag)) {
            return new ActivitySearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYVIDEO: {
          if ("layout/activity_video_0".equals(tag)) {
            return new ActivityVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_video is invalid. Received: " + tag);
        }
        case  LAYOUT_CUSTOMBOTTOMNAVIGATION: {
          if ("layout/custom_bottom_navigation_0".equals(tag)) {
            return new CustomBottomNavigationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for custom_bottom_navigation is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGASCENDING: {
          if ("layout/dialog_ascending_0".equals(tag)) {
            return new DialogAscendingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_ascending is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGCHANGENAMEMYSOUND: {
          if ("layout/dialog_change_name_my_sound_0".equals(tag)) {
            return new DialogChangeNameMySoundBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_change_name_my_sound is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGDENIEDEXTERNALSTORAGE: {
          if ("layout/dialog_denied_external_storage_0".equals(tag)) {
            return new DialogDeniedExternalStorageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_denied_external_storage is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGDENIEDMEDIAAUDIO: {
          if ("layout/dialog_denied_media_audio_0".equals(tag)) {
            return new DialogDeniedMediaAudioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_denied_media_audio is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGDENIEDMEDIAVIDEO: {
          if ("layout/dialog_denied_media_video_0".equals(tag)) {
            return new DialogDeniedMediaVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_denied_media_video is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGDENIEDWRITESETTING: {
          if ("layout/dialog_denied_write_setting_0".equals(tag)) {
            return new DialogDeniedWriteSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_denied_write_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGLOADING: {
          if ("layout/dialog_loading_0".equals(tag)) {
            return new DialogLoadingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_loading is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGOPTIONALLRECORD: {
          if ("layout/dialog_option_all_record_0".equals(tag)) {
            return new DialogOptionAllRecordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_option_all_record is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGOPTIONCATEGORY: {
          if ("layout/dialog_option_category_0".equals(tag)) {
            return new DialogOptionCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_option_category is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGOPTIONFAVORITE: {
          if ("layout/dialog_option_favorite_0".equals(tag)) {
            return new DialogOptionFavoriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_option_favorite is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGOPTIONMYSOUND: {
          if ("layout/dialog_option_my_sound_0".equals(tag)) {
            return new DialogOptionMySoundBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_option_my_sound is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGOPTIONRECENT: {
          if ("layout/dialog_option_recent_0".equals(tag)) {
            return new DialogOptionRecentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_option_recent is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGOPTIONSEARCH: {
          if ("layout/dialog_option_search_0".equals(tag)) {
            return new DialogOptionSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_option_search is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGRATE: {
          if ("layout/dialog_rate_0".equals(tag)) {
            return new DialogRateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_rate is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGSORT: {
          if ("layout/dialog_sort_0".equals(tag)) {
            return new DialogSortBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_sort is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITE: {
          if ("layout/fragment_favorite_0".equals(tag)) {
            return new FragmentFavoriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorite is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMYSOUND: {
          if ("layout/fragment_my_sound_0".equals(tag)) {
            return new FragmentMySoundBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_my_sound is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRINGTONES: {
          if ("layout/fragment_ringtones_0".equals(tag)) {
            return new FragmentRingtonesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_ringtones is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTING: {
          if ("layout/fragment_setting_0".equals(tag)) {
            return new FragmentSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMAUDIO: {
          if ("layout/item_audio_0".equals(tag)) {
            return new ItemAudioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_audio is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATE: {
          if ("layout/item_cate_0".equals(tag)) {
            return new ItemCateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_cate is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORIES: {
          if ("layout/item_categories_0".equals(tag)) {
            return new ItemCategoriesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_categories is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORYDETAIL: {
          if ("layout/item_category_detail_0".equals(tag)) {
            return new ItemCategoryDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_category_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHOOSEVIDEO: {
          if ("layout/item_choose_video_0".equals(tag)) {
            return new ItemChooseVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_choose_video is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFAVORITES: {
          if ("layout/item_favorites_0".equals(tag)) {
            return new ItemFavoritesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_favorites is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMGRIDAUDIO: {
          if ("layout/item_grid_audio_0".equals(tag)) {
            return new ItemGridAudioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_grid_audio is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHISTORYSEARCH: {
          if ("layout/item_history_search_0".equals(tag)) {
            return new ItemHistorySearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_history_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMINTRO: {
          if ("layout/item_intro_0".equals(tag)) {
            return new ItemIntroBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_intro is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMULTILANG: {
          if ("layout/item_multi_lang_0".equals(tag)) {
            return new ItemMultiLangBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_multi_lang is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMYSOUNDS: {
          if ("layout/item_my_sounds_0".equals(tag)) {
            return new ItemMySoundsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_my_sounds is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRECENT: {
          if ("layout/item_recent_0".equals(tag)) {
            return new ItemRecentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_recent is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRECENTACT: {
          if ("layout/item_recent_act_0".equals(tag)) {
            return new ItemRecentActBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_recent_act is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRECORDING: {
          if ("layout/item_recording_0".equals(tag)) {
            return new ItemRecordingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_recording is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSEARCH: {
          if ("layout/item_search_0".equals(tag)) {
            return new ItemSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMVIDEOLINEAR: {
          if ("layout/item_video_linear_0".equals(tag)) {
            return new ItemVideoLinearBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_video_linear is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(49);

    static {
      sKeys.put("layout/activity_audio_0", com.example.appa.R.layout.activity_audio);
      sKeys.put("layout/activity_category_0", com.example.appa.R.layout.activity_category);
      sKeys.put("layout/activity_edit_my_sound_0", com.example.appa.R.layout.activity_edit_my_sound);
      sKeys.put("layout/activity_guide_line_0", com.example.appa.R.layout.activity_guide_line);
      sKeys.put("layout/activity_intro_0", com.example.appa.R.layout.activity_intro);
      sKeys.put("layout/activity_main_0", com.example.appa.R.layout.activity_main);
      sKeys.put("layout/activity_multi_lang_0", com.example.appa.R.layout.activity_multi_lang);
      sKeys.put("layout/activity_permission_0", com.example.appa.R.layout.activity_permission);
      sKeys.put("layout/activity_recent_0", com.example.appa.R.layout.activity_recent);
      sKeys.put("layout/activity_recording_0", com.example.appa.R.layout.activity_recording);
      sKeys.put("layout/activity_search_0", com.example.appa.R.layout.activity_search);
      sKeys.put("layout/activity_splash_0", com.example.appa.R.layout.activity_splash);
      sKeys.put("layout/activity_video_0", com.example.appa.R.layout.activity_video);
      sKeys.put("layout/custom_bottom_navigation_0", com.example.appa.R.layout.custom_bottom_navigation);
      sKeys.put("layout/dialog_ascending_0", com.example.appa.R.layout.dialog_ascending);
      sKeys.put("layout/dialog_change_name_my_sound_0", com.example.appa.R.layout.dialog_change_name_my_sound);
      sKeys.put("layout/dialog_denied_external_storage_0", com.example.appa.R.layout.dialog_denied_external_storage);
      sKeys.put("layout/dialog_denied_media_audio_0", com.example.appa.R.layout.dialog_denied_media_audio);
      sKeys.put("layout/dialog_denied_media_video_0", com.example.appa.R.layout.dialog_denied_media_video);
      sKeys.put("layout/dialog_denied_write_setting_0", com.example.appa.R.layout.dialog_denied_write_setting);
      sKeys.put("layout/dialog_loading_0", com.example.appa.R.layout.dialog_loading);
      sKeys.put("layout/dialog_option_all_record_0", com.example.appa.R.layout.dialog_option_all_record);
      sKeys.put("layout/dialog_option_category_0", com.example.appa.R.layout.dialog_option_category);
      sKeys.put("layout/dialog_option_favorite_0", com.example.appa.R.layout.dialog_option_favorite);
      sKeys.put("layout/dialog_option_my_sound_0", com.example.appa.R.layout.dialog_option_my_sound);
      sKeys.put("layout/dialog_option_recent_0", com.example.appa.R.layout.dialog_option_recent);
      sKeys.put("layout/dialog_option_search_0", com.example.appa.R.layout.dialog_option_search);
      sKeys.put("layout/dialog_rate_0", com.example.appa.R.layout.dialog_rate);
      sKeys.put("layout/dialog_sort_0", com.example.appa.R.layout.dialog_sort);
      sKeys.put("layout/fragment_favorite_0", com.example.appa.R.layout.fragment_favorite);
      sKeys.put("layout/fragment_my_sound_0", com.example.appa.R.layout.fragment_my_sound);
      sKeys.put("layout/fragment_ringtones_0", com.example.appa.R.layout.fragment_ringtones);
      sKeys.put("layout/fragment_setting_0", com.example.appa.R.layout.fragment_setting);
      sKeys.put("layout/item_audio_0", com.example.appa.R.layout.item_audio);
      sKeys.put("layout/item_cate_0", com.example.appa.R.layout.item_cate);
      sKeys.put("layout/item_categories_0", com.example.appa.R.layout.item_categories);
      sKeys.put("layout/item_category_detail_0", com.example.appa.R.layout.item_category_detail);
      sKeys.put("layout/item_choose_video_0", com.example.appa.R.layout.item_choose_video);
      sKeys.put("layout/item_favorites_0", com.example.appa.R.layout.item_favorites);
      sKeys.put("layout/item_grid_audio_0", com.example.appa.R.layout.item_grid_audio);
      sKeys.put("layout/item_history_search_0", com.example.appa.R.layout.item_history_search);
      sKeys.put("layout/item_intro_0", com.example.appa.R.layout.item_intro);
      sKeys.put("layout/item_multi_lang_0", com.example.appa.R.layout.item_multi_lang);
      sKeys.put("layout/item_my_sounds_0", com.example.appa.R.layout.item_my_sounds);
      sKeys.put("layout/item_recent_0", com.example.appa.R.layout.item_recent);
      sKeys.put("layout/item_recent_act_0", com.example.appa.R.layout.item_recent_act);
      sKeys.put("layout/item_recording_0", com.example.appa.R.layout.item_recording);
      sKeys.put("layout/item_search_0", com.example.appa.R.layout.item_search);
      sKeys.put("layout/item_video_linear_0", com.example.appa.R.layout.item_video_linear);
    }
  }
}
