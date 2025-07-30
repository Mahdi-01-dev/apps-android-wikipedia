package org.wikipedia.edit;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.mwapi.MwPostResponse;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/edit/Edit;", "Lorg/wikipedia/dataclient/mwapi/MwPostResponse;", "()V", "edit", "Lorg/wikipedia/edit/Edit$Result;", "getEdit", "()Lorg/wikipedia/edit/Edit$Result;", "Captcha", "Result", "app.lib"})
public final class Edit extends org.wikipedia.dataclient.mwapi.MwPostResponse {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.edit.Edit.Result edit = null;
    
    public Edit() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.edit.Edit.Result getEdit() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/edit/Edit$Captcha;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "app.lib"})
    static final class Captcha {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String id = null;
        
        public Captcha() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getId() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u00020\u00188\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\bR\u0013\u0010!\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\b\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/edit/Edit$Result;", "", "()V", "captcha", "Lorg/wikipedia/edit/Edit$Captcha;", "captchaId", "", "getCaptchaId", "()Ljava/lang/String;", "code", "getCode", "editSucceeded", "", "getEditSucceeded", "()Z", "hasCaptchaResponse", "getHasCaptchaResponse", "hasEditErrorCode", "getHasEditErrorCode", "hasSpamBlacklistResponse", "getHasSpamBlacklistResponse", "info", "getInfo", "newRevId", "", "getNewRevId$annotations", "getNewRevId", "()J", "spamblacklist", "getSpamblacklist", "status", "getStatus$annotations", "getStatus", "warning", "getWarning", "app.lib"})
    public static final class Result {
        @org.jetbrains.annotations.Nullable()
        private final org.wikipedia.edit.Edit.Captcha captcha = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String status = null;
        private final long newRevId = 0L;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String code = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String info = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String warning = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String spamblacklist = null;
        
        public Result() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStatus() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "result")
        @java.lang.Deprecated()
        public static void getStatus$annotations() {
        }
        
        public final long getNewRevId() {
            return 0L;
        }
        
        @kotlinx.serialization.SerialName(value = "newrevid")
        @java.lang.Deprecated()
        public static void getNewRevId$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getWarning() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSpamblacklist() {
            return null;
        }
        
        public final boolean getEditSucceeded() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCaptchaId() {
            return null;
        }
        
        public final boolean getHasEditErrorCode() {
            return false;
        }
        
        public final boolean getHasCaptchaResponse() {
            return false;
        }
        
        public final boolean getHasSpamBlacklistResponse() {
            return false;
        }
    }
}