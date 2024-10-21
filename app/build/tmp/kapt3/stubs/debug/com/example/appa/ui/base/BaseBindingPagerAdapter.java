package com.example.appa.ui.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0005:\u0001\u001dB\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u001e\u0010\u0013\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u000bH$J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J \u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0004R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u000bX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/example/appa/ui/base/BaseBindingPagerAdapter;", "T", "", "B", "Landroidx/databinding/ViewDataBinding;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/appa/ui/base/BaseBindingPagerAdapter$BaseHolder;", "itemCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "lastPosition", "", "layoutIdItem", "getLayoutIdItem", "()I", "onBindViewHolder", "", "holder", "position", "onBindViewHolderBase", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAnimation", "viewToAnimate", "Landroid/view/View;", "context", "Landroid/content/Context;", "BaseHolder", "app_debug"})
public abstract class BaseBindingPagerAdapter<T extends java.lang.Object, B extends androidx.databinding.ViewDataBinding> extends androidx.paging.PagingDataAdapter<T, com.example.appa.ui.base.BaseBindingPagerAdapter.BaseHolder<B>> {
    private int lastPosition = -1;
    
    public BaseBindingPagerAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
        super(null, null, null);
    }
    
    protected abstract void onBindViewHolderBase(@org.jetbrains.annotations.NotNull()
    com.example.appa.ui.base.BaseBindingPagerAdapter.BaseHolder<B> holder, int position);
    
    protected abstract int getLayoutIdItem();
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.appa.ui.base.BaseBindingPagerAdapter.BaseHolder<B> holder, int position) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.appa.ui.base.BaseBindingPagerAdapter.BaseHolder<B> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    protected final void setAnimation(@org.jetbrains.annotations.NotNull()
    android.view.View viewToAnimate, int position, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0005R\u001c\u0010\u0004\u001a\u00028\u0002X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lcom/example/appa/ui/base/BaseBindingPagerAdapter$BaseHolder;", "B", "Landroidx/databinding/ViewDataBinding;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "(Landroidx/databinding/ViewDataBinding;)V", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "Landroidx/databinding/ViewDataBinding;", "app_debug"})
    public static final class BaseHolder<B extends androidx.databinding.ViewDataBinding> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private B binding;
        
        public BaseHolder(@org.jetbrains.annotations.NotNull()
        B binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final B getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        B p0) {
        }
    }
}