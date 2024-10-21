package com.example.appa.data.repository.audio

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.appa.data.model.ItemAudio
import javax.inject.Inject

/**
 * Implementation of the [AudioRepo] interface responsible for providing a paging source
 * to retrieve audio items from the gallery.
 * @property audioDataSource The data source for fetching audio items.
 * @author AnhTTH
 */
class AudioRepoImpl @Inject constructor(
    private val audioDataSource: AudioDataSource,
) : AudioRepo {
    /**
     * Provides a paging source for retrieving audio items from the gallery with specified sorting options.
     * @param typeSort The type of sorting to apply (e.g., by name, date, etc.).
     * @param isDescending Whether the sorting should be in descending order.
     * @return A [PagingSource] object for paginated retrieval of [ItemAudio] items.
     * @author AnhTTH
     */
    override fun getGalleryAudioPagingSource(
        typeSort: Int, isDecending: Boolean
    ): PagingSource<Int, ItemAudio> {
        return object : PagingSource<Int, ItemAudio>() {
            /**
             * Returns the refresh key for the current state.
             * @param state The current [PagingState].
             * @return The refresh key based on the anchor position.
             * @author AnhTTH
             */
            override fun getRefreshKey(state: PagingState<Int, ItemAudio>): Int? {
                return state.anchorPosition?.let { anchorPosition ->
                    val anchorPage = state.closestPageToPosition(anchorPosition)
                    anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
                }
            }

            /**
             * Loads data for a given page.
             * @param params The load parameters, including the key and requested load size.
             * @return The result of the load operation, including loaded data and next/previous keys.
             * @author AnhTTH
             */
            override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ItemAudio> {
                return try {
                    val pageNumber = params.key ?: 1
                    val response = audioDataSource.fetchGalleryAudio(
                        params.loadSize,
                        pageNumber * params.loadSize, typeSort, isDecending
                    )
                    LoadResult.Page(
                        data = response.distinctBy { it.path },
                        prevKey = if (pageNumber == 0) null else pageNumber - 1,
                        nextKey = if (response.isEmpty()) null else pageNumber + 1
                    )
                } catch (e: Exception) {
                    e.printStackTrace()
                    LoadResult.Error(e)
                }
            }

        }
    }
}
