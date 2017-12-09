package com.insta.minorius.insta.adapter.model;

/**
 * Created by Minorius on 09.12.2017.
 */

public class RecyclerItemHorizontal {
    private String imageUrl;
    private String userNickname;

    public RecyclerItemHorizontal(String imageUrl, String userName) {
        this.imageUrl = imageUrl;
        this.userNickname = userName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }
}
