package com.insta.minorius.insta.adapter.view_holder;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.insta.minorius.insta.R;
import com.insta.minorius.insta.adapter.model.StatisticsItemWithoutRecycler;

import butterknife.BindView;

/**
 * Created by Minorius on 09.12.2017.
 */

public class StatisticsViewHolderWithoutRecycler extends BaseViewHolder<StatisticsItemWithoutRecycler> {

    @BindView(R.id.id_txt_item_statistics_title_without)    TextView title;
    @BindView(R.id.id_txt_item_statistics_count_without)    TextView count;
    @BindView(R.id.id_image_item_statistics_without)        ImageView imageView;

    public StatisticsViewHolderWithoutRecycler(ViewGroup parent) {
        super(parent, R.layout.item_statistics_without_recycler);
    }

    @Override
    protected void bindData(StatisticsItemWithoutRecycler data) {
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
    }
}
