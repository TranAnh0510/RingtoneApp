package com.example.appa.data.repository.audio

import androidx.paging.PagingSource
import com.example.appa.data.model.ItemAudio

/**
 * Repository interface for accessing paginated audio data from a gallery source.
 * @author AnhTTH
 */
interface AudioRepo {
    /**
     * Provides a paging source for retrieving audio items from the gallery with specified sorting options.
     * @param typeSort The type of sorting to apply (e.g., by name, date, etc.).
     * @param isDescending Whether the sorting should be in descending order.
     * @return A [PagingSource] object for paginated retrieval of [ItemAudio] items.
     * @author AnhTTH
     */
    fun getGalleryAudioPagingSource(
        typeSort: Int, isDecending: Boolean
    ): PagingSource<Int, ItemAudio>

}