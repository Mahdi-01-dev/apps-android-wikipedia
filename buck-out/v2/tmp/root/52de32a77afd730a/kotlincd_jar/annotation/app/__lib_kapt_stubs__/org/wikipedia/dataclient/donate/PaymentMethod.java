package org.wikipedia.dataclient.donate;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.mwapi.MwException;
import org.wikipedia.dataclient.mwapi.MwServiceError;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/dataclient/donate/PaymentMethod;", "", "name", "", "type", "brands", "", "configuration", "Lorg/wikipedia/dataclient/donate/PaymentMethodConfiguration;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/wikipedia/dataclient/donate/PaymentMethodConfiguration;)V", "getBrands", "()Ljava/util/List;", "getConfiguration", "()Lorg/wikipedia/dataclient/donate/PaymentMethodConfiguration;", "getName", "()Ljava/lang/String;", "getType", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class PaymentMethod {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> brands = null;
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.donate.PaymentMethodConfiguration configuration = null;
    
    public PaymentMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> brands, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.donate.PaymentMethodConfiguration configuration) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getBrands() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.donate.PaymentMethodConfiguration getConfiguration() {
        return null;
    }
    
    public PaymentMethod() {
        super();
    }
}