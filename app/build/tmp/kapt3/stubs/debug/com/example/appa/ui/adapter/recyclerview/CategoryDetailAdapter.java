package com.example.appa.ui.adapter.recyclerview;

/**
 * CategoryDetailAdapter is a custom adapter that extends BaseBindingPagerAdapter.
 * It is used to bind audio item data to a view for a RecyclerView with view binding.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010 \u001a\u00020\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"2\u0006\u0010#\u001a\u00020\u0006H\u0014J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150%*\u00020\nH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b&\u0010\'R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR,\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R,\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006("}, d2 = {"Lcom/example/appa/ui/adapter/recyclerview/CategoryDetailAdapter;", "Lcom/example/appa/ui/base/BaseBindingAdapterDiff;", "Lcom/example/appa/data/model/musicserver/MusicServerUI;", "Lcom/example/appa/databinding/ItemCategoryDetailBinding;", "()V", "layoutIdItem", "", "getLayoutIdItem", "()I", "value", "", "newPath", "getNewPath", "()Ljava/lang/String;", "setNewPath", "(Ljava/lang/String;)V", "oldPath", "getOldPath", "setOldPath", "onclickDownload", "Lkotlin/Function2;", "", "getOnclickDownload", "()Lkotlin/jvm/functions/Function2;", "setOnclickDownload", "(Lkotlin/jvm/functions/Function2;)V", "onclickItem", "getOnclickItem", "setOnclickItem", "onclickMore", "getOnclickMore", "setOnclickMore", "onBindViewHolderBase", "holder", "Lcom/example/appa/ui/base/BaseBindingAdapterDiff$BaseHolder;", "position", "notifyItemWithPath", "Lkotlin/Result;", "notifyItemWithPath-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "app_debug"})
public final class CategoryDetailAdapter extends com.example.appa.ui.base.BaseBindingAdapterDiff<com.example.appa.data.model.musicserver.MusicServerUI, com.example.appa.databinding.ItemCategoryDetailBinding> {
    
    /**
     * Lambda function to handle "more" button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.musicserver.MusicServerUI, kotlin.Unit> onclickMore;
    
    /**
     * Lambda function to handle download button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.musicserver.MusicServerUI, kotlin.Unit> onclickDownload;
    
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.musicserver.MusicServerUI, kotlin.Unit> onclickItem;
    
    /**
     * The path of the previously selected item.
     * When set, it triggers a notification to update the item with the new path.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String oldPath = "";
    
    /**
     * The path of the currently selected item.
     * When set, it triggers a notification to update the item with the new path.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String newPath = "";
    
    public CategoryDetailAdapter() {
        super(null);
    }
    
    /**
     * Lambda function to handle "more" button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.model.musicserver.MusicServerUI, kotlin.Unit> getOnclickMore() {
        return null;
    }
    
    /**
     * Lambda function to handle "more" button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     * @author AnhTTH
     */
    public final void setOnclickMore(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.musicserver.MusicServerUI, kotlin.Unit> p0) {
    }
    
    /**
     * Lambda function to handle download button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.model.musicserver.MusicServerUI, kotlin.Unit> getOnclickDownload() {
        return null;
    }
    
    /**
     * Lambda function to handle download button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     * @author AnhTTH
     */
    public final void setOnclickDownload(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.musicserver.MusicServerUI, kotlin.Unit> p0) {
    }
    
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.model.musicserver.MusicServerUI, kotlin.Unit> getOnclickItem() {
        return null;
    }
    
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     * @author AnhTTH
     */
    public final void setOnclickItem(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.musicserver.MusicServerUI, kotlin.Unit> p0) {
    }
    
    /**
     * The path of the previously selected item.
     * When set, it triggers a notification to update the item with the new path.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOldPath() {
        return null;
    }
    
    public final void setOldPath(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    /**
     * The path of the currently selected item.
     * When set, it triggers a notification to update the item with the new path.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNewPath() {
        return null;
    }
    
    public final void setNewPath(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    /**
     * Binds the data to the view holder.
     * @param holder The view holder.
     * @param position The position of the item in the adapter.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onBindViewHolderBase(@org.jetbrains.annotations.NotNull()
    com.example.appa.ui.base.BaseBindingAdapterDiff.BaseHolder<com.example.appa.databinding.ItemCategoryDetailBinding> holder, int position) {
    }
    
    @java.lang.Override()
    protected int getLayoutIdItem() {
        return 0;
    }
}