package com.example.appa.ui.activity.main.ringtones;

/**
 * ViewModel class for managing ringtone-related data and operations.
 * @property recentRepo The repository for recent items.
 * @property musicServerRepo The repository for music server operations.
 * @property favoriteRepo The repository for favorite items.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0018J\u0010\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001eH\u0002J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0012\u0010#\u001a\u00020$*\b\u0012\u0004\u0012\u00020\u000e0\u001eH\u0002J\u0012\u0010%\u001a\u00020$*\b\u0012\u0004\u0012\u00020\u00100\u001eH\u0002R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/appa/ui/activity/main/ringtones/RingtoneVM;", "Lcom/example/appa/ui/base/BaseViewModel;", "recentRepo", "Lcom/example/appa/data/repository/recent/RecentRepo;", "musicServerRepo", "Lcom/example/appa/data/repository/server/MusicServerRepo;", "favoriteRepo", "Lcom/example/appa/data/repository/favorite/FavoriteRepo;", "application", "Landroid/app/Application;", "(Lcom/example/appa/data/repository/recent/RecentRepo;Lcom/example/appa/data/repository/server/MusicServerRepo;Lcom/example/appa/data/repository/favorite/FavoriteRepo;Landroid/app/Application;)V", "_categoryMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/appa/data/model/musicserver/MusicServerCategoriesUI;", "_recentMutableLiveData", "Lcom/example/appa/data/model/ItemRecent;", "categoryLiveData", "Landroidx/lifecycle/LiveData;", "getCategoryLiveData", "()Landroidx/lifecycle/LiveData;", "recentLiveData", "getRecentLiveData", "deleteFavorite", "Lkotlinx/coroutines/Job;", "path", "", "getAllCategory", "getAllRecent", "getValueRecent", "", "insertFavorite", "itemFavoriteUI", "Lcom/example/appa/data/model/ItemFavoriteUI;", "updateTimeRecent", "postValueCategory", "", "postValueRecent", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class RingtoneVM extends com.example.appa.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.recent.RecentRepo recentRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.server.MusicServerRepo musicServerRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.favorite.FavoriteRepo favoriteRepo = null;
    @org.jetbrains.annotations.NotNull()
    private android.app.Application application;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.appa.data.model.ItemRecent>> _recentMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.appa.data.model.musicserver.MusicServerCategoriesUI>> _categoryMutableLiveData = null;
    
    @javax.inject.Inject()
    public RingtoneVM(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.recent.RecentRepo recentRepo, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.server.MusicServerRepo musicServerRepo, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.favorite.FavoriteRepo favoriteRepo, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    /**
     * Returns a [MutableLiveData] object containing a list of recent items.
     * @return A [MutableLiveData] object containing a list of recent items.
     * @author AnhTTH
     */
    private final java.util.List<com.example.appa.data.model.ItemRecent> getValueRecent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.appa.data.model.ItemRecent>> getRecentLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.appa.data.model.musicserver.MusicServerCategoriesUI>> getCategoryLiveData() {
        return null;
    }
    
    /**
     * Retrieves all recent items from the repository and updates the corresponding LiveData.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAllRecent() {
        return null;
    }
    
    /**
     * Retrieves all music server categories from the repository and updates the corresponding LiveData.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAllCategory() {
        return null;
    }
    
    /**
     * Updates the time of a recent item in the repository and LiveData.
     * @param path The path of the recent item.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateTimeRecent(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    /**
     * Extension function to post the value of a list of [MusicServerCategoriesUI] to the corresponding LiveData.
     * @author AnhTTH
     */
    private final void postValueCategory(java.util.List<com.example.appa.data.model.musicserver.MusicServerCategoriesUI> $this$postValueCategory) {
    }
    
    /**
     * Extension function to post the value of a list of [ItemRecent] to the corresponding LiveData.
     * @author AnhTTH
     */
    private final void postValueRecent(java.util.List<com.example.appa.data.model.ItemRecent> $this$postValueRecent) {
    }
    
    /**
     * Inserts a favorite item into the repository and updates the LiveData.
     * @param itemFavoriteUI The favorite item to be inserted.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertFavorite(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemFavoriteUI itemFavoriteUI) {
        return null;
    }
    
    /**
     * Deletes a favorite item from the repository and updates the LiveData.
     * @param path The path of the favorite item to be deleted.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
}