package org.wikipedia.games.onthisday;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.OnSelectionChangedListener;
import org.wikipedia.R;
import org.wikipedia.analytics.eventplatform.WikiGamesEvent;
import org.wikipedia.util.log.L;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0004J@\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lorg/wikipedia/games/onthisday/OnThisDayGameBaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "fragmentLifecycleCallbacks", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "scoreData", "", "", "", "getPrivateCalendarFragment", "", "picker", "Lcom/google/android/material/datepicker/MaterialDatePicker;", "handleDateSelection", "", "selectedDateInMillis", "maybeShowToastForDate", "onArchiveDateSelected", "date", "Ljava/time/LocalDate;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "prepareAndOpenArchiveCalendar", "viewModel", "Lorg/wikipedia/games/onthisday/OnThisDayGameViewModel;", "showArchiveCalendar", "startDate", "Ljava/util/Date;", "endDate", "onDateSelected", "Lkotlin/Function1;", "app.lib"})
public abstract class OnThisDayGameBaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.Long, java.lang.Integer> scoreData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks = null;
    
    public OnThisDayGameBaseFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    protected final void prepareAndOpenArchiveCalendar(@org.jetbrains.annotations.NotNull()
    org.wikipedia.games.onthisday.OnThisDayGameViewModel viewModel) {
    }
    
    private final void showArchiveCalendar(java.util.Date startDate, java.util.Date endDate, java.util.Map<java.lang.Long, java.lang.Integer> scoreData, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onDateSelected) {
    }
    
    private final void handleDateSelection(long selectedDateInMillis) {
    }
    
    public abstract void onArchiveDateSelected(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date);
    
    private final void maybeShowToastForDate(long selectedDateInMillis, java.util.Map<java.lang.Long, java.lang.Integer> scoreData) {
    }
    
    private final java.lang.Object getPrivateCalendarFragment(com.google.android.material.datepicker.MaterialDatePicker<?> picker) {
        return null;
    }
}