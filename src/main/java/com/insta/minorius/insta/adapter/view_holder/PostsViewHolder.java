package com.insta.minorius.insta.adapter.view_holder;

import android.content.Intent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.insta.minorius.insta.App;
import com.insta.minorius.insta.R;
import com.insta.minorius.insta.StatisticsActivity;
import com.insta.minorius.insta.response.user_posts.Datum;

import butterknife.BindView;
import butterknife.OnClick;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

/**
 * Created by Minorius on 08.12.2017.
 */

public class PostsViewHolder extends BaseViewHolder<Datum> {

    @BindView(R.id.id_txt_item_post) TextView title;
    @BindView(R.id.id_txt_item_date) TextView date;

    @BindView(R.id.id_image_post)    ImageView imageView;

    private String baseUrl = "https://media.inrating.top/images/small/";
    private int postId;
    private Datum datum;

    public PostsViewHolder(ViewGroup parent) {
        super(parent, R.layout.item_post);
    }

    @Override
    protected void bindData(Datum datum) {
        this.datum = datum;
        postId = datum.getId();
        title.setText(datum.getTitle());
        date.setText(datum.getCreatedAt());

        Glide.with(getContext())
                .load(baseUrl+datum.getAttachments().get(0).getBody())
                .into(imageView);
    }

    @OnClick
    public void onClick(){
        Intent intent = new Intent(getContext(), StatisticsActivity.class);
        intent.putExtra("POST_ID", postId);
        intent.putExtra("VIEWS_COUNT", datum.getViewsCount());
        intent.putExtra("BOOK_MARKS", datum.getBookmarksCount());
        intent.putExtra("REPOSTS_COUNT", datum.getRepostsCount());

        getContext().startActivity(intent);
    }
}
