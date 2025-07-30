package org.wikipedia.analytics.eventplatform;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.auth.AccountUtil;
import org.wikipedia.dataclient.SharedPreferenceCookieManager;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.page.PageTitle;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/EditAttemptStepInteractionEvent;", "", "action", "", "app_install_id", "editing_session_id", "editor_interface", "integration", "mw_version", "platform", "user_editcount", "", "user_id", "is_anon", "", "user_is_temp", "version", "page_title", "page_ns", "wiki", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZILjava/lang/String;ILjava/lang/String;)V", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class EditAttemptStepInteractionEvent {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String action = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String app_install_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String editing_session_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String editor_interface = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String integration = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mw_version = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String platform = null;
    private final int user_editcount = 0;
    private final int user_id = 0;
    private final boolean is_anon = false;
    private final boolean user_is_temp = false;
    private final int version = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String page_title = null;
    private final int page_ns = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String wiki = null;
    
    public EditAttemptStepInteractionEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String app_install_id, @org.jetbrains.annotations.NotNull()
    java.lang.String editing_session_id, @org.jetbrains.annotations.NotNull()
    java.lang.String editor_interface, @org.jetbrains.annotations.NotNull()
    java.lang.String integration, @org.jetbrains.annotations.NotNull()
    java.lang.String mw_version, @org.jetbrains.annotations.NotNull()
    java.lang.String platform, int user_editcount, int user_id, boolean is_anon, boolean user_is_temp, int version, @org.jetbrains.annotations.NotNull()
    java.lang.String page_title, int page_ns, @org.jetbrains.annotations.NotNull()
    java.lang.String wiki) {
        super();
    }
}