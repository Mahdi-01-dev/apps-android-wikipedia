package org.wikipedia.gallery;

import androidx.annotation.DrawableRes;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.R;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B#\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ\b\u0010\u001b\u001a\u00020\u001cH\u0007R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\fR$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/gallery/ImageLicense;", "", "metadata", "Lorg/wikipedia/gallery/ExtMetadata;", "(Lorg/wikipedia/gallery/ExtMetadata;)V", "licenseName", "", "licenseShortName", "licenseUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "isLicenseCC", "", "()Z", "isLicenseCCBySa", "isLicensePD", "getLicenseName$annotations", "()V", "getLicenseName", "()Ljava/lang/String;", "setLicenseName", "(Ljava/lang/String;)V", "getLicenseShortName$annotations", "getLicenseShortName", "setLicenseShortName", "getLicenseUrl$annotations", "getLicenseUrl", "setLicenseUrl", "licenseIcon", "", "Companion", "app.lib"})
public final class ImageLicense {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String licenseName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String licenseShortName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String licenseUrl;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CREATIVE_COMMONS_PREFIX = "cc";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PUBLIC_DOMAIN_PREFIX = "pd";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CC_BY_SA = "ccbysa";
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.gallery.ImageLicense.Companion Companion = null;
    
    public ImageLicense(@org.jetbrains.annotations.NotNull()
    java.lang.String licenseName, @org.jetbrains.annotations.NotNull()
    java.lang.String licenseShortName, @org.jetbrains.annotations.NotNull()
    java.lang.String licenseUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLicenseName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "type")
    @java.lang.Deprecated()
    public static void getLicenseName$annotations() {
    }
    
    public final void setLicenseName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLicenseShortName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "code")
    @java.lang.Deprecated()
    public static void getLicenseShortName$annotations() {
    }
    
    public final void setLicenseShortName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLicenseUrl() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "url")
    @java.lang.Deprecated()
    public static void getLicenseUrl$annotations() {
    }
    
    public final void setLicenseUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ImageLicense(@org.jetbrains.annotations.NotNull()
    org.wikipedia.gallery.ExtMetadata metadata) {
        super();
    }
    
    private final boolean isLicenseCC() {
        return false;
    }
    
    private final boolean isLicensePD() {
        return false;
    }
    
    private final boolean isLicenseCCBySa() {
        return false;
    }
    
    @androidx.annotation.DrawableRes()
    public final int licenseIcon() {
        return 0;
    }
    
    public ImageLicense() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/gallery/ImageLicense$Companion;", "", "()V", "CC_BY_SA", "", "CREATIVE_COMMONS_PREFIX", "PUBLIC_DOMAIN_PREFIX", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}