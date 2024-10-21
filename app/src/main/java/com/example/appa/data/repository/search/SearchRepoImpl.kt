package com.example.appa.data.repository.search

import android.content.Context
import com.example.appa.R
import com.example.appa.data.local.room.SearchDao
import com.example.appa.data.model.ItemRecommend
import javax.inject.Inject

/**
 * Repository interface for handling search history and recommendations.
 * @author AnhTTH
 */
class SearchRepoImpl @Inject constructor(private val searchDao: SearchDao) : SearchRepo {
    /**
     * Inserts a search history item into room database.
     * @param item The item to insert into the search history.
     * @return The ID of the inserted item.
     * @author AnhTTH
     */
    override fun insertHistory(item: ItemRecommend): Long {
        return (searchDao.insertHistory(item))

    }

    /**
     * Retrieves all recommendation items from room database.
     * @param context The application context.
     * @return A list of [ItemRecommend] objects representing all recommendations.
     * @author AnhTTH
     */
    override fun getALlRecommend(context: Context): List<ItemRecommend> {

        val listNew: MutableList<ItemRecommend> = mutableListOf<ItemRecommend>().apply {
            add(
                ItemRecommend(
                    nameOriginal = "Hip hop", nameRecommend = context.getString(R.string.hiphop)
                )
            )
            add(
                ItemRecommend(
                    nameOriginal = "Beatboxer",
                    nameRecommend = context.getString(R.string.beatboxer)
                )
            )
            add(
                ItemRecommend(
                    nameOriginal = "Dance", nameRecommend = context.getString(R.string.dance)
                )
            )
            add(
                ItemRecommend(
                    nameOriginal = "Love", nameRecommend = context.getString(R.string.love)
                )
            )
            add(
                ItemRecommend(
                    nameOriginal = "Happy", nameRecommend = context.getString(R.string.happy)
                )
            )
            add(
                ItemRecommend(
                    nameOriginal = "Bass", nameRecommend = context.getString(R.string.bass)
                )
            )
            add(
                ItemRecommend(
                    nameOriginal = "Rock", nameRecommend = context.getString(R.string.rock)
                )
            )
            add(
                ItemRecommend(
                    nameOriginal = "Fun", nameRecommend = context.getString(R.string.funn)
                )
            )
            add(
                ItemRecommend(
                    nameOriginal = "Beat", nameRecommend = context.getString(R.string.beat)
                )
            )


        }
        return listNew
    }


}