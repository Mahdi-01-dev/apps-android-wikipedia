package org.wikipedia.page;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.StyleRes;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import org.wikipedia.R;
import org.wikipedia.analytics.BreadcrumbsContextHelper;
import org.wikipedia.analytics.eventplatform.BreadCrumbLogEvent;
import org.wikipedia.util.DeviceUtil;
import org.wikipedia.util.ResourceUtil;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onStart", "ExtendedBottomSheetDialog", "app.lib"})
public class ExtendedBottomSheetDialogFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    
    public ExtendedBottomSheetDialogFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment$ExtendedBottomSheetDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "context", "Landroid/content/Context;", "theme", "", "(Landroid/content/Context;I)V", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "app.lib"})
    public static final class ExtendedBottomSheetDialog extends com.google.android.material.bottomsheet.BottomSheetDialog {
        
        public ExtendedBottomSheetDialog(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @androidx.annotation.StyleRes()
        int theme) {
            super(null);
        }
        
        @java.lang.Override()
        public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent ev) {
            return false;
        }
    }
}