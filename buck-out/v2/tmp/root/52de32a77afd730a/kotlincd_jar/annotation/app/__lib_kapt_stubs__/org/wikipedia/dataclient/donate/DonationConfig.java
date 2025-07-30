package org.wikipedia.dataclient.donate;

import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\u0005\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u00a2\u0006\u0002\u0010\u000eR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R#\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/dataclient/donate/DonationConfig;", "", "version", "", "currencyMinimumDonation", "", "", "", "currencyMaximumDonation", "currencyAmountPresets", "", "currencyTransactionFees", "countryCodeEmailOptInRequired", "countryCodeGooglePayEnabled", "(ILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "getCountryCodeEmailOptInRequired", "()Ljava/util/List;", "getCountryCodeGooglePayEnabled", "getCurrencyAmountPresets", "()Ljava/util/Map;", "getCurrencyMaximumDonation", "getCurrencyMinimumDonation", "getCurrencyTransactionFees", "getVersion", "()I", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class DonationConfig {
    private final int version = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.Float> currencyMinimumDonation = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.Float> currencyMaximumDonation = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.util.List<java.lang.Float>> currencyAmountPresets = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.Float> currencyTransactionFees = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> countryCodeEmailOptInRequired = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> countryCodeGooglePayEnabled = null;
    
    public DonationConfig(int version, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Float> currencyMinimumDonation, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Float> currencyMaximumDonation, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<java.lang.Float>> currencyAmountPresets, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Float> currencyTransactionFees, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> countryCodeEmailOptInRequired, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> countryCodeGooglePayEnabled) {
        super();
    }
    
    public final int getVersion() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Float> getCurrencyMinimumDonation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Float> getCurrencyMaximumDonation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.List<java.lang.Float>> getCurrencyAmountPresets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Float> getCurrencyTransactionFees() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCountryCodeEmailOptInRequired() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCountryCodeGooglePayEnabled() {
        return null;
    }
}