package com.example.appa.ui.adapter.recyclerview;

/**
 * MySoundAdapter is a custom adapter that extends BaseBindingPagerAdapter.
 * It is used to bind audio item data to a view for a RecyclerView with view binding.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u001e\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030 2\u0006\u0010!\u001a\u00020\u000bH\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR,\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R,\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R,\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R,\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014\u00a8\u0006\""}, d2 = {"Lcom/example/appa/ui/adapter/recyclerview/MySoundAdapter;", "Lcom/example/appa/ui/base/BaseBindingAdapterDiff;", "Lcom/example/appa/data/model/ItemMySoundUI;", "Lcom/example/appa/databinding/ItemMySoundsBinding;", "()V", "isSelect", "", "()Z", "setSelect", "(Z)V", "layoutIdItem", "", "getLayoutIdItem", "()I", "onclickChangeName", "Lkotlin/Function2;", "", "getOnclickChangeName", "()Lkotlin/jvm/functions/Function2;", "setOnclickChangeName", "(Lkotlin/jvm/functions/Function2;)V", "onclickEdit", "getOnclickEdit", "setOnclickEdit", "onclickItem", "getOnclickItem", "setOnclickItem", "onclickMore", "getOnclickMore", "setOnclickMore", "onBindViewHolderBase", "holder", "Lcom/example/appa/ui/base/BaseBindingAdapterDiff$BaseHolder;", "position", "app_debug"})
public final class MySoundAdapter extends com.example.appa.ui.base.BaseBindingAdapterDiff<com.example.appa.data.model.ItemMySoundUI, com.example.appa.databinding.ItemMySoundsBinding> {
    
    /**
     * Indicates whether an item is selected.
     */
    private boolean isSelect = false;
    
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemMySoundUI, kotlin.Unit> onclickItem;
    
    /**
     * Lambda function to handle edit button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemMySoundUI, kotlin.Unit> onclickEdit;
    
    /**
     * Lambda function to handle "more" button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemMySoundUI, kotlin.Unit> onclickMore;
    
    /**
     * Lambda function to handle change name button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemMySoundUI, kotlin.Unit> onclickChangeName;
    
    public MySoundAdapter() {
        super(null);
    }
    
    /**
     * Indicates whether an item is selected.
     */
    public final boolean isSelect() {
        return false;
    }
    
    /**
     * Indicates whether an item is selected.
     */
    public final void setSelect(boolean p0) {
    }
    
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.model.ItemMySoundUI, kotlin.Unit> getOnclickItem() {
        return null;
    }
    
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    public final void setOnclickItem(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemMySoundUI, kotlin.Unit> p0) {
    }
    
    /**
     * Lambda function to handle edit button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.model.ItemMySoundUI, kotlin.Unit> getOnclickEdit() {
        return null;
    }
    
    /**
     * Lambda function to handle edit button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    public final void setOnclickEdit(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemMySoundUI, kotlin.Unit> p0) {
    }
    
    /**
     * Lambda function to handle "more" button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.model.ItemMySoundUI, kotlin.Unit> getOnclickMore() {
        return null;
    }
    
    /**
     * Lambda function to handle "more" button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    public final void setOnclickMore(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemMySoundUI, kotlin.Unit> p0) {
    }
    
    /**
     * Lambda function to handle change name button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.model.ItemMySoundUI, kotlin.Unit> getOnclickChangeName() {
        return null;
    }
    
    /**
     * Lambda function to handle change name button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    public final void setOnclickChangeName(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemMySoundUI, kotlin.Unit> p0) {
    }
    
    /**
     * Binds the data to the view holder.
     * @param holder The view holder.
     * @param position The position of the item in the adapter.
     */
    @java.lang.Override()
    protected void onBindViewHolderBase(@org.jetbrains.annotations.NotNull()
    com.example.appa.ui.base.BaseBindingAdapterDiff.BaseHolder<com.example.appa.databinding.ItemMySoundsBinding> holder, int position) {
    }
    
    @java.lang.Override()
    protected int getLayoutIdItem() {
        return 0;
    }
}