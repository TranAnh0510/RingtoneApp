package com.example.appa.data.repository.audio;

/**
 * Repository interface for accessing paginated audio data from a gallery source.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/appa/data/repository/audio/AudioRepo;", "", "getGalleryAudioPagingSource", "Landroidx/paging/PagingSource;", "", "Lcom/example/appa/data/model/ItemAudio;", "typeSort", "isDecending", "", "app_debug"})
public abstract interface AudioRepo {
    
    /**
     * Provides a paging source for retrieving audio items from the gallery with specified sorting options.
     * @param typeSort The type of sorting to apply (e.g., by name, date, etc.).
     * @param isDescending Whether the sorting should be in descending order.
     * @return A [PagingSource] object for paginated retrieval of [ItemAudio] items.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.example.appa.data.model.ItemAudio> getGalleryAudioPagingSource(int typeSort, boolean isDecending);
}