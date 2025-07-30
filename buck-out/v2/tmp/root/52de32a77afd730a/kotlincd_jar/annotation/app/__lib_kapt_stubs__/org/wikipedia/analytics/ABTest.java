package org.wikipedia.analytics;

import org.wikipedia.settings.PrefsIoUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/analytics/ABTest;", "", "abTestName", "", "abTestGroupCount", "", "(Ljava/lang/String;I)V", "group", "getGroup", "()I", "testGroup", "getTestGroup", "setTestGroup", "(I)V", "assignGroup", "", "Companion", "app.lib"})
public class ABTest {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String abTestName = null;
    private final int abTestGroupCount = 0;
    private int testGroup = -1;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String AB_TEST_KEY_PREFIX = "ab_test_";
    public static final int GROUP_SIZE_2 = 2;
    public static final int GROUP_SIZE_3 = 3;
    public static final int GROUP_1 = 0;
    public static final int GROUP_2 = 1;
    public static final int GROUP_3 = 2;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.ABTest.Companion Companion = null;
    
    public ABTest(@org.jetbrains.annotations.NotNull()
    java.lang.String abTestName, int abTestGroupCount) {
        super();
    }
    
    public final int getGroup() {
        return 0;
    }
    
    protected final int getTestGroup() {
        return 0;
    }
    
    protected final void setTestGroup(int p0) {
    }
    
    protected void assignGroup() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/analytics/ABTest$Companion;", "", "()V", "AB_TEST_KEY_PREFIX", "", "GROUP_1", "", "GROUP_2", "GROUP_3", "GROUP_SIZE_2", "GROUP_SIZE_3", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}