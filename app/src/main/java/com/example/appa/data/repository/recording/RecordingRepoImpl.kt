package com.example.appa.data.repository.recording

import android.content.Context
import com.example.appa.data.model.ItemRecordingUI
import javax.inject.Inject

/**
 * Implementation of the [RecordingRepo] interface responsible for managing recorded items.
 * @author AnhTTH
 */
class RecordingRepoImpl @Inject constructor() : RecordingRepo {
    /**
     * Retrieves a list of recorded items from room database.
     * @param context The application context.
     * @return A list of [ItemRecordingUI] objects representing recorded items.
     * @author AnhTTH
     */
    override fun getListRecording(context: Context): List<ItemRecordingUI> {
        val listNew: MutableList<ItemRecordingUI> = mutableListOf()
        listNew.add(
            ItemRecordingUI(
                id = 1, nameRecording = "Cheri 1", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 2, nameRecording = "Cheri 2", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 3, nameRecording = "Cheri 3", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 4, nameRecording = "Cheri 4", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 5, nameRecording = "Cheri 5", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 6, nameRecording = "Cheri 6", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 7, nameRecording = "Cheri 7", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 8, nameRecording = "Cheri 8", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 9, nameRecording = "Cheri 9", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 10, nameRecording = "Cheri 10", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 11, nameRecording = "Cheri 11", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 12, nameRecording = "Cheri 12", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 13, nameRecording = "Cheri 13", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 14, nameRecording = "Cheri 14", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 15, nameRecording = "Cheri 15", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 16, nameRecording = "Cheri 16", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 17, nameRecording = "Cheri 17", date = "21/12/2002", sizeData = 567f
            )
        )
        listNew.add(
            ItemRecordingUI(
                id = 18, nameRecording = "Cheri 18", date = "21/12/2002", sizeData = 567f
            )
        )
        return listNew
    }
}