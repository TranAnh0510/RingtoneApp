package com.example.appa.ui.adapter.recyclerview;

/**
 * VideoAdapter is a custom adapter that extends BaseBindingPagerAdapter.
 * It is used to bind audio item data to a view for a RecyclerView with view binding.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u001b\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0014J\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160 *\u00020\fH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b!\u0010\"R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0013\u0010\u0011R,\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006#"}, d2 = {"Lcom/example/appa/ui/adapter/recyclerview/VideoAdapter;", "Lcom/example/appa/ui/base/BaseBindingPagerAdapter;", "Lcom/example/appa/data/repository/video/model/ItemVideo;", "Lcom/example/appa/databinding/ItemChooseVideoBinding;", "()V", "colorNonSelected", "", "colorSelected", "layoutIdItem", "getLayoutIdItem", "()I", "value", "", "newPath", "getNewPath", "()Ljava/lang/String;", "setNewPath", "(Ljava/lang/String;)V", "oldPath", "setOldPath", "onclickItem", "Lkotlin/Function2;", "", "getOnclickItem", "()Lkotlin/jvm/functions/Function2;", "setOnclickItem", "(Lkotlin/jvm/functions/Function2;)V", "onBindViewHolderBase", "holder", "Lcom/example/appa/ui/base/BaseBindingPagerAdapter$BaseHolder;", "position", "notifyItemWithPath", "Lkotlin/Result;", "notifyItemWithPath-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "app_debug"})
public final class VideoAdapter extends com.example.appa.ui.base.BaseBindingPagerAdapter<com.example.appa.data.repository.video.model.ItemVideo, com.example.appa.databinding.ItemChooseVideoBinding> {
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.repository.video.model.ItemVideo, kotlin.Unit> onclickItem;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String oldPath = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String newPath = "";
    private final int colorSelected = 0;
    private final int colorNonSelected = 0;
    
    public VideoAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.repository.video.model.ItemVideo, kotlin.Unit> getOnclickItem() {
        return null;
    }
    
    public final void setOnclickItem(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.repository.video.model.ItemVideo, kotlin.Unit> p0) {
    }
    
    private final void setOldPath(java.lang.String value) {
    }
    
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
     */
    @java.lang.Override()
    protected void onBindViewHolderBase(@org.jetbrains.annotations.NotNull()
    com.example.appa.ui.base.BaseBindingPagerAdapter.BaseHolder<com.example.appa.databinding.ItemChooseVideoBinding> holder, int position) {
    }
    
    @java.lang.Override()
    protected int getLayoutIdItem() {
        return 0;
    }
}