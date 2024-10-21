package com.example.appa.ui.activity.main.ringtones.recent;

/**
 * manages the data and logic related to the list of recent items
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012J\u0010\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\fJ\u001e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014J&\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bH\u0002J\u0012\u0010#\u001a\u00020$*\b\u0012\u0004\u0012\u00020\f0\u0017H\u0002R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/appa/ui/activity/main/ringtones/recent/RecentVM;", "Lcom/example/appa/ui/base/BaseViewModel;", "musicServerRepo", "Lcom/example/appa/data/repository/server/MusicServerRepo;", "recentRepo", "Lcom/example/appa/data/repository/recent/RecentRepo;", "favoriteRepo", "Lcom/example/appa/data/repository/favorite/FavoriteRepo;", "(Lcom/example/appa/data/repository/server/MusicServerRepo;Lcom/example/appa/data/repository/recent/RecentRepo;Lcom/example/appa/data/repository/favorite/FavoriteRepo;)V", "_dataRecentMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/appa/data/model/ItemRecent;", "dataRecentListLiveData", "Landroidx/lifecycle/LiveData;", "getDataRecentListLiveData", "()Landroidx/lifecycle/LiveData;", "deleteFavorite", "Lkotlinx/coroutines/Job;", "path", "", "getDataRecent", "getValueDataRecent", "", "insertFavorite", "itemFavoriteUI", "Lcom/example/appa/data/model/ItemFavoriteUI;", "insertRecent", "itemRecent", "updatePathDownload", "context", "Landroid/content/Context;", "pathDownload", "markFavorites", "favourites", "postValueRecent", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class RecentVM extends com.example.appa.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.server.MusicServerRepo musicServerRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.recent.RecentRepo recentRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.favorite.FavoriteRepo favoriteRepo = null;
    
    /**
     * MutableLiveData to store a list of recent items.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.appa.data.model.ItemRecent>> _dataRecentMutableLiveData = null;
    
    @javax.inject.Inject()
    public RecentVM(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.server.MusicServerRepo musicServerRepo, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.recent.RecentRepo recentRepo, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.favorite.FavoriteRepo favoriteRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.appa.data.model.ItemRecent>> getDataRecentListLiveData() {
        return null;
    }
    
    private final java.util.List<com.example.appa.data.model.ItemRecent> getValueDataRecent() {
        return null;
    }
    
    /**
     * Get data from repository in background thread
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getDataRecent() {
        return null;
    }
    
    /**
     * adds the isFavorite attribute to recent items if they are in the favorites list
     * @author AnhTTH
     */
    private final java.util.List<com.example.appa.data.model.ItemRecent> markFavorites(java.util.List<com.example.appa.data.model.ItemRecent> $this$markFavorites, java.util.List<com.example.appa.data.model.ItemFavoriteUI> favourites) {
        return null;
    }
    
    /**
     * handles adding favorites into database
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertFavorite(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemFavoriteUI itemFavoriteUI) {
        return null;
    }
    
    /**
     * remove favorites from database using path
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    /**
     * Update the download path in the database
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
     * recentRepo's insertRecent method to add a recent item (itemRecent) to the database
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertRecent(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemRecent itemRecent) {
        return null;
    }
    
    /**
     * Update the value for itemRecent
     * @author AnhTTH
     */
    private final void postValueRecent(java.util.List<com.example.appa.data.model.ItemRecent> $this$postValueRecent) {
    }
}