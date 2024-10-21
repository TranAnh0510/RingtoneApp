package com.example.appa.ui.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a2\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0007\u001a8\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\t\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000b0\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0007\u00a8\u0006\r"}, d2 = {"observeWithCatch", "", "T", "Landroidx/lifecycle/LiveData;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Lkotlin/Function1;", "toMutableListLiveData", "", "Landroidx/lifecycle/MutableLiveData;", "", "transform", "app_debug"})
public final class BaseViewModelKt {
    
    /**
     * convert data from MutableLiveData to MutableList.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.util.List<T> toMutableListLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$toMutableListLiveData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends T> transform) {
        return null;
    }
    
    /**
     * observe data with exception handling in case an error occurs in the observe function.
     * @author AnhTTH
     */
    public static final <T extends java.lang.Object>void observeWithCatch(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observeWithCatch, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> observer) {
    }
}