package com.example.appa.util

import android.content.Context
import android.media.MediaPlayer
import android.media.MediaPlayer.OnCompletionListener
import android.net.Uri
import android.os.Handler
import android.os.Looper
import java.io.IOException

/**
 * Manages audio playback functionality.
 * @author AnhTTH
 */
class AudioPlayer {
    //The MediaPlayer instance.
    private var mMediaPlayer: MediaPlayer? = null

    // The handler for managing playback duration.
    private val handler = Handler(Looper.getMainLooper())

    //The runnable for stopping playback.
    private val runnable = Runnable { stop() }


    /**
     * Stops audio playback.
     * @author AnhTTH
     */
    fun stop() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.release()
            mMediaPlayer = null
        }
    }

    /**
     * Gets the duration of an audio file.
     * @param c The context.
     * @param uri The URI of the audio file.
     * @return The duration of the audio file.
     * @author AnhTTH
     */
    fun getDuration(c: Context, uri: Uri): Int {
        try {
            if (mMediaPlayer == null) {
                mMediaPlayer = MediaPlayer().apply {
                    reset()
                    setDataSource(c, uri)
                    prepare()
                    setOnCompletionListener { mediaPlayer: MediaPlayer? -> stop() }
                }
            }
            return mMediaPlayer?.duration ?: 0
        } catch (e: IOException) {
            e.printStackTrace()
            return 0
        }
    }

    /**
     * Plays audio from a given URI with specified start and end seconds.
     * @param c The context.
     * @param uri The URI of the audio file.
     * @param path The path of the audio file.
     * @param startSeconds The starting point in seconds.
     * @param endSeconds The ending point in seconds.
     */
    fun play(c: Context, uri: Uri?, path: String, startSeconds: Int, endSeconds: Int) {
        try {
            handler.removeCallbacks(runnable)
            if (mMediaPlayer == null) {
                mMediaPlayer = MediaPlayer().apply {
                    reset()
                    if (uri == null) {
                        setDataSource(c, Uri.parse(path))
                    } else {
                        setDataSource(c, uri)
                    }

                    prepare()
                    setOnCompletionListener { mediaPlayer: MediaPlayer? -> stop() }
                    seekTo(startSeconds)
                }
            }
            mMediaPlayer?.seekTo(startSeconds)
            mMediaPlayer?.start()
            handler.postDelayed(runnable, (endSeconds - startSeconds).toLong())
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    /**
     * Checks if audio is currently playing.
     * @return True if audio is playing, otherwise false.
     * @author AnhTTH
     */
    val isPlaying: Boolean
        get() = try {
            if (mMediaPlayer == null) false else mMediaPlayer?.isPlaying ?: false
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
}
