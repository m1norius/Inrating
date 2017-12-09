package com.insta.minorius.insta;

import com.insta.minorius.insta.response.post_commentators.CommentatorsResponse;
import com.insta.minorius.insta.response.post_mentions.MentionsResponse;
import com.insta.minorius.insta.response.user_data.DataRequestBody;
import com.insta.minorius.insta.response.user_data.UserDataResponse;
import com.insta.minorius.insta.response.post_likers.LikersResponse;
import com.insta.minorius.insta.response.user_posts.UserAllPostsResponse;
import com.insta.minorius.insta.response.post_reposters.RepostersResponse;
import com.insta.minorius.insta.response.user_token.TokenBody;
import com.insta.minorius.insta.response.user_token.TokenResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Minorius on 08.12.2017.
 */

public interface RestService {

    @POST("oauth/token")
    Call<TokenResponse> getToken(@Body TokenBody tokenBody);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("v1/me")
    Call<UserDataResponse> getUserData(@Body DataRequestBody dataRequestBody, @Header("Authorization") String token);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("v1/users/posts/all")
    Call<UserAllPostsResponse> getUserPosts(@Query("author_id") int author_id, @Header("Authorization") String token);








    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("v1/users/posts/likers/all")
    Call<LikersResponse> getLikersPostById(@Query("id") int id, @Header("Authorization") String token);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("v1/users/posts/reposters/all")
    Call<RepostersResponse> getRepostersPostById(@Query("id") int id, @Header("Authorization") String token);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("v1/users/posts/comments/all")
    Call<CommentatorsResponse> getCommentatorsPostById(@Query("post_id") int id, @Header("Authorization") String token);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("v1/users/posts/mentions/all")
    Call<MentionsResponse> getMentionsInPostById(@Query("id") int id, @Header("Authorization") String token);
}
