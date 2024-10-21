package com.example.appa.util

import android.content.Context
import android.os.Environment
import com.example.appa.common.Constant
import com.example.appa.common.MessageEvent
import org.greenrobot.eventbus.EventBus
import java.io.File
import java.util.concurrent.TimeUnit

/**
 * Extracts audio from a video file and saves it as an MP3 file.
 * @param nameFile The name of the output audio file.
 * @param path The path of the input video file.
 * @author AnhTTH
 */
fun Context.extractAudioFromVideo(nameFile: String, path: String) {
    val myDir =
        File(Environment.getExternalStorageDirectory().path + "/" + Environment.DIRECTORY_DOWNLOADS + "/" + "RingTone190/MySound")
    if (!myDir.exists()) {
        if (myDir.mkdirs()) {
        }
    }
    val mOutputFile = File(
        myDir.absolutePath + File.separator + nameFile.replace(
            ".mp4",
            ""
        ) + System.currentTimeMillis() + ".mp3"
    )
    val cmd = arrayOf<String>(
        "-i", path, "-f", "mp3", "-ab", "192000", "-vn", mOutputFile.absolutePath
    )
    FfmpegManager.instance?.execute(cmd) { executionId, returnCode ->
        if (returnCode == 0) {
            EventBus.getDefault().post(
                    MessageEvent(
                        Constant.EVENT_EXTRACT_AUDIO_FROM_VIDEO_SUCCESS,
                        mOutputFile.absolutePath
                    )
                )
        } else {
            EventBus.getDefault().post(MessageEvent(Constant.EVENT_EXTRACT_AUDIO_FROM_VIDEO_FAILED))
        }
    }
}

/**
 * Trims an audio file to a specified start and end time, and saves the result as an MP3 file.
 * @param startTime The start time in milliseconds.
 * @param endTime The end time in milliseconds.
 * @param nameFile The name of the output audio file.
 * @param path The path of the input audio file.
 * @author AnhTTH
 */

fun Context.trimAudio(startTime: Int, endTime: Int, nameFile: String, path: String) {
    val myDir =
        File(Environment.getExternalStorageDirectory().path + "/" + Environment.DIRECTORY_DOWNLOADS + "/" + "RingTone190/MySound")
    if (!myDir.exists()) {
        if (myDir.mkdirs()) {
        }
    }
    val mOutputFile = File(
        myDir.absolutePath + File.separator + nameFile + System.currentTimeMillis() + ".mp3"
    )
    val cmd = arrayOf<String>(
        "-i",
        path,
        "-ss",
        formatTimeCutVideo(startTime.toLong()),
        "-to",
        formatTimeCutVideo(endTime.toLong()),
        mOutputFile.absolutePath
    )
    FfmpegManager.instance?.execute(cmd) { executionId, returnCode ->
        if (returnCode == 0) {
            EventBus.getDefault()
                .post(MessageEvent(Constant.EVENT_TRIM_AUDIO_SUCCESS, mOutputFile.absolutePath))
        } else {
            EventBus.getDefault().post(MessageEvent(Constant.EVENT_TRIM_AUDIO_FAILED))
        }
    }
}

/**
 * Formats a time duration in milliseconds to a string in the format HH:mm:ss.S.
 * @param time The time in milliseconds.
 * @return The formatted time string.
 * @author AnhTTH
 */
fun formatTimeCutVideo(time: Long): String {
    val hr = TimeUnit.MILLISECONDS.toHours(time)
    val min = TimeUnit.MILLISECONDS.toMinutes(time) % 60
    val sec = TimeUnit.MILLISECONDS.toSeconds(time) % 60
    val m = format(time - (sec * 1000 + min * 60 * 1000 + hr * 3600 * 1000))
    return if (hr == 0L) {
        String.format("%02d:%02d.%d", min, sec, m)
    } else String.format("%02d:%02d:%02d.%d", hr, min, sec, m)
}

/**
 * Recursively formats the remaining milliseconds to a single digit.
 * @param time The time in milliseconds.
 * @return The formatted time.
 * @author AnhTTH
 */
fun format(time: Long): Long {
    return if (time >= 10) {
        format(time / 10)
    } else {
        time
    }
}
