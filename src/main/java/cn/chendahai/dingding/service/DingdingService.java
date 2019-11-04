package cn.chendahai.dingding.service;

import cn.chendahai.dingding.utils.DingDingSendMsg;
import java.util.Map;

/**
 * @author chy
 */
public class DingdingService {

    private String token;

    private String phone;

    public DingdingService(String token, String phone) {
        this.token = token;
        this.phone = phone;
    }

    public Map<String, Object> send(String content) {
        return DingDingSendMsg.sendText(content, token, phone, false);
    }

    public Map<String, Object> sendByPhone(String content, String phone) {
        return DingDingSendMsg.sendText(content, token, phone, false);
    }

    public Map<String, Object> sendByToken(String content, String token) {
        return DingDingSendMsg.sendText(content, token, phone, false);
    }

    public Map<String, Object> sendByTokenAndPhone(String content, String token, String phone) {
        return DingDingSendMsg.sendText(content, token, phone, false);
    }

    public Map<String, Object> sendAll(String content) {
        return DingDingSendMsg.sendText(content, token, phone, true);
    }

    public Map<String, Object> sendAllByToken(String content, String token) {
        return DingDingSendMsg.sendText(content, token, phone, true);
    }

}
