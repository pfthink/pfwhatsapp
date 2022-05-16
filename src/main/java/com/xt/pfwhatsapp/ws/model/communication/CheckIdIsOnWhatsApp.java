package com.xt.pfwhatsapp.ws.model.communication;

import com.xt.pfwhatsapp.ws.utils.Util;

public record CheckIdIsOnWhatsApp(String jid) implements IWARequest {

    public CheckIdIsOnWhatsApp(String jid) {
        this.jid = Util.convertJidToSend(jid);
    }

    @Override
    public String toJson() {
        var data = new Object[]{
                "query",
                "exist",
                jid
        };
        return Util.GSON.toJson(data);
    }
}
