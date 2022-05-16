/*
package com.xt.pfwhatsapp.controller;


import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.xt.pfwhatsapp.example.BanBotListener;
import com.xt.pfwhatsapp.ws.WhatsAppClient;
import com.xt.pfwhatsapp.ws.WhatsAppClientBuilder;
import com.xt.pfwhatsapp.ws.model.AuthInfo;
import com.xt.pfwhatsapp.ws.model.ChatCollectionItem;
import com.xt.pfwhatsapp.ws.model.MessageCollectionItem;
import com.xt.pfwhatsapp.ws.model.SendMessageRequest;
import com.xt.pfwhatsapp.ws.utils.Util;
import it.auties.whatsapp4j.manager.WhatsappDataManager;
import it.auties.whatsapp4j.response.impl.json.MessageResponse;
import it.auties.whatsapp4j.whatsapp.WhatsappAPI;
import it.auties.whatsapp4j.whatsapp.WhatsappConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;


*/
/**
 * @author pengfei
 * whatsapp web api
 * @date 2022/05/13 23:18 下午
 *//*




@RestController
@RequestMapping("/ws")
@Slf4j
public class WhatsappController {
    private static final String number = "8615221427093";

    */
/*private WhatsAppClient whatsAppClient;
    private CompletableFuture<AuthInfo> onAuthInfo;
    private CompletableFuture<Void> onConnect;
    private AuthInfo authInfo;
    private ChatCollectionItem chatCollectionItem;
    private CompletableFuture<MessageCollectionItem> eventAddMsg;
    private CompletableFuture<MessageCollectionItem> eventUpdateMsg;
    private MessageCollectionItem msgReceived;
    private MessageCollectionItem lastMsgSend;

    @GetMapping("/create_client")
    public Object createClient() {
        try {
            authInfo = loadAuthInfo();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        onAuthInfo = new CompletableFuture<>();
        onConnect = new CompletableFuture<>();
        whatsAppClient = new WhatsAppClientBuilder().withOnQrCode(s -> {
            System.out.println(s);
        }).withOnConnect(() -> {
            onConnect.complete(null);
        }).withOnAuthInfo(authInfo1 -> {
            try {
                saveAuthInfo(authInfo1);
            } catch (IOException e) {
                e.printStackTrace();
            }
            onAuthInfo.complete(authInfo1);
        }).withOnChangeDriverState(driverState -> {
            System.out.println(driverState);
        }).withAuthInfo(authInfo)
                .withForceMd(false).builder();
        whatsAppClient.connect();
        return "OK";
    }

    @GetMapping("/check_number")
    public Object checkNumberExists() {
        try {
            var result = whatsAppClient.checkNumberExist(number).get(30, TimeUnit.SECONDS);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "fail";
    }*//*


    @GetMapping("/check_connect")
    public Object checkConnect() {
        try {
            // Create a new instance of WhatsappAPI
            var api = new WhatsappAPI();

            // Register the ban listener
            api.registerListener(new BanBotListener(api));

            // Connect to WhatsappWeb's Servers
            api.connect();
        } catch (Exception e) {
            e.printStackTrace();
            return "ERROR";
        }

        return "OK";
    }

    @GetMapping("/send_message")
    public Object sendMessage() {
        try {
            System.out.println("Create whatsapp web api");
            var api = new WhatsappAPI();
            // Register the ban listener
            api.registerListener(new BanBotListener(api));
            // Connect to WhatsappWeb's Servers
            api.connect();
            System.out.println("connect whatsapp web api");
            WhatsappDataManager manager = api.manager();
            System.out.println("connect success,manager#chatsize:"+manager.chats().size());
            var chat = manager.findChatByName("joy").orElseThrow();
            api.sendMessage(chat, "Hello my friend :)");
        } catch (Exception e) {
            e.printStackTrace();
            return "FAIL";
        }
        return "OK";
    }

    private AuthInfo loadAuthInfo() throws FileNotFoundException {
        if (new File(new File("").getAbsolutePath() + "/cache/authInfo.json").exists()) {
            return Util.GSON.fromJson(new JsonReader(new FileReader(new File("").getAbsolutePath() + "/cache/authInfo.json")), AuthInfo.class);
        }
        return null;
    }

    private void saveAuthInfo(AuthInfo authInfo) throws IOException {
        new JsonWriter(new FileWriter(new File("").getAbsolutePath() + "/cache/authInfo.json")).jsonValue(Util.GSON.toJson(authInfo)).close();
    }


}

*/
