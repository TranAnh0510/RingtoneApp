package com.example.appa.ui.activity.main.favorite;

/**
 * ViewModel responsible for managing favorite items.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012J\u0010\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u001e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u001f\u001a\u00020 *\b\u0012\u0004\u0012\u00020\f0\u0017H\u0002R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/appa/ui/activity/main/favorite/FavoriteVM;", "Lcom/example/appa/ui/base/BaseViewModel;", "musicServerRepo", "Lcom/example/appa/data/repository/server/MusicServerRepo;", "favoriteRepo", "Lcom/example/appa/data/repository/favorite/FavoriteRepo;", "recentRepo", "Lcom/example/appa/data/repository/recent/RecentRepo;", "(Lcom/example/appa/data/repository/server/MusicServerRepo;Lcom/example/appa/data/repository/favorite/FavoriteRepo;Lcom/example/appa/data/repository/recent/RecentRepo;)V", "_favoritesMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/appa/data/model/ItemFavoriteUI;", "favoriteLiveData", "Landroidx/lifecycle/LiveData;", "getFavoriteLiveData", "()Landroidx/lifecycle/LiveData;", "deleteFavorite", "Lkotlinx/coroutines/Job;", "path", "", "getAllFavorite", "getValueFavourite", "", "insertRecent", "itemRecent", "Lcom/example/appa/data/model/ItemRecent;", "updatePathDownload", "context", "Landroid/content/Context;", "pathDownload", "postValueFavorite", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class FavoriteVM extends com.example.appa.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.server.MusicServerRepo musicServerRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.favorite.FavoriteRepo favoriteRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.recent.RecentRepo recentRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.appa.data.model.ItemFavoriteUI>> _favoritesMutableLiveData = null;
    
    @javax.inject.Inject()
    public FavoriteVM(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.server.MusicServerRepo musicServerRepo, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.favorite.FavoriteRepo favoriteRepo, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.recent.RecentRepo recentRepo) {
        super();
    }
    
    /**
     * Returns the LiveData object containing the list of favorite items.
     * @author AnhTTH
     */
    private final java.util.List<com.example.appa.data.model.ItemFavoriteUI> getValueFavourite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.appa.data.model.ItemFavoriteUI>> getFavoriteLiveData() {
        return null;
    }
    
    /**
     * Retrieves all favorite items and updates the LiveData.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAllFavorite() {
        return null;
    }
    
    /**
     * Deletes the favorite item with the given path.
     * @param path The path of the favorite item to be deleted.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    /**
     * Inserts a recent item into the repository and posts an update event.
     * @param itemRecent The recent item to be inserted.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertRecent(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemRecent itemRecent) {
        return null;
    }
    
    /**
     * Updates the download path for the specified item.
     * @param context      The application context.
     * @param pathDownload The new download path.
     * @param path         The path of the item to be updated.
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
     * Posts the updated list of favorite items to the LiveData.
     * @author AnhTTH
     */
    private final void postValueFavorite(java.util.List<com.example.appa.data.model.ItemFavoriteUI> $this$postValueFavorite) {
    }
}