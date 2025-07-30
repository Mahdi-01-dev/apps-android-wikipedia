package org.wikipedia.gallery;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import org.wikipedia.Constants;
import org.wikipedia.commons.ImageTagsProvider;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.dataclient.wikidata.Entities;
import org.wikipedia.page.PageTitle;
import org.wikipedia.util.Resource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010&\u001a\u00020\'2\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010(\u001a\u00020\'J\u001c\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120*2\b\u0010+\u001a\u0004\u0018\u00010\nJ\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120-2\b\u0010+\u001a\u0004\u0018\u00010\nR(\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0010R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u00a8\u0006."}, d2 = {"Lorg/wikipedia/gallery/GalleryViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_descriptionState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/Resource;", "Lkotlin/Pair;", "", "Lorg/wikipedia/dataclient/wikidata/Entities$Entity;", "_uiState", "Lorg/wikipedia/gallery/MediaList;", "descriptionState", "Lkotlinx/coroutines/flow/StateFlow;", "getDescriptionState", "()Lkotlinx/coroutines/flow/StateFlow;", "initialFilename", "", "getInitialFilename", "()Ljava/lang/String;", "setInitialFilename", "(Ljava/lang/String;)V", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "revision", "", "getRevision", "()Ljava/lang/Long;", "Ljava/lang/Long;", "uiState", "getUiState", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "fetchGalleryDescription", "", "fetchGalleryItems", "getCaptions", "", "entity", "getDepicts", "", "app.lib"})
public final class GalleryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.page.PageTitle pageTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite wikiSite = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long revision = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String initialFilename;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<org.wikipedia.gallery.MediaList>> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.gallery.MediaList>> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.Resource<kotlin.Pair<java.lang.Boolean, org.wikipedia.dataclient.wikidata.Entities.Entity>>> _descriptionState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Pair<java.lang.Boolean, org.wikipedia.dataclient.wikidata.Entities.Entity>>> descriptionState = null;
    
    public GalleryViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getWikiSite() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getRevision() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInitialFilename() {
        return null;
    }
    
    public final void setInitialFilename(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<org.wikipedia.gallery.MediaList>> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.Resource<kotlin.Pair<java.lang.Boolean, org.wikipedia.dataclient.wikidata.Entities.Entity>>> getDescriptionState() {
        return null;
    }
    
    public final void fetchGalleryItems() {
    }
    
    public final void fetchGalleryDescription(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getCaptions(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.wikidata.Entities.Entity entity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDepicts(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.wikidata.Entities.Entity entity) {
        return null;
    }
}