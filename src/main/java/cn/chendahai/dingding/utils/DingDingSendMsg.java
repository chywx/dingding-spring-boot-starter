package cn.chendahai.dingding.utils;

import com.alibaba.fastjson.JSONObject;
import java.io.IOException;
import java.util.Arrays;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class DingDingSendMsg {

    public static final String DD_URL = "https://oapi.dingtalk.com/robot/send?access_token=";

    public static CloseableHttpClient client = HttpClientBuilder.create().build();

    public static int sendText(String content, String token, String phone, boolean isAll) {
        String url = DD_URL + token;
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader("Content-Type", "application/json; charset=utf-8");

        JSONObject bodys = new JSONObject();
        bodys.put("msgtype", "text");

        JSONObject text = new JSONObject();
        text.put("content", SystemMsg.getHostAddress() + "\n" + content);
        bodys.put("text", text);

        AtMobiles atMobiles = new AtMobiles();
        atMobiles.setAtMobiles(Arrays.asList(phone.split(",")));
        atMobiles.setIsAtAll(isAll);
        bodys.put("at", atMobiles);

//        {"at":{"atMobiles":["13121939122"],"isAtAll":true},"text":{"content":"haha"},"msgtype":"text"}
        System.out.println(bodys.toJSONString());
        StringEntity se = new StringEntity(bodys.toJSONString(), "utf-8");
        httpPost.setEntity(se);
        CloseableHttpResponse execute = null;
        try {
            execute = client.execute(httpPost);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return execute.getStatusLine().getStatusCode();
    }

}
