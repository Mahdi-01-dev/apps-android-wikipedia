package org.wikipedia.dataclient.donate;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.mwapi.MwException;
import org.wikipedia.dataclient.mwapi.MwServiceError;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/dataclient/donate/PaymentResponse;", "", "status", "", "errorMessage", "orderId", "gatewayTransactionId", "paymentMethods", "", "Lorg/wikipedia/dataclient/donate/PaymentMethod;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getErrorMessage$annotations", "()V", "getErrorMessage", "()Ljava/lang/String;", "getGatewayTransactionId$annotations", "getGatewayTransactionId", "getOrderId$annotations", "getOrderId", "getPaymentMethods", "()Ljava/util/List;", "getStatus", "app.lib"})
@kotlin.Suppress(names = {"unused"})
public final class PaymentResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String orderId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String gatewayTransactionId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.dataclient.donate.PaymentMethod> paymentMethods = null;
    
    public PaymentResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String gatewayTransactionId, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.dataclient.donate.PaymentMethod> paymentMethods) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "error_message")
    @java.lang.Deprecated()
    public static void getErrorMessage$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "order_id")
    @java.lang.Deprecated()
    public static void getOrderId$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGatewayTransactionId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "gateway_transaction_id")
    @java.lang.Deprecated()
    public static void getGatewayTransactionId$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.dataclient.donate.PaymentMethod> getPaymentMethods() {
        return null;
    }
    
    public PaymentResponse() {
        super();
    }
}