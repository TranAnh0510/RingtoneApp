package com.example.appa.rate;

/**
 * A custom RatingBar that supports animation.
 * This class extends BaseRatingBar.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0014\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\b\u0014\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B#\b\u0014\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u00122\u0006\u0010!\u001a\u00020\"H\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006#"}, d2 = {"Lcom/example/appa/rate/AnimationRatingBar;", "Lcom/example/appa/rate/BaseRatingBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "mRunnable", "Ljava/lang/Runnable;", "getMRunnable", "()Ljava/lang/Runnable;", "setMRunnable", "(Ljava/lang/Runnable;)V", "mRunnableToken", "", "getMRunnableToken", "()Ljava/lang/String;", "setMRunnableToken", "(Ljava/lang/String;)V", "init", "", "postRunnable", "runnable", "ANIMATION_DELAY", "", "app_debug"})
public class AnimationRatingBar extends com.example.appa.rate.BaseRatingBar {
    
    /**
     * The handler used for posting delayed runnables.
     */
    @org.jetbrains.annotations.Nullable()
    private android.os.Handler mHandler;
    
    /**
     * The runnable for handling animation tasks.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Runnable mRunnable;
    
    /**
     * Unique identifier for the runnable.
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mRunnableToken;
    
    /**
     * The handler used for posting delayed runnables.
     */
    @org.jetbrains.annotations.Nullable()
    protected final android.os.Handler getMHandler() {
        return null;
    }
    
    /**
     * The handler used for posting delayed runnables.
     */
    protected final void setMHandler(@org.jetbrains.annotations.Nullable()
    android.os.Handler p0) {
    }
    
    /**
     * The runnable for handling animation tasks.
     */
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.Runnable getMRunnable() {
        return null;
    }
    
    /**
     * The runnable for handling animation tasks.
     */
    protected final void setMRunnable(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable p0) {
    }
    
    /**
     * Unique identifier for the runnable.
     */
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getMRunnableToken() {
        return null;
    }
    
    /**
     * Unique identifier for the runnable.
     */
    protected final void setMRunnableToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * Constructor for creating an AnimationRatingBar.
     * @param context The context in which the AnimationRatingBar will be used.
     * @author AnhTTH
     */
    protected AnimationRatingBar(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    /**
     * Constructor for creating an AnimationRatingBar.
     * @param context The context in which the AnimationRatingBar will be used.
     * @param attrs The attribute set defining the AnimationRatingBar's attributes.
     * @author AnhTTH
     */
    protected AnimationRatingBar(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    /**
     * Constructor for creating an AnimationRatingBar.
     * @param context The context in which the AnimationRatingBar will be used.
     * @param attrs The attribute set defining the AnimationRatingBar's attributes.
     * @param defStyleAttr An attribute in the current theme that contains a reference to a style resource.
     * @author AnhTTH
     */
    protected AnimationRatingBar(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    /**
     * Initializes the AnimationRatingBar.
     * @author AnhTTH
     */
    private final void init() {
    }
    
    /**
     * Posts a runnable to the handler with a specified delay.
     * @param runnable The runnable to be executed.
     * @param ANIMATION_DELAY The delay in milliseconds before the runnable is executed.
     * @author AnhTTH
     */
    protected final void postRunnable(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable runnable, long ANIMATION_DELAY) {
    }
}