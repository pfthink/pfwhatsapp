package com.xt.pfwhatsapp.ws.model;

import com.xt.pfwhatsapp.ws.WhatsAppClient;
import com.google.gson.JsonElement;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MessageCollection extends BaseCollection<MessageCollectionItem> {


    public MessageCollection(WhatsAppClient whatsAppClient) {
        super(whatsAppClient, CollectionType.MESSAGE);
    }

    @Override
    public CompletableFuture<Void> sync() {
        return CompletableFuture.failedFuture(new Exception("Method not supported"));
    }

    @Override
    protected List<MessageCollectionItem> processSync(JsonElement jsonElement) {
        return null;
    }
}
