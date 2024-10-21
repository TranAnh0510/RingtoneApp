package com.example.appa.util

import android.annotation.SuppressLint
import android.content.Context
import com.arthenica.mobileffmpeg.ExecuteCallback
import com.arthenica.mobileffmpeg.FFmpeg

/**
 * Manages ffmpeg operations.
 * @author AnhTTH
 */
class FfmpegManager private constructor() {

    // The context associated with the ffmpeg manager.
    private var context: Context? = null

    /**
     * Initializes the ffmpeg manager with the given context.
     * @param ctx The context to initialize the manager with.
     * @author AnhTTH
     */
    fun init(ctx: Context?) {
        context = ctx
    }

    /**
     * Executes an ffmpeg command asynchronously.
     * @param text The ffmpeg command as an array of strings.
     * @param executeCallback The callback to be invoked after execution.
     * @author AnhTTH
     */
    fun execute(text: Array<String>, executeCallback: ExecuteCallback?) {
        try {
            FFmpeg.executeAsync(text, executeCallback)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    companion object {
        /**
         * The singleton instance of the ffmpeg manager.
         * @author AnhTTH
         */
        @SuppressLint("StaticFieldLeak")
        var instance: FfmpegManager? = null
            get() {
                if (field == null) {
                    field = FfmpegManager()
                }
                return field
            }
            private set
    }
}