
package com.insta.minorius.insta.response.user_posts;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("nickname")
    @Expose
    private String nickname;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("avatar_post_id")
    @Expose
    private Integer avatarPostId;
    @SerializedName("rate")
    @Expose
    private Rate rate;
    @SerializedName("active_gift")
    @Expose
    private Object activeGift;
    @SerializedName("typed_rate")
    @Expose
    private List<Object> typedRate = null;
    @SerializedName("is_voted")
    @Expose
    private Boolean isVoted;
    @SerializedName("is_subscribe")
    @Expose
    private Boolean isSubscribe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAvatarPostId() {
        return avatarPostId;
    }

    public void setAvatarPostId(Integer avatarPostId) {
        this.avatarPostId = avatarPostId;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public Object getActiveGift() {
        return activeGift;
    }

    public void setActiveGift(Object activeGift) {
        this.activeGift = activeGift;
    }

    public List<Object> getTypedRate() {
        return typedRate;
    }

    public void setTypedRate(List<Object> typedRate) {
        this.typedRate = typedRate;
    }

    public Boolean getIsVoted() {
        return isVoted;
    }

    public void setIsVoted(Boolean isVoted) {
        this.isVoted = isVoted;
    }

    public Boolean getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(Boolean isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

}
