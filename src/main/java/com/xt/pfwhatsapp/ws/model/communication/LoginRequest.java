package com.xt.pfwhatsapp.ws.model.communication;

import com.xt.pfwhatsapp.ws.model.AuthInfo;
import com.xt.pfwhatsapp.ws.utils.Util;

public class LoginRequest implements IWARequest {

    private final AuthInfo authInfo;

    public LoginRequest(AuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    @Override
    public String toJson() {
        var dataInit = new Object[]{
                "admin",
                "login",
                authInfo.getClientToken(),
                authInfo.getServerToken(),
                authInfo.getClientId(),
                "takeover"
        };
        return Util.GSON.toJson(dataInit);
    }

}
