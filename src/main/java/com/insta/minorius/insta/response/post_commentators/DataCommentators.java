
package com.insta.minorius.insta.response.post_commentators;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataCommentators {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("on_post")
    @Expose
    private Integer onPost;
    @SerializedName("from_user")
    @Expose
    private Integer fromUser;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("response_to_comment")
    @Expose
    private Object responseToComment;
    @SerializedName("author")
    @Expose
    private Author author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOnPost() {
        return onPost;
    }

    public void setOnPost(Integer onPost) {
        this.onPost = onPost;
    }

    public Integer getFromUser() {
        return fromUser;
    }

    public void setFromUser(Integer fromUser) {
        this.fromUser = fromUser;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getResponseToComment() {
        return responseToComment;
    }

    public void setResponseToComment(Object responseToComment) {
        this.responseToComment = responseToComment;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
