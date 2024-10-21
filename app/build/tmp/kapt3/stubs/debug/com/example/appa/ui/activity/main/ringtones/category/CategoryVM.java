package com.example.appa.ui.activity.main.ringtones.category;

/**
 * ViewModel class for managing category-related operations.
 * Uses Hilt for dependency injection to provide dependencies for MusicServerRepo, RecentRepo, and FavoriteRepo.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014J\u0010\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eJ\u001e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014J&\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bH\u0002J\u0012\u0010%\u001a\u00020&*\b\u0012\u0004\u0012\u00020\f0\u0018H\u0002R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/appa/ui/activity/main/ringtones/category/CategoryVM;", "Lcom/example/appa/ui/base/BaseViewModel;", "musicServerRepo", "Lcom/example/appa/data/repository/server/MusicServerRepo;", "recentRepo", "Lcom/example/appa/data/repository/recent/RecentRepo;", "favoriteRepo", "Lcom/example/appa/data/repository/favorite/FavoriteRepo;", "(Lcom/example/appa/data/repository/server/MusicServerRepo;Lcom/example/appa/data/repository/recent/RecentRepo;Lcom/example/appa/data/repository/favorite/FavoriteRepo;)V", "_categoryMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/appa/data/model/musicserver/MusicServerUI;", "categoryLiveData", "Landroidx/lifecycle/LiveData;", "getCategoryLiveData", "()Landroidx/lifecycle/LiveData;", "deleteFavorite", "Lkotlinx/coroutines/Job;", "path", "", "getDataCategory", "category", "getValueCategory", "", "insertFavorite", "itemFavoriteUI", "Lcom/example/appa/data/model/ItemFavoriteUI;", "insertRecent", "itemRecent", "Lcom/example/appa/data/model/ItemRecent;", "updatePathDownload", "context", "Landroid/content/Context;", "pathDownload", "markFavorites", "favourites", "postValueCategory", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class CategoryVM extends com.example.appa.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.server.MusicServerRepo musicServerRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.recent.RecentRepo recentRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.favorite.FavoriteRepo favoriteRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.appa.data.model.musicserver.MusicServerUI>> _categoryMutableLiveData = null;
    
    @javax.inject.Inject()
    public CategoryVM(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.server.MusicServerRepo musicServerRepo, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.recent.RecentRepo recentRepo, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.favorite.FavoriteRepo favoriteRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.appa.data.model.musicserver.MusicServerUI>> getCategoryLiveData() {
        return null;
    }
    
    private final java.util.List<com.example.appa.data.model.musicserver.MusicServerUI> getValueCategory() {
        return null;
    }
    
    /**
     * Retrieves data for a specific category from the repositories asynchronously.
     * Combines the list of all music servers with the list of favorite items to mark favorite music.
     * @param category The category for which the data is to be retrieved.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getDataCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
        return null;
    }
    
    /**
     * Inserts a recent item into the RecentRepo asynchronously.
     * Posts an update event to notify subscribers about the recent item insertion.
     * @param itemRecent The recent item to be inserted.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertRecent(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemRecent itemRecent) {
        return null;
    }
    
    /**
     * Inserts a new favorite item into the FavoriteRepo asynchronously.
     * Updates the corresponding category's LiveData to mark the item as favorite.
     * Posts an update event to notify subscribers about the favorite item insertion.
     * @param itemFavoriteUI The favorite item to be inserted.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertFavorite(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemFavoriteUI itemFavoriteUI) {
        return null;
    }
    
    /**
     * Deletes a favorite item from the FavoriteRepo asynchronously.
     * Updates the corresponding category's LiveData to mark the item as not favorite.
     * Posts an update event to notify subscribers about the favorite item deletion.
     * @param path The path of the favorite item to be deleted.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    /**
     * Updates the download path of a music item asynchronously.
     * Updates the LiveData of all categories with the new download path.
     * Posts update events to notify subscribers about the path download updates.
     * @param context The context used for updating the download path.
     * @param pathDownload The new download path.
     * @param path The original path of the music item.
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
     * Marks favorite music items in the list of music items.
     * Returns a list of music items with favorites marked.
     * @param favourites The list of favorite music items.
     * @return The list of music items with favorites marked.
     * @author AnhTTH
     */
    private final java.util.List<com.example.appa.data.model.musicserver.MusicServerUI> markFavorites(java.util.List<com.example.appa.data.model.musicserver.MusicServerUI> $this$markFavorites, java.util.List<com.example.appa.data.model.ItemFavoriteUI> favourites) {
        return null;
    }
    
    /**
     * Posts the updated list of music categories to the LiveData.
     * Sorts the list by name and updates image categories before posting.
     * @author AnhTTH
     */
    private final void postValueCategory(java.util.List<com.example.appa.data.model.musicserver.MusicServerUI> $this$postValueCategory) {
    }
}