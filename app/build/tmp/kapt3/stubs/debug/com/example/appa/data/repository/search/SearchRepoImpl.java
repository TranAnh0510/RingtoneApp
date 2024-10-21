package com.example.appa.data.repository.search;

/**
 * Repository interface for handling search history and recommendations.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/appa/data/repository/search/SearchRepoImpl;", "Lcom/example/appa/data/repository/search/SearchRepo;", "searchDao", "Lcom/example/appa/data/local/room/SearchDao;", "(Lcom/example/appa/data/local/room/SearchDao;)V", "getALlRecommend", "", "Lcom/example/appa/data/model/ItemRecommend;", "context", "Landroid/content/Context;", "insertHistory", "", "item", "app_debug"})
public final class SearchRepoImpl implements com.example.appa.data.repository.search.SearchRepo {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.local.room.SearchDao searchDao = null;
    
    @javax.inject.Inject()
    public SearchRepoImpl(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.SearchDao searchDao) {
        super();
    }
    
    /**
     * Inserts a search history item into room database.
     * @param item The item to insert into the search history.
     * @return The ID of the inserted item.
     * @author AnhTTH
     */
    @java.lang.Override()
    public long insertHistory(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemRecommend item) {
        return 0L;
    }
    
    /**
     * Retrieves all recommendation items from room database.
     * @param context The application context.
     * @return A list of [ItemRecommend] objects representing all recommendations.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.appa.data.model.ItemRecommend> getALlRecommend(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}