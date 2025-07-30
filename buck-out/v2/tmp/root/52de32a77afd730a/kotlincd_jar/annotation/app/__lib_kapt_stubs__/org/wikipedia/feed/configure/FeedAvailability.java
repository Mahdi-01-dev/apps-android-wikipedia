package org.wikipedia.feed.configure;

import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import org.wikipedia.games.onthisday.OnThisDayGameViewModel;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\bR\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\bR\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/feed/configure/FeedAvailability;", "", "()V", "featuredArticle", "", "", "getFeaturedArticle$annotations", "getFeaturedArticle", "()Ljava/util/List;", "featuredPicture", "getFeaturedPicture$annotations", "getFeaturedPicture", "games", "getGames$annotations", "getGames", "mostRead", "getMostRead$annotations", "getMostRead", "news", "getNews$annotations", "getNews", "onThisDay", "getOnThisDay$annotations", "getOnThisDay", "app.lib"})
public final class FeedAvailability {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> featuredArticle = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> mostRead = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> featuredPicture = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> news = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> onThisDay = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> games = null;
    
    public FeedAvailability() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getFeaturedArticle() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "todays_featured_article")
    @java.lang.Deprecated()
    public static void getFeaturedArticle$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getMostRead() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "most_read")
    @java.lang.Deprecated()
    public static void getMostRead$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getFeaturedPicture() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "picture_of_the_day")
    @java.lang.Deprecated()
    public static void getFeaturedPicture$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getNews() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "in_the_news")
    @java.lang.Deprecated()
    public static void getNews$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getOnThisDay() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "on_this_day")
    @java.lang.Deprecated()
    public static void getOnThisDay$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getGames() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "games")
    @java.lang.Deprecated()
    public static void getGames$annotations() {
    }
}