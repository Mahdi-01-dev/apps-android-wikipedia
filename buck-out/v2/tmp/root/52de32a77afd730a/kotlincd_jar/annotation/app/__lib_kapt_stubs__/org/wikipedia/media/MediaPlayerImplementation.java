package org.wikipedia.media;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import org.wikipedia.util.log.L;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\u0012\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/media/MediaPlayerImplementation;", "", "()V", "isPlaying", "", "()Z", "player", "Landroid/media/MediaPlayer;", "deinit", "", "load", "path", "", "callback", "Lorg/wikipedia/media/AvPlayer$Callback;", "pause", "play", "setDataSource", "stop", "CallbackWrapper", "app.lib"})
public final class MediaPlayerImplementation {
    @org.jetbrains.annotations.NotNull()
    private final android.media.MediaPlayer player = null;
    
    public MediaPlayerImplementation() {
        super();
    }
    
    public final boolean isPlaying() {
        return false;
    }
    
    public final void deinit() {
    }
    
    public final void load(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    org.wikipedia.media.AvPlayer.Callback callback) {
    }
    
    public final void play(@org.jetbrains.annotations.NotNull()
    org.wikipedia.media.AvPlayer.Callback callback) {
    }
    
    public final void pause() {
    }
    
    public final void stop() {
    }
    
    private final boolean setDataSource(java.lang.String path) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/media/MediaPlayerImplementation$CallbackWrapper;", "Landroid/media/MediaPlayer$OnPreparedListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/media/MediaPlayer$OnErrorListener;", "callback", "Lorg/wikipedia/media/AvPlayer$Callback;", "(Lorg/wikipedia/media/AvPlayer$Callback;)V", "getCallback", "()Lorg/wikipedia/media/AvPlayer$Callback;", "onCompletion", "", "mp", "Landroid/media/MediaPlayer;", "onError", "", "what", "", "extra", "onPrepared", "app.lib"})
    static final class CallbackWrapper implements android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.media.AvPlayer.Callback callback = null;
        
        public CallbackWrapper(@org.jetbrains.annotations.NotNull()
        org.wikipedia.media.AvPlayer.Callback callback) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.media.AvPlayer.Callback getCallback() {
            return null;
        }
        
        @java.lang.Override()
        public void onCompletion(@org.jetbrains.annotations.NotNull()
        android.media.MediaPlayer mp) {
        }
        
        @java.lang.Override()
        public void onPrepared(@org.jetbrains.annotations.NotNull()
        android.media.MediaPlayer mp) {
        }
        
        @java.lang.Override()
        public boolean onError(@org.jetbrains.annotations.NotNull()
        android.media.MediaPlayer mp, int what, int extra) {
            return false;
        }
    }
}