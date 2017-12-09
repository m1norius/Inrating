
package com.insta.minorius.insta.response.user_data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.insta.minorius.insta.response.user_posts.Rate;

public class UserDataResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("nickname")
    @Expose
    private String nickname;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("personal_status")
    @Expose
    private Object personalStatus;
    @SerializedName("link")
    @Expose
    private Object link;
    @SerializedName("avatar_post_id")
    @Expose
    private Integer avatarPostId;
    @SerializedName("birth_date")
    @Expose
    private String birthDate;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("gender")
    @Expose
    private Boolean gender;
    @SerializedName("instagram_link")
    @Expose
    private Object instagramLink;
    @SerializedName("facebook_link")
    @Expose
    private Object facebookLink;
    @SerializedName("city_geo_id")
    @Expose
    private Object cityGeoId;
    @SerializedName("posts_count")
    @Expose
    private Integer postsCount;
    @SerializedName("follow_count")
    @Expose
    private Integer followCount;
    @SerializedName("followers_count")
    @Expose
    private Integer followersCount;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getPersonalStatus() {
        return personalStatus;
    }

    public void setPersonalStatus(Object personalStatus) {
        this.personalStatus = personalStatus;
    }

    public Object getLink() {
        return link;
    }

    public void setLink(Object link) {
        this.link = link;
    }

    public Integer getAvatarPostId() {
        return avatarPostId;
    }

    public void setAvatarPostId(Integer avatarPostId) {
        this.avatarPostId = avatarPostId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Object getInstagramLink() {
        return instagramLink;
    }

    public void setInstagramLink(Object instagramLink) {
        this.instagramLink = instagramLink;
    }

    public Object getFacebookLink() {
        return facebookLink;
    }

    public void setFacebookLink(Object facebookLink) {
        this.facebookLink = facebookLink;
    }

    public Object getCityGeoId() {
        return cityGeoId;
    }

    public void setCityGeoId(Object cityGeoId) {
        this.cityGeoId = cityGeoId;
    }

    public Integer getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(Integer postsCount) {
        this.postsCount = postsCount;
    }

    public Integer getFollowCount() {
        return followCount;
    }

    public void setFollowCount(Integer followCount) {
        this.followCount = followCount;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
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
