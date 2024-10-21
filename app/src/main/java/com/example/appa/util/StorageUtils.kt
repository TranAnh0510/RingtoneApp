package com.example.appa.util

import java.text.DecimalFormat
import kotlin.math.log10
import kotlin.math.pow

/**
 * Utility object for storage-related functions.
 * @author AnhTTH
 */
object StorageUtils {
    // Logarithm base 10 of 1024. Used for calculating file size in human-readable format.
    private val LOG_1024 = log10(1024.0)

    /**
     * Converts a file size in bytes to a human-readable string format.
     * @param size The size in bytes.
     * @return The human-readable file size string.
     * @author AnhTTH
     */
    fun readableFileSize(size: Long): String {
        if (size <= 0) return "0 B"
        val units = arrayOf("B", "kB", "MB", "GB", "TB")
        val digitGroups = (log10(size.toDouble()) / LOG_1024).toInt()
        val strBuffer = StringBuffer(
            DecimalFormat("#.##").format(
                size / 1024.0.pow(digitGroups.toDouble())
            )
        )
        return strBuffer.append(" ").append(units[digitGroups]).toString().uppercase()
    }
}