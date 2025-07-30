package org.wikipedia.suggestededits;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import org.wikipedia.Constants;
import org.wikipedia.R;
import org.wikipedia.WikipediaApp;
import org.wikipedia.activity.FragmentUtil;
import org.wikipedia.databinding.DialogImageTagSelectBinding;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.util.DimenUtil;
import org.wikipedia.util.ResourceUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ,2\u00020\u0001:\u0004+,-.B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\"\u001a\u00020\u0012H\u0016J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0012H\u0016J\u001a\u0010\'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\fH\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "adapter", "Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$ResultListAdapter;", "binding", "getBinding", "()Lerror/NonExistentClass;", "currentSearchTerm", "", "searchJob", "Lkotlinx/coroutines/Job;", "textWatcher", "Landroid/text/TextWatcher;", "applyResults", "", "results", "", "Lorg/wikipedia/suggestededits/ImageTag;", "callback", "Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$Callback;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onStart", "onViewCreated", "view", "requestResults", "searchTerm", "Callback", "Companion", "ResultItemHolder", "ResultListAdapter", "app.lib"})
public final class SuggestedEditsImageTagDialog extends androidx.fragment.app.DialogFragment {
    private android.text.TextWatcher textWatcher;
    @org.jetbrains.annotations.Nullable()
    private DialogImageTagSelectBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentSearchTerm = "";
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.suggestededits.SuggestedEditsImageTagDialog.ResultListAdapter adapter = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job searchJob;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsImageTagDialog.Companion Companion = null;
    
    public SuggestedEditsImageTagDialog() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
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
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void requestResults(java.lang.String searchTerm) {
    }
    
    private final void applyResults(java.util.List<org.wikipedia.suggestededits.ImageTag> results) {
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    private final org.wikipedia.suggestededits.SuggestedEditsImageTagDialog.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$Callback;", "", "onSearchDismiss", "", "searchTerm", "", "onSearchSelect", "item", "Lorg/wikipedia/suggestededits/ImageTag;", "app.lib"})
    public static abstract interface Callback {
        
        public abstract void onSearchSelect(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.ImageTag item);
        
        public abstract void onSearchDismiss(@org.jetbrains.annotations.NotNull()
        java.lang.String searchTerm);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog;", "useClipboardText", "", "lastText", "", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.suggestededits.SuggestedEditsImageTagDialog newInstance(boolean useClipboardText, @org.jetbrains.annotations.NotNull()
        java.lang.String lastText) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0016\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$ResultItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog;Landroid/view/View;)V", "bindItem", "", "item", "Lorg/wikipedia/suggestededits/ImageTag;", "onClick", "v", "app.lib"})
    final class ResultItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        
        public ResultItemHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.ImageTag item) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\u0016J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\tH\u0016J\u0014\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$ResultListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$ResultItemHolder;", "Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog;", "results", "", "Lorg/wikipedia/suggestededits/ImageTag;", "(Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "setResults", "app.lib"})
    final class ResultListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.suggestededits.SuggestedEditsImageTagDialog.ResultItemHolder> {
        @org.jetbrains.annotations.NotNull()
        private java.util.List<org.wikipedia.suggestededits.ImageTag> results;
        
        public ResultListAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.suggestededits.ImageTag> results) {
            super();
        }
        
        public final void setResults(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.suggestededits.ImageTag> results) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public org.wikipedia.suggestededits.SuggestedEditsImageTagDialog.ResultItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int pos) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsImageTagDialog.ResultItemHolder holder, int pos) {
        }
    }
}