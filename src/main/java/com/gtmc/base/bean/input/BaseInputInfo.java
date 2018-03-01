package com.gtmc.base.bean.input;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**********************************************************
 * BaseInputInfo.java
 * 
 * @author common
 * @version 1.0.0
 *
 **********************************************************/
@XmlAccessorType(XmlAccessType.FIELD)
public class BaseInputInfo implements Serializable {

    /** serialVersion */
    private static final long serialVersionUID = 1L;

    /** 来源系统代码*/
    @XmlElement(required = true)
    private String fromSystemCode;

    /** 发送系统代码*/
    @XmlElement(required = true)
    private String toSystemCode;

    /** 消息ID */
    @XmlElement(required = true)
    private String messagId;
    // Add by jiao_jianying 20170122 for i-Club项目二期【积分渠道&内容信息追加】 start
    /**发生源系统[0：i-Club本体/ 1：微信公众号/ 2：丰云行app / 3：丰云惠/ 4：分享链接 / 5：微信企业号/ 6：二维码/ 7：TACT/ 8：iPad售后 /9：CVM/ 10：i-Crop / 999：其他]*/
    @XmlElement(required = true)
    private String chgSourceSys;
    // Add by jiao_jianying 20170122 for i-Club项目二期【积分渠道&内容信息追加】 end
    /**
     * 来源系统代码取值
     * 
     * @return 来源系统代码
     */
    public String getFromSystemCode() {
        return fromSystemCode;
    }

    /**
     * 来源系统代码设定
     * 
     * @param fromSystemCode 来源系统代码
     */
    public void setFromSystemCode(String fromSystemCode) {
        this.fromSystemCode = fromSystemCode;
    }

    /**
     * 消息ID取得
     * 
     * @return 消息ID
     */
    public String getMessagId() {
        return messagId;
    }

    /**
     * 消息ID设定
     * 
     * @param messagId 消息ID
     */
    public void setMessagId(String messagId) {
        this.messagId = messagId;
    }

    /**
     * 发送系统代码取值
     * 
     * @return 发送系统代码
     */
    public String getToSystemCode() {
        return toSystemCode;
    }

    /**
     * 发送系统代码设定
     * 
     * @param toSystemCode 发送系统代码
     */
    public void setToSystemCode(String toSystemCode) {
        this.toSystemCode = toSystemCode;
    }
    // Add by jiao_jianying 20170122 for i-Club项目二期【积分渠道&内容信息追加】 start
    public String getChgSourceSys() {
        return chgSourceSys;
    }

    public void setChgSourceSys(String chgSourceSys) {
        this.chgSourceSys = chgSourceSys;
    }
    // Add by jiao_jianying 20170122 for i-Club项目二期【积分渠道&内容信息追加】 end
}
