package cn.chendahai.dingding.service;

import cn.chendahai.dingding.utils.DingDingSendMsg;

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

    public int send(String content) {
        return DingDingSendMsg.sendText(content, token, phone, false);
    }

    public int sendByPhone(String content, String phone) {
        return DingDingSendMsg.sendText(content, token, phone, false);
    }

    public int sendByToken(String content, String token) {
        return DingDingSendMsg.sendText(content, token, phone, false);
    }

    public int sendByTokenAndPhone(String content, String token, String phone) {
        return DingDingSendMsg.sendText(content, token, phone, false);
    }

    public int sendAll(String content) {
        return DingDingSendMsg.sendText(content, token, phone, true);
    }

    public int sendAllByToken(String content, String token) {
        return DingDingSendMsg.sendText(content, token, phone, true);
    }

}
