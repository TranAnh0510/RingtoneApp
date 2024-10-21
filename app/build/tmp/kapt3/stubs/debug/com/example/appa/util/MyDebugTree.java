package com.example.appa.util;

/**
 * Custom debug tree for Timber logging library.
 * Overrides the default behavior to include the file name and line number in the log tag.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014\u00a8\u0006\u0007"}, d2 = {"Lcom/example/appa/util/MyDebugTree;", "Ltimber/log/Timber$DebugTree;", "()V", "createStackElementTag", "", "element", "Ljava/lang/StackTraceElement;", "app_debug"})
public final class MyDebugTree extends timber.log.Timber.DebugTree {
    
    public MyDebugTree() {
        super();
    }
    
    /**
     * Creates a custom log tag with the file name and line number.
     * @param element The stack trace element.
     * @return A formatted string containing the file name and line number.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String createStackElementTag(@org.jetbrains.annotations.NotNull()
    java.lang.StackTraceElement element) {
        return null;
    }
}