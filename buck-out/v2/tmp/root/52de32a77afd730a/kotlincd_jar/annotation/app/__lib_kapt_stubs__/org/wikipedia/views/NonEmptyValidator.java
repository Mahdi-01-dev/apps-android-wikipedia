package org.wikipedia.views;

import android.widget.Button;
import com.google.android.material.textfield.TextInputLayout;

/**
 * Triggers events when one or more EditTexts are empty or not
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/views/NonEmptyValidator;", "", "actionButton", "Landroid/widget/Button;", "textInputs", "", "Lcom/google/android/material/textfield/TextInputLayout;", "(Landroid/widget/Button;[Lcom/google/android/material/textfield/TextInputLayout;)V", "lastIsValidValue", "", "[Lcom/google/android/material/textfield/TextInputLayout;", "revalidate", "", "force", "app.lib"})
public final class NonEmptyValidator {
    @org.jetbrains.annotations.NotNull()
    private final android.widget.Button actionButton = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.textfield.TextInputLayout[] textInputs = null;
    private boolean lastIsValidValue = false;
    
    public NonEmptyValidator(@org.jetbrains.annotations.NotNull()
    android.widget.Button actionButton, @org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout... textInputs) {
        super();
    }
    
    private final void revalidate(boolean force) {
    }
}