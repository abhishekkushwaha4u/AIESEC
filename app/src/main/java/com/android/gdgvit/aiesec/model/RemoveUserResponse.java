package com.android.gdgvit.aiesec.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Akanshi on 7/19/2017.
 */

public class RemoveUserResponse {

    @SerializedName("msg")
    private String status;
    @SerializedName("code")
    private String code;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
