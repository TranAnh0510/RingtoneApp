package com.example.appa.data.repository.server;

/**
 * Repository interface for managing music server data in the application.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\nH&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nH&J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&\u00a8\u0006\u0011"}, d2 = {"Lcom/example/appa/data/repository/server/MusicServerRepo;", "", "getALlCategory", "", "Lcom/example/appa/data/model/musicserver/MusicServerCategoriesUI;", "context", "Landroid/content/Context;", "getALlListMusic", "Lcom/example/appa/data/model/musicserver/MusicServerUI;", "category", "", "getListMusicSearch", "query", "updatePathDownload", "", "pathDownload", "path", "app_debug"})
public abstract interface MusicServerRepo {
    
    /**
     * Retrieves all music categories from the music server.
     * @param context the context used for accessing resources or system services.
     * @return a list of all music categories.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.appa.data.model.musicserver.MusicServerCategoriesUI> getALlCategory(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    /**
     * Retrieves all music items belonging to a specific category from the music server.
     * @param category the category for which music items are to be retrieved.
     * @return a list of all music items in the specified category.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.appa.data.model.musicserver.MusicServerUI> getALlListMusic(@org.jetbrains.annotations.NotNull()
    java.lang.String category);
    
    /**
     * Searches for music items based on the provided query.
     * @param context the context used for accessing resources or system services.
     * @param query the search query.
     * @return a list of music items matching the search query.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.appa.data.model.musicserver.MusicServerUI> getListMusicSearch(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    /**
     * Updates the download path of a music item in the music server.
     * @param context the context used for accessing resources or system services.
     * @param pathDownload the new download path for the music item.
     * @param path the path of the music item to be updated.
     * @return true if the update was successful, false otherwise.
     * @author AnhTTH
     */
    public abstract boolean updatePathDownload(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String pathDownload, @org.jetbrains.annotations.NotNull()
    java.lang.String path);
}