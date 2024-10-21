package com.example.appa.data.repository.language;

/**
 * get data from local database, process logic and send result to LanguageRepo
 * Create helps avoid direct risk of results for ViewModel when there is any change to ViewModel
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/appa/data/repository/language/LanguageRepoImpl;", "Lcom/example/appa/data/repository/language/LanguageRepo;", "languageDao", "Lcom/example/appa/data/local/room/LanguageDao;", "(Lcom/example/appa/data/local/room/LanguageDao;)V", "getAllLanguage", "", "Lcom/example/appa/data/model/LanguageUI;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLanguageToDb", "", "languageUI", "(Lcom/example/appa/data/model/LanguageUI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LanguageRepoImpl implements com.example.appa.data.repository.language.LanguageRepo {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.local.room.LanguageDao languageDao = null;
    
    @javax.inject.Inject()
    public LanguageRepoImpl(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.LanguageDao languageDao) {
        super();
    }
    
    /**
     * get all language from local database
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAllLanguage(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.appa.data.model.LanguageUI>> $completion) {
        return null;
    }
    
    /**
     * insert language UI to local database.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertLanguageToDb(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.LanguageUI languageUI, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
}