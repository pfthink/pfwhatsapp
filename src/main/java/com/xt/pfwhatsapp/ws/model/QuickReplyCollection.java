package com.xt.pfwhatsapp.ws.model;

import com.xt.pfwhatsapp.ws.WhatsAppClient;

public class QuickReplyCollection extends BaseCollection<QuickReplyCollectionItem> {

    public QuickReplyCollection(WhatsAppClient whatsAppClient) {
        super(whatsAppClient, CollectionType.QUICK_REPLY);
    }
}
