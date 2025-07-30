package org.wikipedia;

import androidx.core.content.FileProvider;

/**
 * According to the documentation:
 * "It is possible to use FileProvider directly instead of extending it. However, this is not
 * reliable and will causes (sic) crashes on some devices."
 * https://developer.android.com/reference/androidx/core/content/FileProvider
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/wikipedia/WikipediaFileProvider;", "Landroidx/core/content/FileProvider;", "()V", "app.lib"})
public final class WikipediaFileProvider extends androidx.core.content.FileProvider {
    
    public WikipediaFileProvider() {
        super();
    }
}