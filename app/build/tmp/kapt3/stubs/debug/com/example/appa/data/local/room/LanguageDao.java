package com.example.appa.data.local.room;

/**
 * Data Access Object (DAO) interface for accessing language items data in the database.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\'J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/appa/data/local/room/LanguageDao;", "", "getAllLanguage", "", "Lcom/example/appa/data/model/LanguageUI;", "insertLanguage", "", "languageUI", "(Lcom/example/appa/data/model/LanguageUI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface LanguageDao {
    
    /**
     * Queries the database for all languageUIs, ordered by ID in ascending order.
     * @return A list of all languageUIs in the database, or null if there are no languageUIs.
     * @author AnhTTH
     */
    @androidx.room.Query(value = "SELECT * FROM LanguageUI ORDER BY id ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<com.example.appa.data.model.LanguageUI> getAllLanguage();
    
    /**
     * Inserts a new languageUI into the database.
     * @param languageUI The languageUI to insert.
     * @return The ID of the newly inserted languageUI, or -1 if the insert operation failed.
     * @author AnhTTH
     */
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertLanguage(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.LanguageUI languageUI, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
}