package com.example.appa.data.repository.video

import com.example.appa.data.repository.video.model.ItemVideo

/**
 * Interface representing a data source for fetching video data.
 * @author AnhTTH
 */
interface VideoDataSource {
    /**
     * Fetches a list of videos from the gallery with specified parameters.
     * @param limit The maximum number of videos to fetch.
     * @param offset The starting point to fetch videos from (useful for pagination).
     * @param typeSort The type of sorting to apply (e.g., by date, name, etc.).
     * @param isDecending Whether the sorting should be in descending order. If `false`, sorting will be in ascending order.
     * @return A list of videos matching the specified criteria.
     * @author AnhTTH
     */
    fun fetchGalleryVideos(
        limit: Int, offset: Int, typeSort: Int, isDecending: Boolean
    ): List<ItemVideo>
}