package org.wikipedia.suggestededits;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.descriptions.DescriptionEditActivity.Action;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestionsActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;", "()V", "createFragment", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app.lib"})
public final class SuggestionsActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.suggestededits.SuggestedEditsCardsFragment> {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SOURCE_ADDED_CONTRIBUTION = "addedContribution";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestionsActivity.Companion Companion = null;
    
    public SuggestionsActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected org.wikipedia.suggestededits.SuggestedEditsCardsFragment createFragment() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestionsActivity$Companion;", "", "()V", "EXTRA_SOURCE_ADDED_CONTRIBUTION", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
            return null;
        }
    }
}