package com.example.appa.data.repository.language;

/**
 * Repository interface for managing language items in the application.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u00a6@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/appa/data/repository/language/LanguageRepo;", "", "getAllLanguage", "", "Lcom/example/appa/data/model/LanguageUI;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLanguageToDb", "", "languageUI", "(Lcom/example/appa/data/model/LanguageUI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LanguageRepo {
    
    /**
     * get all language from database
     *  @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllLanguage(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.appa.data.model.LanguageUI>> $completion);
    
    /**
     * insert language to database
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertLanguageToDb(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.LanguageUI languageUI, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
}