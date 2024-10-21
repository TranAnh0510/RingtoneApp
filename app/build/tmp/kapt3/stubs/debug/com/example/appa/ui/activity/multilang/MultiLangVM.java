package com.example.appa.ui.activity.multilang;

/**
 * ViewModel class for managing multiple languages.
 * @property languageRepository The repository for language-related operations.
 * @constructor Creates an instance of [MultiLangVM] with the provided [languageRepository].
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0012\u0010\u0012\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\b0\u0014H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/appa/ui/activity/multilang/MultiLangVM;", "Lcom/example/appa/ui/base/BaseViewModel;", "languageRepository", "Lcom/example/appa/data/repository/language/LanguageRepo;", "(Lcom/example/appa/data/repository/language/LanguageRepo;)V", "_languageLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/appa/data/model/LanguageUI;", "languageLiveData", "Landroidx/lifecycle/LiveData;", "getLanguageLiveData", "()Landroidx/lifecycle/LiveData;", "getListLanguage", "Lkotlinx/coroutines/Job;", "insertLanguageToDB", "languageUI", "saveFirstKeyIntro", "postValueLanguage", "", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class MultiLangVM extends com.example.appa.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.repository.language.LanguageRepo languageRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.appa.data.model.LanguageUI>> _languageLiveData = null;
    
    @javax.inject.Inject()
    public MultiLangVM(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.language.LanguageRepo languageRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.appa.data.model.LanguageUI>> getLanguageLiveData() {
        return null;
    }
    
    /**
     * get list language from repository
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getListLanguage() {
        return null;
    }
    
    /**
     * insert language to database via languageRepository
     * @author AnhTTH
     */
    private final kotlinx.coroutines.Job insertLanguageToDB(com.example.appa.data.model.LanguageUI languageUI) {
        return null;
    }
    
    /**
     * store a saveFirstKeyIntro value to SharedPreference
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveFirstKeyIntro() {
        return null;
    }
    
    /**
     * update and sort list language
     * @author AnhTTH
     */
    private final void postValueLanguage(java.util.List<com.example.appa.data.model.LanguageUI> $this$postValueLanguage) {
    }
}