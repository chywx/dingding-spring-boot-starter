package cn.chendahai.dingding.service;

import cn.chendahai.dingding.utils.DingDingSendMsg;
import java.util.Map;

/**
 * @author Dylan
 */
public class DingdingService {

    private String token;

    private String phone;

    public DingdingService() {
    }

    public DingdingService(String token, String phone) {
        this.token = token;
        this.phone = phone;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @param content Content information sent
     */
    public Map<String, Object> send(String content) {
        return DingDingSendMsg.sendText(content, token, phone, false);
    }

    /**
     * @param content Content information sent
     * @param phone Mobile phone number, multiple separated by a comma
     */
    public Map<String, Object> sendByPhone(String content, String phone) {
        return DingDingSendMsg.sendText(content, token, phone, false);
    }

    /**
     * @param content Content information sent
     * @param token dingding token
     */
    public Map<String, Object> sendByToken(String content, String token) {
        return DingDingSendMsg.sendText(content, token, phone, false);
    }

    /**
     * @param content Content information sent
     * @param token dingding token
     * @param phone Mobile phone number, multiple separated by a comma
     */
    public Map<String, Object> sendByTokenAndPhone(String content, String token, String phone) {
        return DingDingSendMsg.sendText(content, token, phone, false);
    }

    /**
     * @param content Content information sent
     */
    public Map<String, Object> sendAll(String content) {
        return DingDingSendMsg.sendText(content, token, phone, true);
    }

    /**
     * @param content Content information sent
     * @param token dingding token
     */
    public Map<String, Object> sendAllByToken(String content, String token) {
        return DingDingSendMsg.sendText(content, token, phone, true);
    }
}
