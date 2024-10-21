package com.example.appa.data.repository.recording;

/**
 * Implementation of the [RecordingRepo] interface responsible for managing recorded items.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/example/appa/data/repository/recording/RecordingRepoImpl;", "Lcom/example/appa/data/repository/recording/RecordingRepo;", "()V", "getListRecording", "", "Lcom/example/appa/data/model/ItemRecordingUI;", "context", "Landroid/content/Context;", "app_debug"})
public final class RecordingRepoImpl implements com.example.appa.data.repository.recording.RecordingRepo {
    
    @javax.inject.Inject()
    public RecordingRepoImpl() {
        super();
    }
    
    /**
     * Retrieves a list of recorded items from room database.
     * @param context The application context.
     * @return A list of [ItemRecordingUI] objects representing recorded items.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.appa.data.model.ItemRecordingUI> getListRecording(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}