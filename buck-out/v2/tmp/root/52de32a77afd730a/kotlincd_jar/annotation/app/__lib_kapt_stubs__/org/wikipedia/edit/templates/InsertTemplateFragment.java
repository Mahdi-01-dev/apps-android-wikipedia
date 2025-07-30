package org.wikipedia.edit.templates;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.textfield.TextInputLayout;
import org.wikipedia.R;
import org.wikipedia.databinding.FragmentInsertTemplateBinding;
import org.wikipedia.databinding.ItemInsertTemplateBinding;
import org.wikipedia.dataclient.mwapi.TemplateDataResponse;
import org.wikipedia.page.LinkMovementMethodExt;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.UriUtil;
import org.wikipedia.views.PlainPasteEditText;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0016\u001a\u00020\fJ\u0006\u0010\u0017\u001a\u00020\u000fJ$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u000fH\u0016J\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u0011R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\r\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/edit/templates/InsertTemplateFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "activity", "Lorg/wikipedia/edit/templates/TemplatesSearchActivity;", "binding", "getBinding", "()Lerror/NonExistentClass;", "isActive", "", "()Z", "buildParamsInputFields", "", "templateData", "Lorg/wikipedia/dataclient/mwapi/TemplateDataResponse$TemplateData;", "checkRequiredParams", "collectParamsInfoAndBuildWikiText", "", "getTemplateDescription", "handleBackPressed", "hide", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "show", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "app.lib"})
public final class InsertTemplateFragment extends androidx.fragment.app.Fragment {
    private org.wikipedia.edit.templates.TemplatesSearchActivity activity;
    @org.jetbrains.annotations.Nullable()
    private FragmentInsertTemplateBinding _binding;
    
    public InsertTemplateFragment() {
        super();
    }
    
    private final java.lang.Object getBinding() {
        return null;
    }
    
    public final boolean isActive() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void buildParamsInputFields(org.wikipedia.dataclient.mwapi.TemplateDataResponse.TemplateData templateData) {
    }
    
    private final void checkRequiredParams() {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.TemplateDataResponse.TemplateData templateData) {
    }
    
    private final java.lang.String getTemplateDescription(org.wikipedia.dataclient.mwapi.TemplateDataResponse.TemplateData templateData) {
        return null;
    }
    
    public final void hide() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String collectParamsInfoAndBuildWikiText() {
        return null;
    }
    
    public final boolean handleBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}