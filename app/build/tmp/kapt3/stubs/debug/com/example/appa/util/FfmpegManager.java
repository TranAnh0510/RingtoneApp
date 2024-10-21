package com.example.appa.util;

/**
 * Manages ffmpeg operations.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J#\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/appa/util/FfmpegManager;", "", "()V", "context", "Landroid/content/Context;", "execute", "", "text", "", "", "executeCallback", "Lcom/arthenica/mobileffmpeg/ExecuteCallback;", "([Ljava/lang/String;Lcom/arthenica/mobileffmpeg/ExecuteCallback;)V", "init", "ctx", "Companion", "app_debug"})
public final class FfmpegManager {
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    
    /**
     * The singleton instance of the ffmpeg manager.
     * @author AnhTTH
     */
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    @org.jetbrains.annotations.Nullable()
    private static com.example.appa.util.FfmpegManager instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.appa.util.FfmpegManager.Companion Companion = null;
    
    private FfmpegManager() {
        super();
    }
    
    /**
     * Initializes the ffmpeg manager with the given context.
     * @param ctx The context to initialize the manager with.
     * @author AnhTTH
     */
    public final void init(@org.jetbrains.annotations.Nullable()
    android.content.Context ctx) {
    }
    
    /**
     * Executes an ffmpeg command asynchronously.
     * @param text The ffmpeg command as an array of strings.
     * @param executeCallback The callback to be invoked after execution.
     * @author AnhTTH
     */
    public final void execute(@org.jetbrains.annotations.NotNull()
    java.lang.String[] text, @org.jetbrains.annotations.Nullable()
    com.arthenica.mobileffmpeg.ExecuteCallback executeCallback) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@BX\u0087\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/appa/util/FfmpegManager$Companion;", "", "()V", "<set-?>", "Lcom/example/appa/util/FfmpegManager;", "instance", "getInstance", "()Lcom/example/appa/util/FfmpegManager;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.appa.util.FfmpegManager getInstance() {
            return null;
        }
    }
}