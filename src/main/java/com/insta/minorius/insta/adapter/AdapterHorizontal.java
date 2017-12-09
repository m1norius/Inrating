package com.insta.minorius.insta.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.insta.minorius.insta.adapter.model.RecyclerItemHorizontal;
import com.insta.minorius.insta.adapter.view_holder.BaseViewHolder;
import com.insta.minorius.insta.adapter.view_holder.HorizontalViewHolder;

import java.util.List;

/**
 * Created by Minorius on 09.12.2017.
 */

public class AdapterHorizontal extends RecyclerView.Adapter<BaseViewHolder> {

    private List<RecyclerItemHorizontal> recyclerItemHorizontals;

    public AdapterHorizontal(List<RecyclerItemHorizontal> recyclerItemHorizontals) {
        this.recyclerItemHorizontals = recyclerItemHorizontals;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HorizontalViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bind(recyclerItemHorizontals.get(position));
    }

    @Override
    public int getItemCount() {
        return recyclerItemHorizontals.size();
    }
}
