package com.example.appa.ui.activity.main.ringtones.ringtonemore.video;

/**
 * ViewModel for managing video data.
 * @param videoRepo The repository for accessing video data.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/appa/ui/activity/main/ringtones/ringtonemore/video/VideoVM;", "Lcom/example/appa/ui/base/BaseViewModel;", "videoRepo", "Lcom/example/appa/data/repository/video/VideoRepo;", "(Lcom/example/appa/data/repository/video/VideoRepo;)V", "_allVideoMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/paging/PagingData;", "Lcom/example/appa/data/repository/video/model/ItemVideo;", "allVideoLiveData", "Landroidx/lifecycle/LiveData;", "getAllVideoLiveData", "()Landroidx/lifecycle/LiveData;", "isAscending", "", "()Z", "setAscending", "(Z)V", "typeSort", "", "getTypeSort", "()I", "setTypeSort", "(I)V", "getAllVideo", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class VideoVM extends com.example.appa.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.video.VideoRepo videoRepo = null;
    private boolean isAscending = true;
    private int typeSort = 1;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<androidx.paging.PagingData<com.example.appa.data.repository.video.model.ItemVideo>> _allVideoMutableLiveData = null;
    
    @javax.inject.Inject()
    public VideoVM(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.video.VideoRepo videoRepo) {
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
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.example.appa.data.repository.video.model.ItemVideo>> getAllVideoLiveData() {
        return null;
    }
    
    /**
     * Retrieves all video data.
     * @author AnhTTH
     */
    public final void getAllVideo() {
    }
}