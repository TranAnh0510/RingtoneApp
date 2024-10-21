package com.example.appa.data.repository.video;

/**
 * Interface representing a repository for managing video data.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/appa/data/repository/video/VideoRepo;", "", "getGalleryVideoPagingSource", "Landroidx/paging/PagingSource;", "", "Lcom/example/appa/data/repository/video/model/ItemVideo;", "typeSort", "isDecending", "", "app_debug"})
public abstract interface VideoRepo {
    
    /**
     * Retrieves a paging source for gallery videos with specified sorting parameters.
     * @param typeSort The type of sorting to apply (e.g., by date, name, etc.).
     * @param isDecending Whether the sorting should be in descending order.
     * If `false`, sorting will be in ascending order.
     * @return A [PagingSource] that provides paginated video items.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.example.appa.data.repository.video.model.ItemVideo> getGalleryVideoPagingSource(int typeSort, boolean isDecending);
}