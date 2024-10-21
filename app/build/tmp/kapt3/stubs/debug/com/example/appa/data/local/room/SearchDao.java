package com.example.appa.data.local.room;

/**
 * Data Access Object (DAO) for managing search-related operations on the database.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/appa/data/local/room/SearchDao;", "", "getALlRecent", "", "Lcom/example/appa/data/model/ItemRecommend;", "insertHistory", "", "itemSearch", "app_debug"})
@androidx.room.Dao()
public abstract interface SearchDao {
    
    /**
     * Retrieves all recent items from the ItemRecommend table ordered by ID in descending order.
     * @return A list of [ItemRecommend] objects representing recent search items.
     * @author AnhTTH
     */
    @androidx.room.Query(value = "SELECT * FROM ItemRecommend ORDER BY id DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.appa.data.model.ItemRecommend> getALlRecent();
    
    /**
     * Inserts a new search item into the ItemRecommend table at room database.
     * @param itemSearch The [ItemRecommend] object to be inserted.
     * @return The row ID of the newly inserted item.
     * @author AnhTTH
     */
    @androidx.room.Insert()
    public abstract long insertHistory(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemRecommend itemSearch);
}