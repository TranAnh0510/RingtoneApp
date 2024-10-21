package com.example.appa.ui.adapter.recyclerview;

/**
 * RecordAdapter is a custom adapter that extends BaseBindingPagerAdapter.
 * It is used to bind audio item data to a view for a RecyclerView with view binding.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010$\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&2\u0006\u0010\'\u001a\u00020\u000bH\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R,\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR,\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014\u00a8\u0006("}, d2 = {"Lcom/example/appa/ui/adapter/recyclerview/RecordAdapter;", "Lcom/example/appa/ui/base/BaseBindingAdapterDiff;", "Lcom/example/appa/data/model/ItemRecordingUI;", "Lcom/example/appa/databinding/ItemRecordingBinding;", "()V", "isPlay", "", "()Z", "setPlay", "(Z)V", "layoutIdItem", "", "getLayoutIdItem", "()I", "onclickFastForward15s", "Lkotlin/Function1;", "", "getOnclickFastForward15s", "()Lkotlin/jvm/functions/Function1;", "setOnclickFastForward15s", "(Lkotlin/jvm/functions/Function1;)V", "onclickItem", "Lkotlin/Function2;", "getOnclickItem", "()Lkotlin/jvm/functions/Function2;", "setOnclickItem", "(Lkotlin/jvm/functions/Function2;)V", "onclickMore", "getOnclickMore", "setOnclickMore", "onclickPlay", "getOnclickPlay", "setOnclickPlay", "onclickRewind15s", "getOnclickRewind15s", "setOnclickRewind15s", "onBindViewHolderBase", "holder", "Lcom/example/appa/ui/base/BaseBindingAdapterDiff$BaseHolder;", "position", "app_debug"})
public final class RecordAdapter extends com.example.appa.ui.base.BaseBindingAdapterDiff<com.example.appa.data.model.ItemRecordingUI, com.example.appa.databinding.ItemRecordingBinding> {
    
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemRecordingUI, kotlin.Unit> onclickItem;
    
    /**
     * Lambda function to handle play button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemRecordingUI, kotlin.Unit> onclickPlay;
    
    /**
     * Lambda function to handle rewind 15 seconds button click events.
     * The parameter is the position of the clicked item.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onclickRewind15s;
    
    /**
     * Lambda function to handle fast forward 15 seconds button click events.
     * The parameter is the position of the clicked item.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onclickFastForward15s;
    
    /**
     * Lambda function to handle "more" button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemRecordingUI, kotlin.Unit> onclickMore;
    
    /**
     * Indicates whether an item is currently playing.
     */
    private boolean isPlay = false;
    
    public RecordAdapter() {
        super(null);
    }
    
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.model.ItemRecordingUI, kotlin.Unit> getOnclickItem() {
        return null;
    }
    
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    public final void setOnclickItem(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemRecordingUI, kotlin.Unit> p0) {
    }
    
    /**
     * Lambda function to handle play button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.model.ItemRecordingUI, kotlin.Unit> getOnclickPlay() {
        return null;
    }
    
    /**
     * Lambda function to handle play button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    public final void setOnclickPlay(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemRecordingUI, kotlin.Unit> p0) {
    }
    
    /**
     * Lambda function to handle rewind 15 seconds button click events.
     * The parameter is the position of the clicked item.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnclickRewind15s() {
        return null;
    }
    
    /**
     * Lambda function to handle rewind 15 seconds button click events.
     * The parameter is the position of the clicked item.
     */
    public final void setOnclickRewind15s(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    /**
     * Lambda function to handle fast forward 15 seconds button click events.
     * The parameter is the position of the clicked item.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnclickFastForward15s() {
        return null;
    }
    
    /**
     * Lambda function to handle fast forward 15 seconds button click events.
     * The parameter is the position of the clicked item.
     */
    public final void setOnclickFastForward15s(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    /**
     * Lambda function to handle "more" button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.model.ItemRecordingUI, kotlin.Unit> getOnclickMore() {
        return null;
    }
    
    /**
     * Lambda function to handle "more" button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    public final void setOnclickMore(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemRecordingUI, kotlin.Unit> p0) {
    }
    
    /**
     * Indicates whether an item is currently playing.
     */
    public final boolean isPlay() {
        return false;
    }
    
    /**
     * Indicates whether an item is currently playing.
     */
    public final void setPlay(boolean p0) {
    }
    
    /**
     * Binds the data to the view holder.
     * @param holder The view holder.
     * @param position The position of the item in the adapter.
     */
    @java.lang.Override()
    protected void onBindViewHolderBase(@org.jetbrains.annotations.NotNull()
    com.example.appa.ui.base.BaseBindingAdapterDiff.BaseHolder<com.example.appa.databinding.ItemRecordingBinding> holder, int position) {
    }
    
    @java.lang.Override()
    protected int getLayoutIdItem() {
        return 0;
    }
}