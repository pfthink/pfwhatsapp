package com.xt.pfwhatsapp.ws.model.communication;

import com.xt.pfwhatsapp.ws.utils.Util;

public class RefreshQrRequest implements IWARequest {

    @Override
    public String toJson() {
        var data = new Object[]{
                "admin",
                "Conn",
                "reref"
        };
        return Util.GSON.toJson(data);
    }

}
