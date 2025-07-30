package org.wikipedia.feed.model;

import android.net.Uri;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H&R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/feed/model/Card;", "", "()V", "hideKey", "", "getHideKey", "()Ljava/lang/String;", "dismissHashCode", "", "equals", "", "other", "extract", "hashCode", "image", "Landroid/net/Uri;", "onDismiss", "", "onRestore", "subtitle", "title", "type", "Lorg/wikipedia/feed/model/CardType;", "app.lib"})
public abstract class Card {
    
    public Card() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHideKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String title() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String subtitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.net.Uri image() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String extract() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.feed.model.CardType type();
    
    public void onDismiss() {
    }
    
    public void onRestore() {
    }
    
    protected int dismissHashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
}