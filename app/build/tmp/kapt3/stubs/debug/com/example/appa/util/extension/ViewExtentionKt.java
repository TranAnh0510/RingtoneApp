package com.example.appa.util.extension;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0004*\u00020\u0005\u001a(\u0010\u0007\u001a\u00020\u0004*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\n\u001a\n\u0010\u000b\u001a\u00020\u0004*\u00020\u0005\u00a8\u0006\f"}, d2 = {"getScreenHeight", "", "Landroid/content/Context;", "gone", "", "Landroid/view/View;", "invisible", "setOnSafeClick", "defaultInterval", "onSafeClick", "Lkotlin/Function1;", "visible", "app_debug"})
public final class ViewExtentionKt {
    
    /**
     * Get the height of the device screen
     * @author AnhTTH
     */
    public static final int getScreenHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getScreenHeight) {
        return 0;
    }
    
    /**
     * Makes a View visible.
     * @author AnhTTH
     */
    public static final void visible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$visible) {
    }
    
    /**
     * Makes a View invisible (gone).
     * @author AnhTTH
     */
    public static final void gone(@org.jetbrains.annotations.NotNull()
    android.view.View $this$gone) {
    }
    
    /**
     * Makes a View invisible but still takes up space in the layout.
     * @author AnhTTH
     */
    public static final void invisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$invisible) {
    }
    
    /**
     * Set up a safe OnClickListener that prevents pressing too quickly from causing many unwanted events.
     * @author AnhTTH
     */
    public static final void setOnSafeClick(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setOnSafeClick, int defaultInterval, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onSafeClick) {
    }
}