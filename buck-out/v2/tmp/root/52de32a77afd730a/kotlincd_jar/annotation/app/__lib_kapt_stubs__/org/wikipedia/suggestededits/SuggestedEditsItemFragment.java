package org.wikipedia.suggestededits;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import org.wikipedia.dataclient.mwapi.MwQueryPage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment;", "Landroidx/fragment/app/Fragment;", "()V", "onBackPressed", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "parent", "Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;", "publish", "publishEnabled", "publishOutlined", "Callback", "app.lib"})
public abstract class SuggestedEditsItemFragment extends androidx.fragment.app.Fragment {
    
    public SuggestedEditsItemFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.suggestededits.SuggestedEditsCardsFragment parent() {
        return null;
    }
    
    public boolean publishEnabled() {
        return false;
    }
    
    public boolean publishOutlined() {
        return false;
    }
    
    public void publish() {
    }
    
    public boolean onBackPressed() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0007H&\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment$Callback;", "", "getLangCode", "", "getSinglePage", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "logSuccess", "", "nextPage", "sourceFragment", "Landroidx/fragment/app/Fragment;", "updateActionButton", "app.lib"})
    public static abstract interface Callback {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getLangCode();
        
        @org.jetbrains.annotations.Nullable()
        public abstract org.wikipedia.dataclient.mwapi.MwQueryPage getSinglePage();
        
        public abstract void updateActionButton();
        
        public abstract void nextPage(@org.jetbrains.annotations.Nullable()
        androidx.fragment.app.Fragment sourceFragment);
        
        public abstract void logSuccess();
    }
}