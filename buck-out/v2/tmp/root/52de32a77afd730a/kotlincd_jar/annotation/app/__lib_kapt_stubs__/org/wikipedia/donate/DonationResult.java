package org.wikipedia.donate;

import kotlinx.serialization.Serializable;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/donate/DonationResult;", "", "dateTime", "", "fromWeb", "", "amount", "", "currency", "recurring", "(Ljava/lang/String;ZFLjava/lang/String;Z)V", "getAmount", "()F", "getCurrency", "()Ljava/lang/String;", "getDateTime", "getFromWeb", "()Z", "getRecurring", "app.lib"})
public final class DonationResult {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dateTime = null;
    private final boolean fromWeb = false;
    private final float amount = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency = null;
    private final boolean recurring = false;
    
    public DonationResult(@org.jetbrains.annotations.NotNull()
    java.lang.String dateTime, boolean fromWeb, float amount, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, boolean recurring) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateTime() {
        return null;
    }
    
    public final boolean getFromWeb() {
        return false;
    }
    
    public final float getAmount() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public final boolean getRecurring() {
        return false;
    }
    
    public DonationResult() {
        super();
    }
}