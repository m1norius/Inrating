package com.insta.minorius.insta.adapter.view_holder;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.insta.minorius.insta.App;
import com.insta.minorius.insta.R;
import com.insta.minorius.insta.adapter.AdapterHorizontal;
import com.insta.minorius.insta.adapter.AdapterStatistics;
import com.insta.minorius.insta.adapter.model.RecyclerItem;

import butterknife.BindView;

/**
 * Created by Minorius on 09.12.2017.
 */

public class StatisticsViewHolder extends BaseViewHolder<RecyclerItem> {

    @BindView(R.id.id_image_item_statistics)        ImageView imageView;
    @BindView(R.id.id_txt_item_statistics_title)    TextView title;
    @BindView(R.id.id_txt_item_statistics_count)    TextView count;

    @BindView(R.id.id_recycler_horizontal)          RecyclerView recyclerView;

    private AdapterHorizontal adapterHorizontal;

    public StatisticsViewHolder(ViewGroup parent) {
        super(parent, R.layout.item_statistics_with_recycler);
    }

    @Override
    protected void bindData(RecyclerItem data) {
        title.setText(data.getTitle());
        count.setText(String.valueOf(data.getCount()));

        switch (data.getTitle()) {
            case "Просмотры":
                imageView.setImageResource(R.drawable.ic_views);
                break;
            case "Лайки":
                imageView.setImageResource(R.drawable.ic_heart);
                break;
            case "Комментаторы":
                imageView.setImageResource(R.drawable.ic_comments);
                break;
            case "Отметки":
                imageView.setImageResource(R.drawable.ic_mark);
                break;
            case "Репосты":
                imageView.setImageResource(R.drawable.ic_repost);
                break;
            case "Закладки":
                imageView.setImageResource(R.drawable.ic_bookmarker);
                break;
        }

        if (data.getRecyclerItemHorizontals() != null){
            adapterHorizontal = new AdapterHorizontal(data.getRecyclerItemHorizontals());
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
            recyclerView.setAdapter(adapterHorizontal);
        }
    }
}
