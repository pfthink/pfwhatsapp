package com.xt.pfwhatsapp.ws.model;

import com.xt.pfwhatsapp.ws.WhatsAppClient;

public class ChatCollection extends BaseCollection<ChatCollectionItem> {

    public ChatCollection(WhatsAppClient whatsAppClient) {
        super(whatsAppClient, CollectionType.CHAT);
    }
}
