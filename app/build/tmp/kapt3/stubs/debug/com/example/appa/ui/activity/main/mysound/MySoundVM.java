package com.example.appa.ui.activity.main.mysound;

/**
 * ViewModel class for managing sound-related data and operations.
 * This ViewModel is scoped to the Hilt dependency injection framework.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0015H\u0002J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/appa/ui/activity/main/mysound/MySoundVM;", "Lcom/example/appa/ui/base/BaseViewModel;", "mySoundRepo", "Lcom/example/appa/data/repository/mysound/MySoundRepo;", "(Lcom/example/appa/data/repository/mysound/MySoundRepo;)V", "_mySoundMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/appa/data/model/ItemMySoundUI;", "mySoundLiveData", "Landroidx/lifecycle/LiveData;", "getMySoundLiveData", "()Landroidx/lifecycle/LiveData;", "deleteMySound", "Lkotlinx/coroutines/Job;", "path", "", "getAllMySound", "context", "Landroid/content/Context;", "getValueMySound", "", "updateNameMySound", "name", "id", "", "postValueDataMySound", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class MySoundVM extends com.example.appa.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.mysound.MySoundRepo mySoundRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.appa.data.model.ItemMySoundUI>> _mySoundMutableLiveData = null;
    
    @javax.inject.Inject()
    public MySoundVM(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.mysound.MySoundRepo mySoundRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.appa.data.model.ItemMySoundUI>> getMySoundLiveData() {
        return null;
    }
    
    /**
     * Returns a mutable copy of the current list of ItemMySoundUI.
     * @return A mutable copy of the LiveData list.
     * @author AnhTTH
     */
    private final java.util.List<com.example.appa.data.model.ItemMySoundUI> getValueMySound() {
        return null;
    }
    
    /**
     * Fetches all sounds from the repository and updates the LiveData.
     * @param context The context for accessing resources.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAllMySound(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Updates the name of a sound identified by its ID.
     * @param name The new name of the sound.
     * @param id The ID of the sound to be updated.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateNameMySound(@org.jetbrains.annotations.NotNull()
    java.lang.String name, long id) {
        return null;
    }
    
    /**
     * Processes a list of ItemMySoundUI objects and updates their duration.
     * The duration is formatted as "mm:ss".
     * @receiver The list of ItemMySoundUI to process.
     * @author AnhTTH
     */
    private final void postValueDataMySound(java.util.List<com.example.appa.data.model.ItemMySoundUI> $this$postValueDataMySound) {
    }
    
    /**
     * Deletes a sound identified by its file path and updates the LiveData.
     * @param path The file path of the sound to be deleted.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteMySound(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
}