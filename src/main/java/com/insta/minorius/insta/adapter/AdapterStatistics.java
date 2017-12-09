package com.insta.minorius.insta.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.insta.minorius.insta.App;
import com.insta.minorius.insta.adapter.model.Marker;
import com.insta.minorius.insta.adapter.model.RecyclerItem;
import com.insta.minorius.insta.adapter.model.StatisticsItemWithoutRecycler;
import com.insta.minorius.insta.adapter.view_holder.BaseViewHolder;
import com.insta.minorius.insta.adapter.view_holder.StatisticsViewHolder;
import com.insta.minorius.insta.adapter.view_holder.StatisticsViewHolderWithoutRecycler;

/**
 * Created by Minorius on 09.12.2017.
 */

public class AdapterStatistics extends RecyclerView.Adapter<BaseViewHolder> {

    private Marker[] array;

    public AdapterStatistics(Marker[] list) {
        this.array = list;
    }


    @Override
    public int getItemViewType(int position) {
        Marker marker = array[position];

        if (marker instanceof StatisticsItemWithoutRecycler){
            return 1;
        }else if (marker instanceof RecyclerItem){
            return 2;
        }

        App.myLog("getItemViewType "+position);
        return super.getItemViewType(position);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 1){
            return new StatisticsViewHolderWithoutRecycler(parent);
        }
        return new StatisticsViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bind(array[position]);
    }

    @Override
    public int getItemCount() {
        return array.length;
    }
}
