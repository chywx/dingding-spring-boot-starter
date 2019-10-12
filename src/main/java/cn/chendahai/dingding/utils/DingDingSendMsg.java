package cn.chendahai.dingding.utils;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.taobao.api.ApiException;

import java.util.Arrays;

public class DingDingSendMsg {

//    钉钉报警的url
    public static final String DD_URL = "https://oapi.dingtalk.com/robot/send?access_token=";

    public static void sendText(String msg,String token,String phone) {
        OapiRobotSendRequest request = getRequest(msg, phone);
        try {
            new DefaultDingTalkClient(DD_URL+token).execute(request);
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    public static OapiRobotSendRequest getRequest(String msg, String phone){
        OapiRobotSendRequest request = new OapiRobotSendRequest();
        request.setMsgtype("text");
        OapiRobotSendRequest.Text text = new OapiRobotSendRequest.Text();
        text.setContent(SystemMsg.getHostAddress()+"\n"+msg);
        request.setText(text);
        OapiRobotSendRequest.At at = new OapiRobotSendRequest.At();
        at.setAtMobiles(Arrays.asList(phone));
        request.setAt(at);
        return request;
    }
}
