package com.example.appa.ui.activity.main.ringtones.ringtonemore.record;

/**
 * ViewModel for managing recorded audio data.
 * @param recordingRepo The repository for accessing recorded audio data.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/appa/ui/activity/main/ringtones/ringtonemore/record/RecordVM;", "Lcom/example/appa/ui/base/BaseViewModel;", "recordingRepo", "Lcom/example/appa/data/repository/recording/RecordingRepo;", "(Lcom/example/appa/data/repository/recording/RecordingRepo;)V", "_dataRecordMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/appa/data/model/ItemRecordingUI;", "dataRecordListLiveData", "Landroidx/lifecycle/LiveData;", "getDataRecordListLiveData", "()Landroidx/lifecycle/LiveData;", "checkSelectRecord", "Lkotlinx/coroutines/Job;", "idRecord", "", "getDataRecord", "context", "Landroid/content/Context;", "getValueRecord", "", "postValueDataImage", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class RecordVM extends com.example.appa.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.recording.RecordingRepo recordingRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.appa.data.model.ItemRecordingUI>> _dataRecordMutableLiveData = null;
    
    @javax.inject.Inject()
    public RecordVM(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.recording.RecordingRepo recordingRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.appa.data.model.ItemRecordingUI>> getDataRecordListLiveData() {
        return null;
    }
    
    /**
     * Retrieves the current value of data record list.
     * @author AnhTTH
     */
    private final java.util.List<com.example.appa.data.model.ItemRecordingUI> getValueRecord() {
        return null;
    }
    
    /**
     * Retrieves recorded audio data from the repository and updates LiveData.
     * @param context The application context.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getDataRecord(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Posts a new value to the LiveData holding recorded audio data.
     * @author AnhTTH
     */
    private final void postValueDataImage(java.util.List<com.example.appa.data.model.ItemRecordingUI> $this$postValueDataImage) {
    }
    
    /**
     * Checks or unchecks a recorded audio item based on its ID.
     * @param idRecord The ID of the recorded audio item.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job checkSelectRecord(int idRecord) {
        return null;
    }
}