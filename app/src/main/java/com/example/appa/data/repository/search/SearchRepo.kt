package com.example.appa.data.repository.search

import android.content.Context
import com.example.appa.data.model.ItemRecommend

/**
 * Repository interface for handling search history and recommendations.
 */
interface SearchRepo {
    /**
     * Inserts a search history item into room database.
     * @param item The item to insert into the search history.
     * @return The ID of the inserted item.
     * @author AnhTTH
     */
    fun insertHistory(item: ItemRecommend): Long

    /**
     * Retrieves all recommendation items from room database.
     * @param context The application context.
     * @return A list of [ItemRecommend] objects representing all recommendations.
     * @author AnhTTH
     */
    fun getALlRecommend(context: Context): List<ItemRecommend>
}