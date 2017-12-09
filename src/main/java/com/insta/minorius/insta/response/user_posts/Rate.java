
package com.insta.minorius.insta.response.user_posts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rate {

    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("proportion")
    @Expose
    private Integer proportion;
    @SerializedName("percent")
    @Expose
    private Integer percent;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getProportion() {
        return proportion;
    }

    public void setProportion(Integer proportion) {
        this.proportion = proportion;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

}
