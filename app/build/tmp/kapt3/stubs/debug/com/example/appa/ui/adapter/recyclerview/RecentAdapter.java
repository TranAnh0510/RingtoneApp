package com.example.appa.ui.adapter.recyclerview;

/**
 * Adapter for displaying recent items in a RecyclerView.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0014R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR,\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR,\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/example/appa/ui/adapter/recyclerview/RecentAdapter;", "Lcom/example/appa/ui/base/BaseBindingAdapterDiff;", "Lcom/example/appa/data/model/ItemRecent;", "Lcom/example/appa/databinding/ItemRecentBinding;", "()V", "layoutIdItem", "", "getLayoutIdItem", "()I", "onclickItem", "Lkotlin/Function2;", "", "getOnclickItem", "()Lkotlin/jvm/functions/Function2;", "setOnclickItem", "(Lkotlin/jvm/functions/Function2;)V", "onclickMore", "getOnclickMore", "setOnclickMore", "onBindViewHolderBase", "holder", "Lcom/example/appa/ui/base/BaseBindingAdapterDiff$BaseHolder;", "position", "app_debug"})
public final class RecentAdapter extends com.example.appa.ui.base.BaseBindingAdapterDiff<com.example.appa.data.model.ItemRecent, com.example.appa.databinding.ItemRecentBinding> {
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemRecent, kotlin.Unit> onclickItem;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemRecent, kotlin.Unit> onclickMore;
    
    public RecentAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.model.ItemRecent, kotlin.Unit> getOnclickItem() {
        return null;
    }
    
    public final void setOnclickItem(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemRecent, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.model.ItemRecent, kotlin.Unit> getOnclickMore() {
        return null;
    }
    
    public final void setOnclickMore(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemRecent, kotlin.Unit> p0) {
    }
    
    /**
     * Binds the data to the views of the item at the specified position.
     * @param holder The ViewHolder containing the views.
     * @param position The position of the item in the adapter.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onBindViewHolderBase(@org.jetbrains.annotations.NotNull()
    com.example.appa.ui.base.BaseBindingAdapterDiff.BaseHolder<com.example.appa.databinding.ItemRecentBinding> holder, int position) {
    }
    
    @java.lang.Override()
    protected int getLayoutIdItem() {
        return 0;
    }
}