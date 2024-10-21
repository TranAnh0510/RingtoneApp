package com.example.appa.ui.activity.main.ringtones.ringtonemore.audio;

/**
 * ViewModel class responsible for managing audio data in the UI.
 * It interacts with the AudioRepo to retrieve audio data and exposes LiveData
 * to observe changes in the audio data.
 * @param audioRepo The repository for handling audio data operations.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001a"}, d2 = {"Lcom/example/appa/ui/activity/main/ringtones/ringtonemore/audio/AudioVM;", "Lcom/example/appa/ui/base/BaseViewModel;", "audioRepo", "Lcom/example/appa/data/repository/audio/AudioRepo;", "(Lcom/example/appa/data/repository/audio/AudioRepo;)V", "_allAudioMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/paging/PagingData;", "Lcom/example/appa/data/model/ItemAudio;", "allAudioLiveData", "Landroidx/lifecycle/LiveData;", "getAllAudioLiveData", "()Landroidx/lifecycle/LiveData;", "isAscending", "", "()Z", "setAscending", "(Z)V", "typeSort", "", "getTypeSort", "()I", "setTypeSort", "(I)V", "getAllAudio", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class AudioVM extends com.example.appa.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.audio.AudioRepo audioRepo = null;
    private boolean isAscending = true;
    private int typeSort = 1;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<androidx.paging.PagingData<com.example.appa.data.model.ItemAudio>> _allAudioMutableLiveData = null;
    
    @javax.inject.Inject()
    public AudioVM(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.audio.AudioRepo audioRepo) {
        super();
    }
    
    public final boolean isAscending() {
        return false;
    }
    
    public final void setAscending(boolean p0) {
    }
    
    public final int getTypeSort() {
        return 0;
    }
    
    public final void setTypeSort(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.example.appa.data.model.ItemAudio>> getAllAudioLiveData() {
        return null;
    }
    
    /**
     * Retrieves all audio data from the repository and updates the LiveData with the latest data.
     * @author AnhTTH
     */
    public final void getAllAudio() {
    }
}