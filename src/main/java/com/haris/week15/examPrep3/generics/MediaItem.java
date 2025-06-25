package com.haris.week15.examPrep3.generics;

import java.util.List;

public class MediaItem {
    private int mediaId;
    private String title;

    public MediaItem(int mediaId, String title) {
        this.mediaId = mediaId;
        this.title = title;
    }

    public int getMediaId() {
        return mediaId;
    }
    public void setMediaId(int mediaId) {
        this.mediaId = mediaId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
