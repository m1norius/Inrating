package com.insta.minorius.insta.adapter.model;

/**
 * Created by Minorius on 09.12.2017.
 */

public class StatisticsItemWithoutRecycler implements Marker {

    private String title;
    private int count;

    public StatisticsItemWithoutRecycler(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
