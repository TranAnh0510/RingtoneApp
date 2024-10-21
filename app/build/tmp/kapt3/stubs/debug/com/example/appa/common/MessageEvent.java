package com.example.appa.common;

/**
 * Represents an event message with various types of data.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B5\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\rB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u000fB?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0010B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0012B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0013B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0017B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0019R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0018\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u0004\u00a8\u00062"}, d2 = {"Lcom/example/appa/common/MessageEvent;", "", "typeEvent", "", "(I)V", "stringValue1", "", "stringValue2", "intValues", "", "stringValue4", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "stringValue3", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "id", "(IJLjava/lang/String;Ljava/lang/String;)V", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "intValues2", "(IJJ)V", "(ILjava/lang/String;)V", "booleanValues2", "", "(IJJZ)V", "(IZ)V", "longValue1", "(IJ)V", "getBooleanValues2", "()Z", "setBooleanValues2", "(Z)V", "getLongValue1", "()J", "setLongValue1", "(J)V", "longValue2", "getLongValue2", "setLongValue2", "getStringValue1", "()Ljava/lang/String;", "setStringValue1", "(Ljava/lang/String;)V", "getStringValue2", "setStringValue2", "getStringValue3", "setStringValue3", "getStringValue4", "setStringValue4", "getTypeEvent", "()I", "setTypeEvent", "app_debug"})
public final class MessageEvent {
    private int typeEvent = -1;
    private long longValue1 = -1L;
    private long longValue2 = -1L;
    private boolean booleanValues2 = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String stringValue1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String stringValue2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String stringValue3;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String stringValue4;
    
    public final int getTypeEvent() {
        return 0;
    }
    
    public final void setTypeEvent(int p0) {
    }
    
    public final long getLongValue1() {
        return 0L;
    }
    
    public final void setLongValue1(long p0) {
    }
    
    public final long getLongValue2() {
        return 0L;
    }
    
    public final void setLongValue2(long p0) {
    }
    
    public final boolean getBooleanValues2() {
        return false;
    }
    
    public final void setBooleanValues2(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStringValue1() {
        return null;
    }
    
    public final void setStringValue1(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStringValue2() {
        return null;
    }
    
    public final void setStringValue2(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStringValue3() {
        return null;
    }
    
    public final void setStringValue3(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStringValue4() {
        return null;
    }
    
    public final void setStringValue4(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public MessageEvent(int typeEvent) {
        super();
    }
    
    public MessageEvent(int typeEvent, @org.jetbrains.annotations.Nullable()
    java.lang.String stringValue1, @org.jetbrains.annotations.Nullable()
    java.lang.String stringValue2, long intValues, @org.jetbrains.annotations.Nullable()
    java.lang.String stringValue4) {
        super();
    }
    
    public MessageEvent(int typeEvent, @org.jetbrains.annotations.Nullable()
    java.lang.String stringValue1, @org.jetbrains.annotations.Nullable()
    java.lang.String stringValue2, @org.jetbrains.annotations.Nullable()
    java.lang.String stringValue3) {
        super();
    }
    
    public MessageEvent(int typeEvent, long id, @org.jetbrains.annotations.Nullable()
    java.lang.String stringValue1, @org.jetbrains.annotations.Nullable()
    java.lang.String stringValue2) {
        super();
    }
    
    public MessageEvent(int typeEvent, long intValues, @org.jetbrains.annotations.Nullable()
    java.lang.String stringValue1, @org.jetbrains.annotations.Nullable()
    java.lang.String stringValue2, @org.jetbrains.annotations.Nullable()
    java.lang.String stringValue3, @org.jetbrains.annotations.Nullable()
    java.lang.String stringValue4) {
        super();
    }
    
    public MessageEvent(int typeEvent, long intValues, long intValues2) {
        super();
    }
    
    public MessageEvent(int typeEvent, @org.jetbrains.annotations.Nullable()
    java.lang.String stringValue1) {
        super();
    }
    
    public MessageEvent(int typeEvent, long intValues, long intValues2, boolean booleanValues2) {
        super();
    }
    
    public MessageEvent(int typeEvent, boolean booleanValues2) {
        super();
    }
    
    public MessageEvent(int typeEvent, long longValue1) {
        super();
    }
}