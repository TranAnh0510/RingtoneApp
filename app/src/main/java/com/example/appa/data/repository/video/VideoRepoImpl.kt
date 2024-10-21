package com.example.appa.data.repository.video

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.appa.data.repository.video.model.ItemVideo
import javax.inject.Inject

/**
 * Implementation of the [VideoRepo] interface for managing video data.
 * @property videoDataSource The data source for fetching video data.
 * @author AnhTTH
 */
class VideoRepoImpl @Inject constructor(
    private val videoDataSource: VideoDataSource,
) : VideoRepo {
    /**
     * Retrieves a paging source for gallery videos with specified sorting parameters.
     * @param typeSort The type of sorting to apply (e.g., by date, name, etc.).
     * @param isDecending Whether the sorting should be in descending order.
     * If `false`, sorting will be in ascending order.
     * @return A [PagingSource] that provides paginated video items.
     * @author AnhTTH
     */
    override fun getGalleryVideoPagingSource(
        typeSort: Int, isDecending: Boolean
    ): PagingSource<Int, ItemVideo> {
        return object : PagingSource<Int, ItemVideo>() {
            /**
             * Returns the key for the page to be refreshed.
             * @param state The current paging state.
             * @return The key for the page to be refreshed, or `null` if no key is found.
             * @author AnhTTH
             */

            override fun getRefreshKey(state: PagingState<Int, ItemVideo>): Int? {
                return state.anchorPosition?.let { anchorPosition ->
                    val anchorPage = state.closestPageToPosition(anchorPosition)
                    anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
                }
            }

            /**
             * Loads a page of data.
             * @param params The parameters for loading the data.
             * @return The result of the load operation, either a page of data or an error.
             * @author AnhTTH
             */
            override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ItemVideo> {
                return try {
                    val pageNumber = params.key ?: 0
                    val response = videoDataSource.fetchGalleryVideos(
                        params.loadSize, pageNumber * params.loadSize, typeSort, isDecending
                    )

                    LoadResult.Page(
                        data = response,
                        prevKey = if (pageNumber == 0) null else pageNumber - 1,
                        nextKey = if (response.isEmpty()) null else pageNumber + 1
                    )
                } catch (e: Exception) {
                    LoadResult.Error(e)
                }
            }
        }
    }
}