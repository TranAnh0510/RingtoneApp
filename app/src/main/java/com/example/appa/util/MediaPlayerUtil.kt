package com.example.appa.util

import android.content.Context
import android.media.MediaPlayer
import android.net.Uri

/**
 * Utility object for managing media player functionalities.
 * @author AnhTTH
 */
object MediaPlayerUtil {
    // MediaPlayer instance to handle audio playback.
    private var mediaPlayer: MediaPlayer? = null

    // Path of the currently playing media.
    var path: String = ""

    // Indicates whether the media player is currently playing.
    var isPlaying = false

    /**
     * Releases the MediaPlayer resources.
     * Stops the MediaPlayer if it is playing, releases its resources, and sets it to null.
     * Resets the path and playing status.
     * @author AnhTTH
     */
    fun releaseMediaPlayer() {
        kotlin.runCatching {
            mediaPlayer?.stop()
            mediaPlayer?.release()
            mediaPlayer = null
            path = ""
            this@MediaPlayerUtil.isPlaying = false
        }.onFailure { it.printStackTrace() }
    }

    /**
     * Plays the sound from the given ringtone path.
     * Prepares the MediaPlayer, starts playback, and sets up listeners for various states.
     * @param context The context from which the method is called.
     * @param ringtonePath The path of the ringtone to be played.
     * @param onPrepare A callback function to be invoked when preparation starts.
     * @param onStart A callback function to be invoked when playback starts.
     * @param onDone A callback function to be invoked when playback is complete.
     * @author AnhTTH
     */
    fun playSound(
        context: Context,
        ringtonePath: String,
        onPrepare: () -> Unit,
        onStart: () -> Unit,
        onDone: () -> Unit
    ) {
        isPlaying = true
        onPrepare()
        releaseMediaPlayer()
        kotlin.runCatching {
            path = ringtonePath
            isPlaying = true
            mediaPlayer = MediaPlayer.create(context, Uri.parse(ringtonePath)).apply {
                setOnErrorListener { _, _, _ ->
                    this@MediaPlayerUtil.isPlaying = false
                    false
                }

                setOnPreparedListener {
                    start()
                    this@MediaPlayerUtil.isPlaying = true
                    onStart()
                }
                setOnCompletionListener {
                    onDone()
                    releaseMediaPlayer()
                }
            }
        }.onFailure { it.printStackTrace() }
    }
}