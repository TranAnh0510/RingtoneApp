package com.example.appa.common
/**
 * Object containing constant values used throughout the application.
 * @author AnhTTH
 */
object Constant {

    // Language
    const val TYPE_LANGUAGE_SPLASH = 1
    const val TYPE_LANGUAGE_SETTING = 2

    //EventBus
    const val EVENT_TRIM_AUDIO_SUCCESS = 1
    const val EVENT_TRIM_AUDIO_FAILED = 2
    const val EVENT_EXTRACT_AUDIO_FROM_VIDEO_SUCCESS = 3
    const val EVENT_EXTRACT_AUDIO_FROM_VIDEO_FAILED = 4
    const val EVENT_NET_WORK_CHANGE = 5
    const val EVENT_UPDATE_RECENT = 7
    const val EVENT_STOP_MUSIC_RINGTONE_FRAGMENT = 8
    const val EVENT_STOP_MUSIC_FAVORITE_FRAGMENT = 9
    const val EVENT_STOP_MUSIC_MY_SOUND_FRAGMENT = 10
    const val EVENT_UPDATE_FAVORITE = 11
    const val EVENT_UPDATE_MY_SOUND = 12
    const val EVENT_DOWNLOAD_COMPLETE = 13
    const val EVENT_UPDATE_PATH_DOWNLOAD_FAVOURITE = 14
    const val EVENT_UPDATE_PATH_DOWNLOAD_RECENT = 15

    //Intent
    const val KEY_URI_FROM_RECORD_AUDIO = "KEY_URI_FROM_RECORD_AUDIO"
    const val KEY_PATH_VIDEO = "KEY_PATH_VIDEO"
    const val KEY_NAME_VIDEO = "KEY_NAME_VIDEO"
    const val KEY_DURATION_VIDEO = "KEY_DURATION_VIDEO"

    const val KEY_PATH_AUDIO = "KEY_PATH_AUDIO"
    const val KEY_NAME_AUDIO = "KEY_NAME_AUDIO"
    const val KEY_DURATION_AUDIO = "KEY_DURATION_AUDIO"


    const val KEY_SHOW_MY_SOUND = "KEY_SHOW_MY_SOUND"


    /**
     * Lưu giá trị của trạng thái vào sharePreference thông qua Key
     * Kiểm tra trạng thái của view thông qua các key để show màn hiển thị
     */
    const val KEY_FIRST_SHOW_INTRO = "KEY_FIRST_SHOW_INTRO"
    const val TYPE_SHOW_INTRO_ACT = 3
    const val TYPE_SHOW_LANGUAGE_ACT = 4
    const val KEY_IS_RATE = "isRate"
    const val TYPE_LANG = "MultiLangAct_Lang"

    /**
     * Save state tvGo in Permission Screen
     *
     * If true -> User đã từng cấp full quyền, Nên khi giá trị bằng true lập tức chuyển sang MainAct
     * If false -> Check Permission in Permission Screen
     */
    const val KEY_CLICK_GO = "KEY_CLICK_GO"

    const val KEY_CLICK_SKIP = "KEY_CLICK_SKIP"
    const val KEY_NAME_CATEGORY = "KEY_NAME_CATEGORY"

}