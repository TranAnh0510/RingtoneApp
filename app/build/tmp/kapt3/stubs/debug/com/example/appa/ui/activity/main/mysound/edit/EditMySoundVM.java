package com.example.appa.ui.activity.main.mysound.edit;

/**
 * ViewModel class for managing editing operations related to user's sound recordings.
 * Uses Hilt for dependency injection to provide FileRepo and MySoundRepo dependencies.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/example/appa/ui/activity/main/mysound/edit/EditMySoundVM;", "Lcom/example/appa/ui/base/BaseViewModel;", "fileRepo", "Lcom/example/appa/data/repository/file/FileRepo;", "mySoundRepo", "Lcom/example/appa/data/repository/mysound/MySoundRepo;", "(Lcom/example/appa/data/repository/file/FileRepo;Lcom/example/appa/data/repository/mysound/MySoundRepo;)V", "_durationMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "_idItemMySoundMutableLiveData", "_pathMutableLiveData", "", "durationLiveData", "Landroidx/lifecycle/LiveData;", "getDurationLiveData", "()Landroidx/lifecycle/LiveData;", "idItemMySoundLiveData", "getIdItemMySoundLiveData", "pathLiveData", "getPathLiveData", "getDurationFromUri", "Lkotlinx/coroutines/Job;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "getPathFromUri", "insertMySound", "itemMySoundUI", "Lcom/example/appa/data/model/ItemMySoundUI;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class EditMySoundVM extends com.example.appa.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.file.FileRepo fileRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.mysound.MySoundRepo mySoundRepo = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> _durationMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> _idItemMySoundMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> _pathMutableLiveData;
    
    @javax.inject.Inject()
    public EditMySoundVM(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.file.FileRepo fileRepo, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.mysound.MySoundRepo mySoundRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getDurationLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getIdItemMySoundLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getPathLiveData() {
        return null;
    }
    
    /**
     * Retrieves the duration of a sound recording from the provided URI asynchronously.
     * @param context The context used for retrieving the duration.
     * @param uri The URI of the sound recording.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getDurationFromUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    /**
     * Asynchronously retrieves the file path corresponding to the provided URI.
     * @param context The context used for retrieving the file path.
     * @param uri The URI for which the file path is to be retrieved.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getPathFromUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    /**
     * Inserts a new sound recording item into the repository.
     * Asynchronously performs the insertion operation and updates the LiveData with the ID of the inserted item.
     * @param itemMySoundUI The sound recording item to be inserted.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertMySound(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemMySoundUI itemMySoundUI) {
        return null;
    }
}