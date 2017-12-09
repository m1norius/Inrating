
package com.insta.minorius.insta.response.user_posts;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("active")
    @Expose
    private Integer active;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("place_geo_id")
    @Expose
    private Object placeGeoId;
    @SerializedName("owner_id")
    @Expose
    private Integer ownerId;
    @SerializedName("views_count")
    @Expose
    private Integer viewsCount;
    @SerializedName("attachments_count")
    @Expose
    private Integer attachmentsCount;
    @SerializedName("comments_count")
    @Expose
    private Integer commentsCount;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("bookmarks_count")
    @Expose
    private Integer bookmarksCount;
    @SerializedName("reposts_count")
    @Expose
    private Integer repostsCount;
    @SerializedName("is_avatar")
    @Expose
    private Boolean isAvatar;
    @SerializedName("is_liked")
    @Expose
    private Boolean isLiked;
    @SerializedName("is_bookmarked")
    @Expose
    private Boolean isBookmarked;
    @SerializedName("is_reposted")
    @Expose
    private Boolean isReposted;
    @SerializedName("attachments")
    @Expose
    private List<Attachment> attachments = null;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("keywords")
    @Expose
    private List<Object> keywords = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
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

    public Object getPlaceGeoId() {
        return placeGeoId;
    }

    public void setPlaceGeoId(Object placeGeoId) {
        this.placeGeoId = placeGeoId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(Integer viewsCount) {
        this.viewsCount = viewsCount;
    }

    public Integer getAttachmentsCount() {
        return attachmentsCount;
    }

    public void setAttachmentsCount(Integer attachmentsCount) {
        this.attachmentsCount = attachmentsCount;
    }

    public Integer getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    public Integer getBookmarksCount() {
        return bookmarksCount;
    }

    public void setBookmarksCount(Integer bookmarksCount) {
        this.bookmarksCount = bookmarksCount;
    }

    public Integer getRepostsCount() {
        return repostsCount;
    }

    public void setRepostsCount(Integer repostsCount) {
        this.repostsCount = repostsCount;
    }

    public Boolean getIsAvatar() {
        return isAvatar;
    }

    public void setIsAvatar(Boolean isAvatar) {
        this.isAvatar = isAvatar;
    }

    public Boolean getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(Boolean isLiked) {
        this.isLiked = isLiked;
    }

    public Boolean getIsBookmarked() {
        return isBookmarked;
    }

    public void setIsBookmarked(Boolean isBookmarked) {
        this.isBookmarked = isBookmarked;
    }

    public Boolean getIsReposted() {
        return isReposted;
    }

    public void setIsReposted(Boolean isReposted) {
        this.isReposted = isReposted;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Object> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Object> keywords) {
        this.keywords = keywords;
    }

}
