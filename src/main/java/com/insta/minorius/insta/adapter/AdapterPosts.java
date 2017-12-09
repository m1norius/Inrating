package com.insta.minorius.insta.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.insta.minorius.insta.adapter.view_holder.BaseViewHolder;
import com.insta.minorius.insta.adapter.view_holder.PostsViewHolder;
import com.insta.minorius.insta.response.user_posts.Datum;

import java.util.List;

/**
 * Created by Minorius on 08.12.2017.
 */

public class AdapterPosts extends RecyclerView.Adapter<BaseViewHolder> {

    private List<Datum> list;

    public AdapterPosts(List<Datum> list) {
        this.list = list;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PostsViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
