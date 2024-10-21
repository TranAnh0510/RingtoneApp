package com.example.appa.ui.activity.main.search;

/**
 * ViewModel for managing search-related operations and data.
 * @author AnhTTh
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001fH\u0002J\u000e\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\u001aJ\u001e\u0010(\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001aJ&\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0\rH\u0002J\u0012\u0010,\u001a\u00020-*\b\u0012\u0004\u0012\u00020\u00100\rH\u0002J\u0012\u0010.\u001a\u00020-*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/example/appa/ui/activity/main/search/SearchVM;", "Lcom/example/appa/ui/base/BaseViewModel;", "musicServerRepo", "Lcom/example/appa/data/repository/server/MusicServerRepo;", "searchRepo", "Lcom/example/appa/data/repository/search/SearchRepo;", "recentRepo", "Lcom/example/appa/data/repository/recent/RecentRepo;", "favoriteRepo", "Lcom/example/appa/data/repository/favorite/FavoriteRepo;", "(Lcom/example/appa/data/repository/server/MusicServerRepo;Lcom/example/appa/data/repository/search/SearchRepo;Lcom/example/appa/data/repository/recent/RecentRepo;Lcom/example/appa/data/repository/favorite/FavoriteRepo;)V", "_listMusicMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/appa/data/model/musicserver/MusicServerUI;", "_recommendMutableLiveData", "Lcom/example/appa/data/model/ItemRecommend;", "listMusicLiveData", "Landroidx/lifecycle/LiveData;", "getListMusicLiveData", "()Landroidx/lifecycle/LiveData;", "recommendLiveData", "getRecommendLiveData", "deleteFavorite", "Lkotlinx/coroutines/Job;", "path", "", "getDataRecommend", "context", "Landroid/content/Context;", "getValueSearchDetail", "", "insertFavorite", "itemFavoriteUI", "Lcom/example/appa/data/model/ItemFavoriteUI;", "insertRecent", "itemRecent", "Lcom/example/appa/data/model/ItemRecent;", "searchMusicWithKey", "query", "updatePathDownload", "pathDownload", "markFavorites", "favourites", "postValueDataTextSearch", "", "postValueSearch", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SearchVM extends com.example.appa.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.server.MusicServerRepo musicServerRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.search.SearchRepo searchRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.recent.RecentRepo recentRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.favorite.FavoriteRepo favoriteRepo = null;
    
    /**
     * LiveData for recommended items.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.appa.data.model.ItemRecommend>> _recommendMutableLiveData = null;
    
    /**
     * LiveData for the list of music server UI items.
     * @author AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.appa.data.model.musicserver.MusicServerUI>> _listMusicMutableLiveData = null;
    
    @javax.inject.Inject()
    public SearchVM(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.server.MusicServerRepo musicServerRepo, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.search.SearchRepo searchRepo, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.recent.RecentRepo recentRepo, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.favorite.FavoriteRepo favoriteRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.appa.data.model.ItemRecommend>> getRecommendLiveData() {
        return null;
    }
    
    /**
     * Gets a copy of the list of music server UI items.
     * @author AnhTTH
     */
    private final java.util.List<com.example.appa.data.model.musicserver.MusicServerUI> getValueSearchDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.appa.data.model.musicserver.MusicServerUI>> getListMusicLiveData() {
        return null;
    }
    
    /**
     * Fetches recommended data from the search repository.
     * @param context the context in which the function is called
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getDataRecommend(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Posts the list of recommended items to the MutableLiveData.
     * @author AnhTTH
     */
    private final void postValueDataTextSearch(java.util.List<com.example.appa.data.model.ItemRecommend> $this$postValueDataTextSearch) {
    }
    
    /**
     * Searches for music with the specified query.
     * @param context the context in which the function is called
     * @param query the search query
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job searchMusicWithKey(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    /**
     * Inserts a recent item into the database.
     * @param itemRecent the recent item to insert
     * @author AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertRecent(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemRecent itemRecent) {
        return null;
    }
    
    /**
     * Inserts a favorite item into the database.
     * @param itemFavoriteUI the favorite item to insert
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertFavorite(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemFavoriteUI itemFavoriteUI) {
        return null;
    }
    
    /**
     * Deletes a favorite item from the database.
     * @param path the path of the favorite item to delete
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    /**
     * Marks the favorite items in the list of music server UI items.
     * @param favourites the list of favorite items
     * @return the updated list of music server UI items
     * @author AnhTTH
     */
    private final java.util.List<com.example.appa.data.model.musicserver.MusicServerUI> markFavorites(java.util.List<com.example.appa.data.model.musicserver.MusicServerUI> $this$markFavorites, java.util.List<com.example.appa.data.model.ItemFavoriteUI> favourites) {
        return null;
    }
    
    /**
     * Updates the download path for a music item.
     * @param context the context in which the function is called
     * @param pathDownload the new download path
     * @param path the original path of the music item
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updatePathDownload(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String pathDownload, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    /**
     * Posts the updated list of music server UI items.
     * @author AnhTTH
     */
    private final void postValueSearch(java.util.List<com.example.appa.data.model.musicserver.MusicServerUI> $this$postValueSearch) {
    }
}