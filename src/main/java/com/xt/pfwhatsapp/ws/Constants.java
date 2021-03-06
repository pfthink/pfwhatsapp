package com.xt.pfwhatsapp.ws;

import com.google.common.hash.Hashing;
import com.xt.pfwhatsapp.ws.model.MessageType;

import java.nio.charset.Charset;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class Constants {

    public static final String WS_URL = "wss://web.whatsapp.com/com.xt.pfwhatsapp.ws";
    public static final String WS_URL_MD = "wss://web.whatsapp.com/com.xt.pfwhatsapp.ws/chat";
    public static final String ORIGIN_WS = "https://web.whatsapp.com";
    public static final Integer[] WS_VERSION = new Integer[]{2, 2212, 7};
    public static final String ENCODED_VERSION = Base64.getEncoder().encodeToString(Hashing.md5().newHasher().putString(WS_VERSION[0] + "." + WS_VERSION[1] + "." + WS_VERSION[2], Charset.defaultCharset()).hash().asBytes());
    public static final String[] WS_BROWSER_DESC = new String[]{"Zapia", "Chrome", "4.0.0"};
    public static final byte[] NOISE_WA_HEADER = new byte[]{87, 65, 5, 2};
    public static final String NOISE_MODE = "Noise_XX_25519_AESGCM_SHA256\0\0\0\0";
    public static final int KEEP_ALIVE_INTERVAL_MS = 20 * 1000;
    public static final int WA_DEFAULT_EPHEMERAL = 7 * 24 * 60 * 60;

    public static final String DEF_CALLBACK_PREFIX = "CB:";

    public static final String DEF_TAG_PREFIX = "TAG:";
    public static final Map<MessageType, String> HKDFInfoKeys = new HashMap<>() {{
        put(MessageType.IMAGE, "WhatsApp Image Keys");
        put(MessageType.AUDIO, "WhatsApp Audio Keys");
        put(MessageType.VIDEO, "WhatsApp Video Keys");
        put(MessageType.DOCUMENT, "WhatsApp Document Keys");
        put(MessageType.STICKER, "WhatsApp Image Keys");
    }};
    public static final Map<MessageType, String> MediaPathMap = new HashMap<>() {{
        put(MessageType.IMAGE, "/mms/image");
        put(MessageType.AUDIO, "/mms/audio");
        put(MessageType.VIDEO, "/mms/video");
        put(MessageType.DOCUMENT, "/mms/document");
        put(MessageType.STICKER, "/mms/image");
    }};
}
