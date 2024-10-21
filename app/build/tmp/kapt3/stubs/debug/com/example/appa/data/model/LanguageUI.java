package com.example.appa.data.model;

/**
 * The LanguageUI class represents a language entity in the user interface.
 * It is used for displaying language information in the application.
 * @author AnhTTh
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J5\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011\u00a8\u0006#"}, d2 = {"Lcom/example/appa/data/model/LanguageUI;", "", "id", "", "name", "", "code", "isSelected", "", "(ILjava/lang/String;Ljava/lang/String;Z)V", "avatar", "getAvatar", "()Ljava/lang/Integer;", "setAvatar", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/String;", "getId", "()I", "setId", "(I)V", "()Z", "setSelected", "(Z)V", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity()
public final class LanguageUI {
    
    /**
     * The unique identifier for the language.
     */
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    
    /**
     * The name of the language.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    
    /**
     * The language code.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String code = null;
    
    /**
     * Indicates whether the language is selected.
     */
    private boolean isSelected;
    
    /**
     * A field to store the avatar resource ID.
     */
    @androidx.room.Ignore()
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer avatar;
    
    public LanguageUI(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String code, boolean isSelected) {
        super();
    }
    
    /**
     * The unique identifier for the language.
     */
    public final int getId() {
        return 0;
    }
    
    /**
     * The unique identifier for the language.
     */
    public final void setId(int p0) {
    }
    
    /**
     * The name of the language.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * The language code.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCode() {
        return null;
    }
    
    /**
     * Indicates whether the language is selected.
     */
    public final boolean isSelected() {
        return false;
    }
    
    /**
     * Indicates whether the language is selected.
     */
    public final void setSelected(boolean p0) {
    }
    
    /**
     * A field to store the avatar resource ID.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAvatar() {
        return null;
    }
    
    /**
     * A field to store the avatar resource ID.
     */
    public final void setAvatar(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.model.LanguageUI copy(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String code, boolean isSelected) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}