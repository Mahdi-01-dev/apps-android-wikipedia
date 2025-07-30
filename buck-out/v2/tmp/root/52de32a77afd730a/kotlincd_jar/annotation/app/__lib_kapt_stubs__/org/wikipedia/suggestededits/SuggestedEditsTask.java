package org.wikipedia.suggestededits;

import androidx.annotation.DrawableRes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001c\u0010\'\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011\u00a8\u0006*"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTask;", "", "()V", "dailyProgress", "", "getDailyProgress", "()I", "setDailyProgress", "(I)V", "dailyProgressMax", "getDailyProgressMax", "setDailyProgressMax", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "disabled", "", "getDisabled", "()Z", "setDisabled", "(Z)V", "imageDrawable", "getImageDrawable", "setImageDrawable", "new", "getNew", "setNew", "primaryAction", "getPrimaryAction", "setPrimaryAction", "primaryActionIcon", "getPrimaryActionIcon", "setPrimaryActionIcon", "secondaryAction", "getSecondaryAction", "setSecondaryAction", "title", "getTitle", "setTitle", "app.lib"})
public final class SuggestedEditsTask {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String primaryAction;
    @androidx.annotation.DrawableRes()
    private int primaryActionIcon = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String secondaryAction;
    private boolean disabled = false;
    private int dailyProgress = 0;
    private int dailyProgressMax = 0;
    @androidx.annotation.DrawableRes()
    private int imageDrawable = 0;
    
    public SuggestedEditsTask() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrimaryAction() {
        return null;
    }
    
    public final void setPrimaryAction(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getPrimaryActionIcon() {
        return 0;
    }
    
    public final void setPrimaryActionIcon(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSecondaryAction() {
        return null;
    }
    
    public final void setSecondaryAction(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getDisabled() {
        return false;
    }
    
    public final void setDisabled(boolean p0) {
    }
    
    public final boolean getNew() {
        return false;
    }
    
    public final void setNew(boolean p0) {
    }
    
    public final int getDailyProgress() {
        return 0;
    }
    
    public final void setDailyProgress(int p0) {
    }
    
    public final int getDailyProgressMax() {
        return 0;
    }
    
    public final void setDailyProgressMax(int p0) {
    }
    
    public final int getImageDrawable() {
        return 0;
    }
    
    public final void setImageDrawable(int p0) {
    }
}