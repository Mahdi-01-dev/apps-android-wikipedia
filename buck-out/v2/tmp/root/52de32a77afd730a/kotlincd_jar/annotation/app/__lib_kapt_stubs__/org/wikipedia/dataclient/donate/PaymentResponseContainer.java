package org.wikipedia.dataclient.donate;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.mwapi.MwException;
import org.wikipedia.dataclient.mwapi.MwServiceError;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/dataclient/donate/PaymentResponseContainer;", "", "response", "Lorg/wikipedia/dataclient/donate/PaymentResponse;", "(Lorg/wikipedia/dataclient/donate/PaymentResponse;)V", "getResponse", "()Lorg/wikipedia/dataclient/donate/PaymentResponse;", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class PaymentResponseContainer {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.donate.PaymentResponse response = null;
    
    public PaymentResponseContainer(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.donate.PaymentResponse response) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.donate.PaymentResponse getResponse() {
        return null;
    }
    
    public PaymentResponseContainer() {
        super();
    }
}