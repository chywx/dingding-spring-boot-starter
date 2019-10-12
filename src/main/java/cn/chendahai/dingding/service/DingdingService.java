package cn.chendahai.dingding.service;

import cn.chendahai.dingding.utils.DingDingSendMsg;

public class DingdingService {
    private String token;

//    private String suffix;

    public DingdingService(String token) {
        this.token = token;
//        this.suffix = suffix;
    }

    public String send(String msg){
        DingDingSendMsg.sendText(msg,token,null);
        return "send success";
    }
}
