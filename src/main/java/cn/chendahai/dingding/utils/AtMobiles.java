package cn.chendahai.dingding.utils;

import java.util.List;

/**
 * 功能描述
 *
 * @author chy
 * @date 2019/10/23 0023
 */
public class AtMobiles {

    /**
     * 被@人的手机号
     *
     * @return
     */
    private List<String> atMobiles;

    /**
     * @所有人时:true,否则为:false
     */
    private Boolean isIsAtAll;

    public List<String> getAtMobiles() {
        return atMobiles;
    }

    public void setAtMobiles(List<String> atMobiles) {
        this.atMobiles = atMobiles;
    }

    public Boolean getIsAtAll() {
        return isIsAtAll;
    }

    public void setIsAtAll(Boolean isAtAll) {
        isIsAtAll = isAtAll;
    }
}
