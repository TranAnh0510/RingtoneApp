package com.example.appa.rate;

/**
 * A subclass of AnimationRatingBar that provides additional animation effects when filling or emptying the RatingBar.
 * This class implements the ScaleRatingBar which scales the rating views when filling or emptying.
 * @constructor Creates a ScaleRatingBar instance.
 * @param context The context in which the ScaleRatingBar is constructed.
 * @param attrs The attribute set used to initialize the ScaleRatingBar.
 * @param defStyleAttr An attribute in the current theme that contains a reference to a style resource to apply to this view.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u00a8\u0006\u0018"}, d2 = {"Lcom/example/appa/rate/ScaleRatingBar;", "Lcom/example/appa/rate/AnimationRatingBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "emptyRatingBar", "", "fillRatingBar", "rating", "", "getAnimationRunnable", "Ljava/lang/Runnable;", "partialView", "Lcom/example/appa/rate/PartialView;", "ratingViewId", "maxIntOfRating", "", "Companion", "app_debug"})
public final class ScaleRatingBar extends com.example.appa.rate.AnimationRatingBar {
    private static final long ANIMATION_DELAY = 15L;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.appa.rate.ScaleRatingBar.Companion Companion = null;
    
    public ScaleRatingBar(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    public ScaleRatingBar(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ScaleRatingBar(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    /**
     * Empties the RatingBar by setting all partial views to empty state with animation.
     * @author AnhTTH
     */
    public final void emptyRatingBar() {
    }
    
    /**
     * Fills the RatingBar to the given rating value with animation.
     * @param rating The rating value to fill the RatingBar.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void fillRatingBar(float rating) {
    }
    
    /**
     * Creates a Runnable object for animating the filling of a partial view.
     * @param rating The rating value to fill the RatingBar.
     * @param partialView The partial view to be animated.
     * @param ratingViewId The ID of the rating view.
     * @param maxIntOfRating The maximum integer value of the rating.
     * @return The created Runnable object.
     * @author AnhTTH
     */
    private final java.lang.Runnable getAnimationRunnable(float rating, com.example.appa.rate.PartialView partialView, int ratingViewId, double maxIntOfRating) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/appa/rate/ScaleRatingBar$Companion;", "", "()V", "ANIMATION_DELAY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}