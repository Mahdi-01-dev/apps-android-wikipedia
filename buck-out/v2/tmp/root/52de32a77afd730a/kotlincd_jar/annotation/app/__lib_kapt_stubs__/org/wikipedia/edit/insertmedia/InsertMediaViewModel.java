package org.wikipedia.edit.insertmedia;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.paging.*;
import org.wikipedia.Constants;
import org.wikipedia.dataclient.Service;
import org.wikipedia.dataclient.ServiceFactory;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.page.PageTitle;
import org.wikipedia.staticdata.FileAliasData;
import org.wikipedia.util.L10nUtil;
import org.wikipedia.util.StringUtil;
import org.wikipedia.util.log.L;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u00041234B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010/\u001a\u000200H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001c\u0010 \u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\b\"\u0004\b\'\u0010\nR\u001a\u0010(\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\b\"\u0004\b*\u0010\nR\u0011\u0010+\u001a\u00020,\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.\u00a8\u00065"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "imagePosition", "", "getImagePosition", "()Ljava/lang/String;", "setImagePosition", "(Ljava/lang/String;)V", "imageSize", "getImageSize", "setImageSize", "imageType", "getImageType", "setImageType", "insertMediaFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lorg/wikipedia/page/PageTitle;", "getInsertMediaFlow", "()Lkotlinx/coroutines/flow/Flow;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "getInvokeSource", "()Lorg/wikipedia/Constants$InvokeSource;", "originalSearchQuery", "getOriginalSearchQuery", "searchQuery", "getSearchQuery", "setSearchQuery", "selectedImage", "getSelectedImage", "()Lorg/wikipedia/page/PageTitle;", "setSelectedImage", "(Lorg/wikipedia/page/PageTitle;)V", "selectedImageSource", "getSelectedImageSource", "setSelectedImageSource", "selectedImageSourceProjects", "getSelectedImageSourceProjects", "setSelectedImageSourceProjects", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "loadMagicWords", "", "Companion", "InfoboxVars", "InfoboxVarsCollection", "InsertMediaPagingSource", "app.lib"})
public final class InsertMediaViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.Constants.InvokeSource invokeSource = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite wikiSite = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String searchQuery;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String originalSearchQuery = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.PageTitle selectedImage;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedImageSource;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedImageSourceProjects;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String imagePosition;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String imageType;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String imageSize;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<org.wikipedia.page.PageTitle>> insertMediaFlow = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_POSITION_NONE = "img_none";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_POSITION_CENTER = "img_center";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_POSITION_LEFT = "img_left";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_POSITION_RIGHT = "img_right";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_TYPE_THUMBNAIL = "img_thumbnail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_TYPE_FRAMELESS = "img_frameless";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_TYPE_FRAME = "img_framed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_TYPE_BASIC = "basic";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_ALT_TEXT = "img_alt";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_SIZE_DEFAULT = "220x124";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, org.wikipedia.edit.insertmedia.InsertMediaViewModel.InfoboxVarsCollection> infoboxVarsByLang = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String magicWordsLang = "";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, java.lang.String> magicWords = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.edit.insertmedia.InsertMediaViewModel.Companion Companion = null;
    
    public InsertMediaViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.Constants.InvokeSource getInvokeSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getWikiSite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchQuery() {
        return null;
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.PageTitle getSelectedImage() {
        return null;
    }
    
    public final void setSelectedImage(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedImageSource() {
        return null;
    }
    
    public final void setSelectedImageSource(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedImageSourceProjects() {
        return null;
    }
    
    public final void setSelectedImageSourceProjects(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImagePosition() {
        return null;
    }
    
    public final void setImagePosition(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageType() {
        return null;
    }
    
    public final void setImageType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageSize() {
        return null;
    }
    
    public final void setImageSize(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<org.wikipedia.page.PageTitle>> getInsertMediaFlow() {
        return null;
    }
    
    @kotlin.Suppress(names = {"KotlinConstantConditions"})
    private final void loadMagicWords() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004J?\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018H\u0002\u00a2\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0082\u0001\u0010!\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020#\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00170\"2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00182\b\b\u0002\u0010,\u001a\u00020#2\b\b\u0002\u0010-\u001a\u00020#R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel$Companion;", "", "()V", "IMAGE_ALT_TEXT", "", "IMAGE_POSITION_CENTER", "IMAGE_POSITION_LEFT", "IMAGE_POSITION_NONE", "IMAGE_POSITION_RIGHT", "IMAGE_SIZE_DEFAULT", "IMAGE_TYPE_BASIC", "IMAGE_TYPE_FRAME", "IMAGE_TYPE_FRAMELESS", "IMAGE_TYPE_THUMBNAIL", "infoboxVarsByLang", "", "Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel$InfoboxVarsCollection;", "magicWords", "", "magicWordsLang", "defaultImagePositionForLang", "langCode", "findNameParamInTemplate", "Lkotlin/Pair;", "", "possibleNameParamNames", "", "wikiText", "startIndex", "endIndex", "([Ljava/lang/String;Ljava/lang/String;II)Lkotlin/Pair;", "initMagicWords", "", "insertImageIntoWikiText", "Lkotlin/Triple;", "", "oldWikiText", "imageTitle", "imageCaption", "imageAltText", "imageSize", "imageType", "imagePos", "cursorPos", "autoInsert", "attemptInfobox", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void initMagicWords() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String defaultImagePositionForLang(@org.jetbrains.annotations.NotNull()
        java.lang.String langCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.Triple<java.lang.String, java.lang.Boolean, kotlin.Pair<java.lang.Integer, java.lang.Integer>> insertImageIntoWikiText(@org.jetbrains.annotations.NotNull()
        java.lang.String langCode, @org.jetbrains.annotations.NotNull()
        java.lang.String oldWikiText, @org.jetbrains.annotations.NotNull()
        java.lang.String imageTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String imageCaption, @org.jetbrains.annotations.NotNull()
        java.lang.String imageAltText, @org.jetbrains.annotations.NotNull()
        java.lang.String imageSize, @org.jetbrains.annotations.NotNull()
        java.lang.String imageType, @org.jetbrains.annotations.NotNull()
        java.lang.String imagePos, int cursorPos, boolean autoInsert, boolean attemptInfobox) {
            return null;
        }
        
        private final kotlin.Pair<java.lang.Integer, java.lang.String> findNameParamInTemplate(java.lang.String[] possibleNameParamNames, java.lang.String wikiText, int startIndex, int endIndex) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel$InfoboxVars;", "", "templateNameContains", "", "imageParamName", "imageCaptionParamName", "imageAltParamName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageAltParamName", "()Ljava/lang/String;", "getImageCaptionParamName", "getImageParamName", "getTemplateNameContains", "app.lib"})
    public static final class InfoboxVars {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String templateNameContains = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String imageParamName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String imageCaptionParamName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String imageAltParamName = null;
        
        public InfoboxVars(@org.jetbrains.annotations.NotNull()
        java.lang.String templateNameContains, @org.jetbrains.annotations.NotNull()
        java.lang.String imageParamName, @org.jetbrains.annotations.NotNull()
        java.lang.String imageCaptionParamName, @org.jetbrains.annotations.NotNull()
        java.lang.String imageAltParamName) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTemplateNameContains() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImageParamName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImageCaptionParamName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImageAltParamName() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel$InfoboxVarsCollection;", "", "templateNameRegex", "", "defaultImageParamName", "defaultImageCaptionParamName", "defaultImageAltParamName", "possibleNameParamNames", "", "vars", "", "Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel$InfoboxVars;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/util/List;)V", "getDefaultImageAltParamName", "()Ljava/lang/String;", "getDefaultImageCaptionParamName", "getDefaultImageParamName", "getPossibleNameParamNames", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getTemplateNameRegex", "getVars", "()Ljava/util/List;", "app.lib"})
    public static final class InfoboxVarsCollection {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String templateNameRegex = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String defaultImageParamName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String defaultImageCaptionParamName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String defaultImageAltParamName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String[] possibleNameParamNames = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.edit.insertmedia.InsertMediaViewModel.InfoboxVars> vars = null;
        
        public InfoboxVarsCollection(@org.jetbrains.annotations.NotNull()
        java.lang.String templateNameRegex, @org.jetbrains.annotations.NotNull()
        java.lang.String defaultImageParamName, @org.jetbrains.annotations.NotNull()
        java.lang.String defaultImageCaptionParamName, @org.jetbrains.annotations.NotNull()
        java.lang.String defaultImageAltParamName, @org.jetbrains.annotations.NotNull()
        java.lang.String[] possibleNameParamNames, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.edit.insertmedia.InsertMediaViewModel.InfoboxVars> vars) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTemplateNameRegex() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDefaultImageParamName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDefaultImageCaptionParamName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDefaultImageAltParamName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getPossibleNameParamNames() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.edit.insertmedia.InsertMediaViewModel.InfoboxVars> getVars() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\t\u001a\u0004\u0018\u00010\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000bH\u0016\u00a2\u0006\u0002\u0010\fJ(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/edit/insertmedia/InsertMediaViewModel$InsertMediaPagingSource;", "Landroidx/paging/PagingSource;", "", "Lorg/wikipedia/page/PageTitle;", "searchQuery", "", "(Ljava/lang/String;)V", "getSearchQuery", "()Ljava/lang/String;", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app.lib"})
    public static final class InsertMediaPagingSource extends androidx.paging.PagingSource<java.lang.Integer, org.wikipedia.page.PageTitle> {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String searchQuery = null;
        
        public InsertMediaPagingSource(@org.jetbrains.annotations.NotNull()
        java.lang.String searchQuery) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSearchQuery() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.Object load(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, org.wikipedia.page.PageTitle>> $completion) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingState<java.lang.Integer, org.wikipedia.page.PageTitle> state) {
            return null;
        }
    }
}