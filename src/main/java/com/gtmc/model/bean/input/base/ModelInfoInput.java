package com.gtmc.model.bean.input.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.gtmc.base.bean.input.BaseInputInfo;

/**
 * 车型主数据取得Input
 * 
 * @author common
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ModelInfoInput extends BaseInputInfo {

    /** serialVersion */
    private static final long serialVersionUID = 1L;

    /** 增量时间戳 */
    @XmlElement(required = true)
    private String incrementalTime;

    /**
     * 增量时间戳取得
     * 
     * @return 增量时间戳
     */
    public String getIncrementalTime() {
        return incrementalTime;
    }

    /**
     * 增量时间戳设定
     * 
     * @param incrementalTime 增量时间戳
     */
    public void setIncrementalTime(String incrementalTime) {
        this.incrementalTime = incrementalTime;
    }
}
