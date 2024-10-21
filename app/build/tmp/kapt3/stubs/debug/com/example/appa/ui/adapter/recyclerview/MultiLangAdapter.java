package com.example.appa.ui.adapter.recyclerview;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0017\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0014R,\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0016\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/example/appa/ui/adapter/recyclerview/MultiLangAdapter;", "Lcom/example/appa/ui/base/BaseBindingAdapterDiff;", "Lcom/example/appa/data/model/LanguageUI;", "Lcom/example/appa/databinding/ItemMultiLangBinding;", "()V", "callBack", "Lkotlin/Function2;", "", "", "getCallBack", "()Lkotlin/jvm/functions/Function2;", "setCallBack", "(Lkotlin/jvm/functions/Function2;)V", "layoutIdItem", "getLayoutIdItem", "()I", "value", "newPosition", "getNewPosition", "setNewPosition", "(I)V", "oldPosition", "setOldPosition", "onBindViewHolderBase", "holder", "Lcom/example/appa/ui/base/BaseBindingAdapterDiff$BaseHolder;", "position", "app_debug"})
public final class MultiLangAdapter extends com.example.appa.ui.base.BaseBindingAdapterDiff<com.example.appa.data.model.LanguageUI, com.example.appa.databinding.ItemMultiLangBinding> {
    
    /**
     * store old position of item in list
     * @author AnhTTH
     */
    private int oldPosition = -1;
    
    /**
     * store new position of item in list
     * @author AnhTTH
     */
    private int newPosition = -1;
    
    /**
     * callback for item click
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.LanguageUI, kotlin.Unit> callBack;
    
    public MultiLangAdapter() {
        super(null);
    }
    
    private final void setOldPosition(int value) {
    }
    
    /**
     * store new position of item in list
     * @author AnhTTH
     */
    public final int getNewPosition() {
        return 0;
    }
    
    public final void setNewPosition(int value) {
    }
    
    /**
     * callback for item click
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, com.example.appa.data.model.LanguageUI, kotlin.Unit> getCallBack() {
        return null;
    }
    
    /**
     * callback for item click
     * @author AnhTTH
     */
    public final void setCallBack(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.example.appa.data.model.LanguageUI, kotlin.Unit> p0) {
    }
    
    /**
     * assign data to views in ViewHolder at the given location
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onBindViewHolderBase(@org.jetbrains.annotations.NotNull()
    com.example.appa.ui.base.BaseBindingAdapterDiff.BaseHolder<com.example.appa.databinding.ItemMultiLangBinding> holder, int position) {
    }
    
    @java.lang.Override()
    protected int getLayoutIdItem() {
        return 0;
    }
}