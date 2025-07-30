package org.wikipedia.analytics.eventplatform;

import org.wikipedia.WikipediaApp;
import org.wikipedia.settings.Prefs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/PlacesEvent;", "", "()V", "Companion", "app.lib"})
public final class PlacesEvent {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.PlacesEvent.Companion Companion = null;
    
    public PlacesEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0002\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/PlacesEvent$Companion;", "", "()V", "logAction", "", "action", "", "activeInterface", "actionData", "logImpression", "submitPlacesInteractionEvent", "app.lib"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void logImpression(@org.jetbrains.annotations.NotNull()
        java.lang.String activeInterface) {
        }
        
        public final void logAction(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        java.lang.String activeInterface, @org.jetbrains.annotations.NotNull()
        java.lang.String actionData) {
        }
        
        private final void submitPlacesInteractionEvent(java.lang.String action, java.lang.String activeInterface, java.lang.String actionData) {
        }
    }
}