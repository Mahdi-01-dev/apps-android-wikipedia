package org.wikipedia.settings.dev.playground;

import android.content.Context;
import android.widget.Toast;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.Dispatchers;
import org.wikipedia.categories.db.Category;
import org.wikipedia.database.AppDatabase;
import org.wikipedia.util.UiState;
import org.wikipedia.util.log.L;
import java.time.Year;
import java.util.UUID;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018J \u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0018J\u000e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u001f\u001a\u00020\u0012R \u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000b\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/settings/dev/playground/CategoryDeveloperPlayGroundViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_categoryState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/util/UiState;", "", "Lorg/wikipedia/categories/db/Category;", "categories", "", "", "[Ljava/lang/String;", "categoryState", "Lkotlinx/coroutines/flow/StateFlow;", "getCategoryState", "()Lkotlinx/coroutines/flow/StateFlow;", "languages", "addTestData", "", "context", "Landroid/content/Context;", "title", "languageCode", "year", "", "addTestDataBulk", "size", "deleteAllCategories", "deleteBeforeYear", "yearsAgo", "filterBy", "loadCategories", "app.lib"})
public final class CategoryDeveloperPlayGroundViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] categories = {"Animals", "Science", "Technology", "History", "Geography", "Art", "Music", "Literature", "Sports", "Food", "Politics", "Religion", "Education", "Health", "Environment", "Fruit", "Vegetables", "Philosophy"};
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] languages = {"en", "zh-cn"};
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.util.UiState<java.util.List<org.wikipedia.categories.db.Category>>> _categoryState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.UiState<java.util.List<org.wikipedia.categories.db.Category>>> categoryState = null;
    
    public CategoryDeveloperPlayGroundViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<org.wikipedia.util.UiState<java.util.List<org.wikipedia.categories.db.Category>>> getCategoryState() {
        return null;
    }
    
    public final void loadCategories() {
    }
    
    public final void filterBy(int year) {
    }
    
    public final void addTestData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode, int year) {
    }
    
    public final void addTestDataBulk(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int size, int year) {
    }
    
    public final void deleteAllCategories(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void deleteBeforeYear(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int yearsAgo) {
    }
}