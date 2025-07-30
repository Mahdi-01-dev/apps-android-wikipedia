package org.wikipedia.captcha;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.mwapi.MwResponse;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\t\u0010\t\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\bH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/captcha/Captcha;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "fancyCaptchaReload", "Lorg/wikipedia/captcha/Captcha$FancyCaptchaReload;", "(Lorg/wikipedia/captcha/Captcha$FancyCaptchaReload;)V", "getFancyCaptchaReload$annotations", "()V", "captchaId", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "FancyCaptchaReload", "app.lib"})
public final class Captcha extends org.wikipedia.dataclient.mwapi.MwResponse {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.captcha.Captcha.FancyCaptchaReload fancyCaptchaReload = null;
    
    private final org.wikipedia.captcha.Captcha.FancyCaptchaReload component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.captcha.Captcha copy(@org.jetbrains.annotations.NotNull()
    org.wikipedia.captcha.Captcha.FancyCaptchaReload fancyCaptchaReload) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    public Captcha(@org.jetbrains.annotations.NotNull()
    org.wikipedia.captcha.Captcha.FancyCaptchaReload fancyCaptchaReload) {
        super();
    }
    
    @kotlinx.serialization.SerialName(value = "fancycaptchareload")
    @java.lang.Deprecated()
    private static void getFancyCaptchaReload$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String captchaId() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/captcha/Captcha$FancyCaptchaReload;", "", "index", "", "(Ljava/lang/String;)V", "getIndex", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app.lib"})
    public static final class FancyCaptchaReload {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String index = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.captcha.Captcha.FancyCaptchaReload copy(@org.jetbrains.annotations.Nullable()
        java.lang.String index) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public FancyCaptchaReload(@org.jetbrains.annotations.Nullable()
        java.lang.String index) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIndex() {
            return null;
        }
    }
}