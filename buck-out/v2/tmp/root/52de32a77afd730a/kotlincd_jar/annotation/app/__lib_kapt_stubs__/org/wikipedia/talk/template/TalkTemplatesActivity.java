package org.wikipedia.talk.template;

import android.content.Context;
import android.content.Intent;
import org.wikipedia.Constants;
import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.page.PageTitle;
import org.wikipedia.talk.TalkReplyActivity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/talk/template/TalkTemplatesFragment;", "()V", "createFragment", "Companion", "app.lib"})
public final class TalkTemplatesActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.talk.template.TalkTemplatesFragment> {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.talk.template.TalkTemplatesActivity.Companion Companion = null;
    
    public TalkTemplatesActivity() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.wikipedia.talk.template.TalkTemplatesFragment createFragment() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/talk/template/TalkTemplatesActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "templateManagement", "", "fromRevisionId", "", "toRevisionId", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle pageTitle, boolean templateManagement, long fromRevisionId, long toRevisionId) {
            return null;
        }
    }
}