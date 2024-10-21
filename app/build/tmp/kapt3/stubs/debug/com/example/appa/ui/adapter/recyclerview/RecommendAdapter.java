package com.example.appa.ui.adapter.recyclerview;

/**
 * RecommendAdapter is a custom adapter that extends BaseBindingPagerAdapter.
 * It is used to bind audio item data to a view for a RecyclerView with view binding.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0014R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR,\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/example/appa/ui/adapter/recyclerview/RecommendAdapter;", "Lcom/example/appa/ui/base/BaseBindingAdapterDiff;", "Lcom/example/appa/data/model/ItemRecommend;", "Lcom/example/appa/databinding/ItemHistorySearchBinding;", "()V", "layoutIdItem", "", "getLayoutIdItem", "()I", "onclickItem", "Lkotlin/Function2;", "", "getOnclickItem", "()Lkotlin/jvm/functions/Function2;", "setOnclickItem", "(Lkotlin/jvm/functions/Function2;)V", "onBindViewHolderBase", "holder", "Lcom/example/appa/ui/base/BaseBindingAdapterDiff$BaseHolder;", "position", "app_debug"})
public final class RecommendAdapter extends com.example.appa.ui.base.BaseBindingAdapterDiff<com.example.appa.data.model.ItemRecommend, com.example.appa.databinding.ItemHistorySearchBinding> {
    
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemRecommend, kotlin.Unit> onclickItem;
    
    public RecommendAdapter() {
        super(null);
    }
    
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.model.ItemRecommend, kotlin.Unit> getOnclickItem() {
        return null;
    }
    
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    public final void setOnclickItem(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.ItemRecommend, kotlin.Unit> p0) {
    }
    
    /**
     * Binds the data to the view holder.
     * @param holder The view holder.
     * @param position The position of the item in the adapter.
     */
    @java.lang.Override()
    protected void onBindViewHolderBase(@org.jetbrains.annotations.NotNull()
    com.example.appa.ui.base.BaseBindingAdapterDiff.BaseHolder<com.example.appa.databinding.ItemHistorySearchBinding> holder, int position) {
    }
    
    @java.lang.Override()
    protected int getLayoutIdItem() {
        return 0;
    }
}