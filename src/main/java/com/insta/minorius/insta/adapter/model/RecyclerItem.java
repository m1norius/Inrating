package com.insta.minorius.insta.adapter.model;

import java.util.List;

/**
 * Created by Minorius on 09.12.2017.
 */

public class RecyclerItem implements Marker{
    private String title;
    private int count;
    private List<RecyclerItemHorizontal> recyclerItemHorizontals;

    public RecyclerItem(String title) {
        this.title = title;
    }

    public RecyclerItem(String title, int count) {
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

    public List<RecyclerItemHorizontal> getRecyclerItemHorizontals() {
        return recyclerItemHorizontals;
    }

    public void setRecyclerItemHorizontals(List<RecyclerItemHorizontal> recyclerItemHorizontals) {
        this.recyclerItemHorizontals = recyclerItemHorizontals;
    }
}
