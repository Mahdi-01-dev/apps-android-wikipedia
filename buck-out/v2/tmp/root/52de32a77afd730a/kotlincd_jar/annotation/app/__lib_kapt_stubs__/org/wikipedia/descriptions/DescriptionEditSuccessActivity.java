package org.wikipedia.descriptions;

import android.content.Context;
import android.content.Intent;
import org.wikipedia.Constants;
import org.wikipedia.Constants.InvokeSource;
import org.wikipedia.activity.SingleFragmentActivityTransparent;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditSuccessActivity;", "Lorg/wikipedia/activity/SingleFragmentActivityTransparent;", "Lorg/wikipedia/descriptions/DescriptionEditSuccessFragment;", "Lorg/wikipedia/descriptions/DescriptionEditSuccessFragment$Callback;", "()V", "createFragment", "onDismissClick", "", "Companion", "app.lib"})
public final class DescriptionEditSuccessActivity extends org.wikipedia.activity.SingleFragmentActivityTransparent<org.wikipedia.descriptions.DescriptionEditSuccessFragment> implements org.wikipedia.descriptions.DescriptionEditSuccessFragment.Callback {
    public static final int RESULT_OK_FROM_EDIT_SUCCESS = 1;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.descriptions.DescriptionEditSuccessActivity.Companion Companion = null;
    
    public DescriptionEditSuccessActivity() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected org.wikipedia.descriptions.DescriptionEditSuccessFragment createFragment() {
        return null;
    }
    
    @java.lang.Override()
    public void onDismissClick() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditSuccessActivity$Companion;", "", "()V", "RESULT_OK_FROM_EDIT_SUCCESS", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
    }
}