package com.gtmc.base.bean.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**********************************************************
 * BaseOutputInfo.java
 * 
 * @author common
 * @version 1.0.0
 *
 **********************************************************/
@XmlAccessorType(XmlAccessType.FIELD)
public class BaseOutputInfo implements Serializable {


    /** 是否处理成功flag */
    @XmlElement(required = true)
    private int returnFlag;

    /** 提示信息 */
    private String errorMessage;

    /**
     * 提示信息取得
     * 
     * @return 提示信息
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 提示信息设定
     * 
     * @param errorMessage 提示信息
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * 是否处理成功flag取得
     * 
     * @return 是否处理成功flag
     */
    public int getReturnFlag() {
        return returnFlag;
    }

    /**
     * 是否处理成功flag设定
     * 
     * @param returnFlag 是否处理成功flag
     */
    public void setReturnFlag(int returnFlag) {
        this.returnFlag = returnFlag;
    }

}
