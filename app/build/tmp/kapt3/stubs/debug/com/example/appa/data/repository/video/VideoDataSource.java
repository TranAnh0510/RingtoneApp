package com.example.appa.data.repository.video;

/**
 * Interface representing a data source for fetching video data.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/appa/data/repository/video/VideoDataSource;", "", "fetchGalleryVideos", "", "Lcom/example/appa/data/repository/video/model/ItemVideo;", "limit", "", "offset", "typeSort", "isDecending", "", "app_debug"})
public abstract interface VideoDataSource {
    
    /**
     * Fetches a list of videos from the gallery with specified parameters.
     * @param limit The maximum number of videos to fetch.
     * @param offset The starting point to fetch videos from (useful for pagination).
     * @param typeSort The type of sorting to apply (e.g., by date, name, etc.).
     * @param isDecending Whether the sorting should be in descending order. If `false`, sorting will be in ascending order.
     * @return A list of videos matching the specified criteria.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.appa.data.repository.video.model.ItemVideo> fetchGalleryVideos(int limit, int offset, int typeSort, boolean isDecending);
}