package com.gtmc.base.bean.entity;

import java.io.Serializable;

/**********************************************************
 * BaseEntity.java
 * 
 * @author common
 * @version 1.0.0
 *
 **********************************************************/
public class BaseEntity implements Serializable {

    /** serialVersion */
    private static final long serialVersionUID = 1L;

    /** 其他 */
    private String other;

    /**
     * get
     *
     * @return 結果
     */
    public String getOther() {

        return other;
    }

    /**
     * set
     *
     * @param other 
     */
    public void setOther(String other) {

        this.other = other;
    }

}
