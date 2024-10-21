package com.example.appa.data.repository.video

import androidx.paging.PagingSource
import com.example.appa.data.repository.video.model.ItemVideo

/**
 * Interface representing a repository for managing video data.
 */
interface VideoRepo {
    /**
     * Retrieves a paging source for gallery videos with specified sorting parameters.
     * @param typeSort The type of sorting to apply (e.g., by date, name, etc.).
     * @param isDecending Whether the sorting should be in descending order.
     * If `false`, sorting will be in ascending order.
     * @return A [PagingSource] that provides paginated video items.
     * @author AnhTTH
     */
    fun getGalleryVideoPagingSource(
        typeSort: Int, isDecending: Boolean
    ): PagingSource<Int, ItemVideo>

}