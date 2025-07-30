package org.wikipedia.feed.onthisday;

import kotlinx.serialization.Serializable;
import org.wikipedia.dataclient.page.PageSummary;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDay;", "", "()V", "births", "", "Lorg/wikipedia/feed/onthisday/OnThisDay$Event;", "deaths", "events", "getEvents", "()Ljava/util/List;", "holidays", "allEvents", "Event", "app.lib"})
public final class OnThisDay {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.feed.onthisday.OnThisDay.Event> events = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.feed.onthisday.OnThisDay.Event> births = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.feed.onthisday.OnThisDay.Event> deaths = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.feed.onthisday.OnThisDay.Event> holidays = null;
    
    public OnThisDay() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.feed.onthisday.OnThisDay.Event> getEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.feed.onthisday.OnThisDay.Event> allEvents() {
        return null;
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDay$Event;", "", "pages", "", "Lorg/wikipedia/dataclient/page/PageSummary;", "text", "", "year", "", "(Ljava/util/List;Ljava/lang/String;I)V", "getPages", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "getYear", "()I", "app.lib"})
    public static final class Event {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.dataclient.page.PageSummary> pages = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String text = null;
        private final int year = 0;
        
        public Event(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.wikipedia.dataclient.page.PageSummary> pages, @org.jetbrains.annotations.NotNull()
        java.lang.String text, int year) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.dataclient.page.PageSummary> getPages() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
            return null;
        }
        
        public final int getYear() {
            return 0;
        }
        
        public Event() {
            super();
        }
    }
}