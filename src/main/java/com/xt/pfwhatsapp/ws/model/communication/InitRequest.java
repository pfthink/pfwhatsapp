package com.xt.pfwhatsapp.ws.model.communication;

import com.xt.pfwhatsapp.ws.Constants;
import com.xt.pfwhatsapp.ws.utils.Util;

public class InitRequest implements IWARequest {

    private final String clientId;

    public InitRequest(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toJson() {
        var dataInit = new Object[]{
                "admin",
                "init",
                Constants.WS_VERSION,
                Constants.WS_BROWSER_DESC,
                clientId,
                true
        };
        return Util.GSON.toJson(dataInit);
    }
}
