package com.insta.minorius.insta;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.insta.minorius.insta.adapter.AdapterPosts;
import com.insta.minorius.insta.response.user_data.DataRequestBody;
import com.insta.minorius.insta.response.user_data.UserDataResponse;
import com.insta.minorius.insta.response.user_posts.Datum;
import com.insta.minorius.insta.response.user_posts.UserAllPostsResponse;

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

public class UserPostsActivity extends AppCompatActivity {

    int userId;
    RestService restService;
    public static String token;

    @BindView(R.id.id_recycler_posts) RecyclerView recyclerView;

    List<Datum> list = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);
        ButterKnife.bind(this);
        token = "Bearer "+getIntent().getExtras().getString("TOKEN");

        restService = App.getRest().create(RestService.class);
        Call<UserDataResponse> userDataResponseCall = restService.getUserData(new DataRequestBody(), token);
        userDataResponseCall.enqueue(new Callback<UserDataResponse>() {
            @Override
            public void onResponse(Call<UserDataResponse> call, Response<UserDataResponse> response) {
                if (response.body() != null){
                    userId = response.body().getId();

                    Call<UserAllPostsResponse> postsCall = restService.getUserPosts(userId, token);
                    postsCall.enqueue(new Callback<UserAllPostsResponse>() {
                        @Override
                        public void onResponse(Call<UserAllPostsResponse> call, Response<UserAllPostsResponse> response) {
                            if (response.body()!=null){

                                list.addAll(response.body().getData());

                                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
                                recyclerView.setAdapter(new AdapterPosts(list));
                            }
                        }

                        @Override
                        public void onFailure(Call<UserAllPostsResponse> call, Throwable t) {

                        }
                    });
                }
            }

            @Override
            public void onFailure(Call<UserDataResponse> call, Throwable t) {

            }
        });




    }
}
