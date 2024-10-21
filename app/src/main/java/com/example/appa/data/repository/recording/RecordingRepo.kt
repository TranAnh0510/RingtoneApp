package com.example.appa.data.repository.recording

import android.content.Context
import com.example.appa.data.model.ItemRecordingUI

/**
 * Repository interface for managing recordings.
 * @author AnhTTH
 */
interface RecordingRepo {
    /**
     * Retrieves a list of recorded items from room database.
     * @param context The application context.
     * @return A list of [ItemRecordingUI] objects representing recorded items.
     * @author AnhTTH
     */
    fun getListRecording(context: Context): List<ItemRecordingUI>
}