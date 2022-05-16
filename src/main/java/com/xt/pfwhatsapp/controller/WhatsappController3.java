package com.xt.pfwhatsapp.controller;

import it.auties.whatsapp.api.Whatsapp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengfei
 * whatsapp web api
 * @date 2022/05/13 23:18 下午
 */


@RestController
@RequestMapping("/ws")
@Slf4j
public class WhatsappController3 {
    private static final String number = "8615221427093";

    @GetMapping("/create_client")
    public Object createClient() {
        try {
            // Create a new instance of WhatsappAPI
            Whatsapp whatsapp = Whatsapp.lastConnection()
                    .connect()
                    .get();
            log.info("Connect success,whatsapp:{}", whatsapp);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "OK";
    }

    @GetMapping("/send_message")
    public Object send_message() {
        try {
            // Create a new instance of WhatsappAPI
            Whatsapp whatsapp = Whatsapp.lastConnection()
                    .connect()
                    .get();

            //whatsapp.sendMessage();
            log.info("Connect success,whatsapp:{}", whatsapp);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "OK";
    }


}

