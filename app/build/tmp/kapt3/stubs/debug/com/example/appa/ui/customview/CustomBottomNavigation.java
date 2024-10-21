package com.example.appa.ui.customview;

/**
 * Custom view for bottom navigation.
 * @author AnhTTh
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001%B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u001f\u001a\u00020\u0011J\b\u0010 \u001a\u00020\u0011H\u0002J\b\u0010!\u001a\u00020\u0011H\u0002J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R5\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00110\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006&"}, d2 = {"Lcom/example/appa/ui/customview/CustomBottomNavigation;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lcom/example/appa/databinding/CustomBottomNavigationBinding;", "onClickNewSound", "Lkotlin/Function0;", "", "getOnClickNewSound", "()Lkotlin/jvm/functions/Function0;", "setOnClickNewSound", "(Lkotlin/jvm/functions/Function0;)V", "onClickTab", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "pos", "getOnClickTab", "()Lkotlin/jvm/functions/Function1;", "setOnClickTab", "(Lkotlin/jvm/functions/Function1;)V", "clickMySound", "initListener", "initView", "updateUI", "type", "Lcom/example/appa/ui/customview/CustomBottomNavigation$TypeSelect;", "TypeSelect", "app_debug"})
public final class CustomBottomNavigation extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickTab;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickNewSound;
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.databinding.CustomBottomNavigationBinding binding = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnClickTab() {
        return null;
    }
    
    public final void setOnClickTab(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClickNewSound() {
        return null;
    }
    
    public final void setOnClickNewSound(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    /**
     * Updates UI based on the selected type.
     * @param type The type of selection.
     * @author AnhTTh
     */
    private final void updateUI(com.example.appa.ui.customview.CustomBottomNavigation.TypeSelect type) {
    }
    
    /**
     * Constructor with context.
     * @author AnhTTh
     */
    public CustomBottomNavigation(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    /**
     * Initializes the view.
     * @author AnhTTh
     */
    private final void initView() {
    }
    
    /**
     * Simulates click on "My Sound" tab.
     * @author AnhTTh
     */
    public final void clickMySound() {
    }
    
    /**
     * Initializes listeners for UI elements.
     * @author AnhTTh
     */
    private final void initListener() {
    }
    
    /**
     * Constructor with context and attributes.
     * @author AnhTTh
     */
    public CustomBottomNavigation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    /**
     * Constructor with context, attributes, and default style.
     * @author AnhTTh
     */
    public CustomBottomNavigation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    /**
     * Constructor with context, attributes, default style, and default resource.
     * @author AnhTTh
     */
    public CustomBottomNavigation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/appa/ui/customview/CustomBottomNavigation$TypeSelect;", "", "(Ljava/lang/String;I)V", "TYPE_RINGTONE", "TYPE_FAVORITE", "TYPE_MY_SOUND", "TYPE_SETTING", "app_debug"})
    public static enum TypeSelect {
        /*public static final*/ TYPE_RINGTONE /* = new TYPE_RINGTONE() */,
        /*public static final*/ TYPE_FAVORITE /* = new TYPE_FAVORITE() */,
        /*public static final*/ TYPE_MY_SOUND /* = new TYPE_MY_SOUND() */,
        /*public static final*/ TYPE_SETTING /* = new TYPE_SETTING() */;
        
        TypeSelect() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.example.appa.ui.customview.CustomBottomNavigation.TypeSelect> getEntries() {
            return null;
        }
    }
}