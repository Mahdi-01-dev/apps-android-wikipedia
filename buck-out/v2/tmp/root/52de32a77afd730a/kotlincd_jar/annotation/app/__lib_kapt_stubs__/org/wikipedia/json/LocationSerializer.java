package org.wikipedia.json;

import android.location.Location;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/json/LocationSerializer;", "Lkotlinx/serialization/KSerializer;", "Landroid/location/Location;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app.lib"})
public final class LocationSerializer implements kotlinx.serialization.KSerializer<android.location.Location> {
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.json.LocationSerializer INSTANCE = null;
    
    private LocationSerializer() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return null;
    }
    
    @java.lang.Override()
    public void serialize(@org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
    android.location.Location value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.location.Location deserialize(@org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.Decoder decoder) {
        return null;
    }
}