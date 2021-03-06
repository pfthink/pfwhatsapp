package com.xt.pfwhatsapp.ws.model;

import com.xt.pfwhatsapp.ws.WhatsAppClient;
import com.xt.pfwhatsapp.ws.utils.Util;
import com.google.gson.JsonObject;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class BaseCollectionItem<T extends BaseCollectionItem<T>> {

    protected static final Logger logger = Logger.getLogger(BaseCollectionItem.class.getName());

    protected String id;
    protected transient final WhatsAppClient whatsAppClient;
    protected transient JsonObject jsonObject;
    protected transient BaseCollection<T> selfCollection;

    public BaseCollectionItem(WhatsAppClient whatsAppClient, JsonObject jsonObject) {
        this.whatsAppClient = whatsAppClient;
        this.jsonObject = jsonObject;
        buildFromJson();
    }

    public void setSelfCollection(BaseCollection<T> selfCollection) {
        this.selfCollection = selfCollection;
    }

    public String getId() {
        return id;
    }

    public JsonObject getJsonObject() {
        return jsonObject;
    }

    public void triggerChange() {
        if (selfCollection != null)
            selfCollection.triggerEvent(EventType.CHANGE, List.of((T) this));
    }

    //TODO: build base properties
    private void buildFromJson() {
        try {
            build();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Build CollectionItem", e);
        }
        if (jsonObject.get("jid") != null && !jsonObject.get("jid").isJsonNull() && !jsonObject.get("jid").getAsString().isEmpty())
            id = Util.convertJidReceived(jsonObject.get("jid").getAsString());
        else if (jsonObject.get("id") != null && !jsonObject.get("id").isJsonNull() && !jsonObject.get("id").getAsString().isEmpty())
            id = jsonObject.get("id").getAsString();
    }

    //TODO: update base properties

    public final void updateFromOther(T baseCollectionItem) {
        update(baseCollectionItem);
    }

    public final void updateFromJson(JsonObject jsonObject) {
        this.jsonObject = jsonObject;
        update(jsonObject);
    }

    abstract void build();

    protected abstract void update(T baseCollectionItem);

    protected abstract void update(JsonObject jsonElement);
}
