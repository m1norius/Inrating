package com.insta.minorius.insta.adapter.view_holder;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.insta.minorius.insta.App;
import com.insta.minorius.insta.R;
import com.insta.minorius.insta.adapter.model.RecyclerItemHorizontal;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

/**
 * Created by Minorius on 09.12.2017.
 */

public class HorizontalViewHolder extends BaseViewHolder<RecyclerItemHorizontal> {

    @BindView(R.id.id_image_item_horizontal)    ImageView imageView;
    @BindView(R.id.id_txt_item_horizontal)      TextView textView;

    private String baseUrl = "https://media.inrating.top/images/small/";

    public HorizontalViewHolder(ViewGroup parent) {
        super(parent, R.layout.item_statistics_horizontal);
    }

    @Override
    protected void bindData(RecyclerItemHorizontal data) {
        textView.setText(data.getUserNickname());
        Glide.with(getContext())
                .load(baseUrl+data.getImageUrl())
                .apply(RequestOptions.bitmapTransform(new RoundedCornersTransformation(10, 0)))
                .into(imageView);

        //Picasso.with(getContext()).load(baseUrl+data.getImageUrl()).into(imageView);
    }
}
