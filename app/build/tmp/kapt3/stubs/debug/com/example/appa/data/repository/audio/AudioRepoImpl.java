package com.example.appa.data.repository.audio;

/**
 * Implementation of the [AudioRepo] interface responsible for providing a paging source
 * to retrieve audio items from the gallery.
 * @property audioDataSource The data source for fetching audio items.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/appa/data/repository/audio/AudioRepoImpl;", "Lcom/example/appa/data/repository/audio/AudioRepo;", "audioDataSource", "Lcom/example/appa/data/repository/audio/AudioDataSource;", "(Lcom/example/appa/data/repository/audio/AudioDataSource;)V", "getGalleryAudioPagingSource", "Landroidx/paging/PagingSource;", "", "Lcom/example/appa/data/model/ItemAudio;", "typeSort", "isDecending", "", "app_debug"})
public final class AudioRepoImpl implements com.example.appa.data.repository.audio.AudioRepo {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.audio.AudioDataSource audioDataSource = null;
    
    @javax.inject.Inject()
    public AudioRepoImpl(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.audio.AudioDataSource audioDataSource) {
        super();
    }
    
    /**
     * Provides a paging source for retrieving audio items from the gallery with specified sorting options.
     * @param typeSort The type of sorting to apply (e.g., by name, date, etc.).
     * @param isDescending Whether the sorting should be in descending order.
     * @return A [PagingSource] object for paginated retrieval of [ItemAudio] items.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.paging.PagingSource<java.lang.Integer, com.example.appa.data.model.ItemAudio> getGalleryAudioPagingSource(int typeSort, boolean isDecending) {
        return null;
    }
}