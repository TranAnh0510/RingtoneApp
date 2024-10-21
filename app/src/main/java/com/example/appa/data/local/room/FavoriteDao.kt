package com.example.appa.data.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.appa.data.model.ItemFavoriteUI

/**
 * Data Access Object (DAO) interface for accessing favorite items in the database.
 * @author AnhTTH
 */
@Dao
interface FavoriteDao {

    // Truy vấn tất cả các mục yêu thích từ bảng ItemFavoriteUI và sắp xếp theo thứ tự giảm dần của id
    @Query("select * from ItemFavoriteUI ORDER BY id DESC")
    fun getALlFavorite(): List<ItemFavoriteUI>

    //Thêm một mục yêu thích vào bảng ItemFavoriteUI và trả về giá trị id của mục đã được thêm
    @Insert
    fun insertFavorite(itemFavorite: ItemFavoriteUI): Long

    // Xóa một mục yêu thích khỏi bảng ItemFavoriteUI dựa trên đường dẫn (path) của mục đó
    @Query("DELETE FROM ItemFavoriteUI where path=:path")
    fun deleteFavourite(path: String)

    // Cập nhật giá trị pathDownload cho mục yêu thích dựa trên đường dẫn (path) của mục đó
    @Query("Update ItemFavoriteUI set pathDownload=:pathDownload where path=:path")
    fun updatePathDownload(pathDownload: String, path: String)
}