package com.example.appa.data.repository.video;

/**
 * Implementation of the [VideoRepo] interface for managing video data.
 * @property videoDataSource The data source for fetching video data.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/appa/data/repository/video/VideoRepoImpl;", "Lcom/example/appa/data/repository/video/VideoRepo;", "videoDataSource", "Lcom/example/appa/data/repository/video/VideoDataSource;", "(Lcom/example/appa/data/repository/video/VideoDataSource;)V", "getGalleryVideoPagingSource", "Landroidx/paging/PagingSource;", "", "Lcom/example/appa/data/repository/video/model/ItemVideo;", "typeSort", "isDecending", "", "app_debug"})
public final class VideoRepoImpl implements com.example.appa.data.repository.video.VideoRepo {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.video.VideoDataSource videoDataSource = null;
    
    @javax.inject.Inject()
    public VideoRepoImpl(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.video.VideoDataSource videoDataSource) {
        super();
    }
    
    /**
     * Retrieves a paging source for gallery videos with specified sorting parameters.
     * @param typeSort The type of sorting to apply (e.g., by date, name, etc.).
     * @param isDecending Whether the sorting should be in descending order.
     * If `false`, sorting will be in ascending order.
     * @return A [PagingSource] that provides paginated video items.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.paging.PagingSource<java.lang.Integer, com.example.appa.data.repository.video.model.ItemVideo> getGalleryVideoPagingSource(int typeSort, boolean isDecending) {
        return null;
    }
}