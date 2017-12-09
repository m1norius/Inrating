package com.insta.minorius.insta;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.insta.minorius.insta.adapter.AdapterPosts;
import com.insta.minorius.insta.adapter.AdapterStatistics;
import com.insta.minorius.insta.adapter.model.Marker;
import com.insta.minorius.insta.adapter.model.RecyclerItem;
import com.insta.minorius.insta.adapter.model.RecyclerItemHorizontal;
import com.insta.minorius.insta.adapter.model.StatisticsItemWithoutRecycler;
import com.insta.minorius.insta.response.post_commentators.CommentatorsResponse;
import com.insta.minorius.insta.response.post_commentators.DataCommentators;
import com.insta.minorius.insta.response.post_likers.Data;
import com.insta.minorius.insta.response.post_likers.LikersResponse;
import com.insta.minorius.insta.response.post_mentions.DataMentions;
import com.insta.minorius.insta.response.post_mentions.MentionsResponse;
import com.insta.minorius.insta.response.post_reposters.DataReposters;
import com.insta.minorius.insta.response.post_reposters.RepostersResponse;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Minorius on 08.12.2017.
 */

public class StatisticsActivity extends AppCompatActivity {

    @BindView(R.id.id_recycler_statistics)  RecyclerView recyclerView;
    @BindView(R.id.id_image_title_arrow)    ImageView arrow;

    AdapterStatistics adapterStatistics;
    Marker[] recyclerItems;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_statistics);
        ButterKnife.bind(this);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        int postId = getIntent().getExtras().getInt("POST_ID");

        int viewCount = getIntent().getExtras().getInt("VIEWS_COUNT");
        int bookMarks = getIntent().getExtras().getInt("BOOK_MARKS");
        int repostsCount = getIntent().getExtras().getInt("REPOSTS_COUNT");

        recyclerItems = new Marker[6];

        recyclerItems[0] = new StatisticsItemWithoutRecycler("Просмотры", App.views_count);
        recyclerItems[1] = new RecyclerItem("Лайки");
        recyclerItems[2] = new RecyclerItem("Комментаторы");
        recyclerItems[3] = new RecyclerItem("Отметки");
        recyclerItems[4] = new RecyclerItem("Репосты");
        recyclerItems[5] = new StatisticsItemWithoutRecycler("Закладки", bookMarks);

        adapterStatistics = new AdapterStatistics(recyclerItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapterStatistics);


       RestService restService = App.getRest().create(RestService.class);

        Call<MentionsResponse> mentionsInPostById = restService.getMentionsInPostById(postId, UserPostsActivity.token);
        mentionsInPostById.enqueue(new Callback<MentionsResponse>() {
            @Override
            public void onResponse(Call<MentionsResponse> call, Response<MentionsResponse> response) {

                if (response.body()!=null){

                    RecyclerItem recyclerItem = new RecyclerItem("Отметки", response.body().getData().size());

                    List<RecyclerItemHorizontal> recyclerItemHorizontalList = new ArrayList<>();
                    for (DataMentions data : response.body().getData()){
                        recyclerItemHorizontalList.add(new RecyclerItemHorizontal(data.getAvatar(), data.getNickname()));
                    }
                    recyclerItem.setRecyclerItemHorizontals(recyclerItemHorizontalList);
                    recyclerItems[3] = recyclerItem;
                    adapterStatistics.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<MentionsResponse> call, Throwable t) {

            }
        });

        Call<LikersResponse> postById = restService.getLikersPostById(postId, UserPostsActivity.token);

        postById.enqueue(new Callback<LikersResponse>() {
            @Override
            public void onResponse(Call<LikersResponse> call, Response<LikersResponse> response) {
                if (response.body()!=null){

                    RecyclerItem recyclerItem = new RecyclerItem("Лайки", response.body().getData().size());

                    List<RecyclerItemHorizontal> recyclerItemHorizontalList = new ArrayList<>();
                    for (Data data : response.body().getData()){
                        recyclerItemHorizontalList.add(new RecyclerItemHorizontal(data.getAvatar(), data.getNickname()));
                    }
                    recyclerItem.setRecyclerItemHorizontals(recyclerItemHorizontalList);
                    recyclerItems[1] = recyclerItem;
                    adapterStatistics.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<LikersResponse> call, Throwable t) {

            }
        });

        Call<RepostersResponse> postRepostsById = restService.getRepostersPostById(postId, UserPostsActivity.token);
        postRepostsById.enqueue(new Callback<RepostersResponse>() {
            @Override
            public void onResponse(Call<RepostersResponse> call, Response<RepostersResponse> response) {

                if (response.body()!=null){
                    RecyclerItem recyclerItem = new RecyclerItem("Репосты", response.body().getData().size());

                    List<RecyclerItemHorizontal> recyclerItemHorizontalList = new ArrayList<>();
                    for (DataReposters data : response.body().getData()){
                        recyclerItemHorizontalList.add(new RecyclerItemHorizontal(data.getAvatar(), data.getNickname()));
                    }
                    recyclerItem.setRecyclerItemHorizontals(recyclerItemHorizontalList);
                    recyclerItems[4] = recyclerItem;
                    adapterStatistics.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<RepostersResponse> call, Throwable t) {

            }
        });


        Call<CommentatorsResponse> postCommentatorById = restService.getCommentatorsPostById(postId, UserPostsActivity.token);
        postCommentatorById.enqueue(new Callback<CommentatorsResponse>() {
            @Override
            public void onResponse(Call<CommentatorsResponse> call, Response<CommentatorsResponse> response) {

                if (response.body()!=null){
                    RecyclerItem recyclerItem = new RecyclerItem("Комментаторы", response.body().getData().size());

                    List<RecyclerItemHorizontal> recyclerItemHorizontalList = new ArrayList<>();
                    for (DataCommentators data : response.body().getData()){
                        App.myLog(data.getAuthor().getAvatar());
                        recyclerItemHorizontalList.add(new RecyclerItemHorizontal(data.getAuthor().getAvatar(), data.getAuthor().getNickname()));
                    }
                    recyclerItem.setRecyclerItemHorizontals(recyclerItemHorizontalList);
                    recyclerItems[2] = recyclerItem;
                    adapterStatistics.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<CommentatorsResponse> call, Throwable t) {

            }
        });

    }
}
