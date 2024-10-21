package com.example.appa.data.repository.search;

/**
 * Repository interface for handling search history and recommendations.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H&\u00a8\u0006\n"}, d2 = {"Lcom/example/appa/data/repository/search/SearchRepo;", "", "getALlRecommend", "", "Lcom/example/appa/data/model/ItemRecommend;", "context", "Landroid/content/Context;", "insertHistory", "", "item", "app_debug"})
public abstract interface SearchRepo {
    
    /**
     * Inserts a search history item into room database.
     * @param item The item to insert into the search history.
     * @return The ID of the inserted item.
     * @author AnhTTH
     */
    public abstract long insertHistory(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemRecommend item);
    
    /**
     * Retrieves all recommendation items from room database.
     * @param context The application context.
     * @return A list of [ItemRecommend] objects representing all recommendations.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.appa.data.model.ItemRecommend> getALlRecommend(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
}