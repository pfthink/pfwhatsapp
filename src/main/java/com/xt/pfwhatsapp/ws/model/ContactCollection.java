package com.xt.pfwhatsapp.ws.model;

import com.xt.pfwhatsapp.ws.WhatsAppClient;

public class ContactCollection extends BaseCollection<ContactCollectionItem> {

    public ContactCollection(WhatsAppClient whatsAppClient) {
        super(whatsAppClient, CollectionType.CONTACTS);
    }
}
