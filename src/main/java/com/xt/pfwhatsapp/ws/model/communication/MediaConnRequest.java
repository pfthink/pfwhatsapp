package com.xt.pfwhatsapp.ws.model.communication;

import com.xt.pfwhatsapp.ws.utils.Util;

public class MediaConnRequest implements IWARequest {
    @Override
    public String toJson() {
        var data = new Object[]{
                "query",
                "mediaConn"
        };
        return Util.GSON.toJson(data);
    }
}
