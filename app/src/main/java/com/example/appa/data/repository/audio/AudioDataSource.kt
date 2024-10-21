package com.example.appa.data.repository.audio

import com.example.appa.data.model.ItemAudio

/**
 * Interface for accessing audio data from a gallery source.
 * @author AnhTTH
 */
interface AudioDataSource {
    /**
     * Fetches a list of audio items from the gallery with specified limits, offsets, and sorting options.
     * @param limit The maximum number of audio items to retrieve.
     * @param offset The offset from the beginning of the list to start retrieving items.
     * @param typeSort The type of sorting to apply (e.g., by name, date, etc.).
     * @param isDescending Whether the sorting should be in descending order.
     * @return A list of [ItemAudio] objects matching the specified criteria.
     * @author AnhTTH
     */
    fun fetchGalleryAudio(
        limit: Int, offset: Int, typeSort: Int, isDecending: Boolean
    ): List<ItemAudio>

}