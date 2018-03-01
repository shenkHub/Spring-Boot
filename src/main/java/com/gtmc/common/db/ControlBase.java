package com.gtmc.common.db;

/**********************************************************
 * ControlBase.java
 * 
 * @author common
 * @version 1.0.0
 *
 **********************************************************/
public class ControlBase {

    /** log level */
    protected int logLevel;

    /** time out时间 */
    protected int alertTimeOut;

    /** log name */
    protected String logName;

    /**
     * 构造函数
     */
    public ControlBase() {
        logLevel = 1;
        alertTimeOut = 0;
    }

    /**
     * 设置log
     * @param logLevel logLevel
     * @param alertTimeOut alertTimeOut
     */
    public void setLogging(int logLevel, int alertTimeOut) {
        this.logLevel = logLevel;
        this.alertTimeOut = alertTimeOut;
    }

    /**
     * isLogLevelNone
     * @return 结果
     */
    public boolean isLogLevelNone() {
        return logLevel >= 0;
    }

    /**
     * isLogLevelInfo
     * @return 结果
     */
    public boolean isLogLevelInfo() {
        return logLevel >= 1;
    }

    /**
     * isLogLevelDetail
     * @return 结果
     */
    public boolean isLogLevelDetail() {
        return logLevel >= 2;
    }

    /**
     * isLogLevelDebug
     * @return 结果
     */
    public boolean isLogLevelDebug() {
        return logLevel >= 3;
    }

    /**
     * logLevel
     * @param logLevel logLevel
     * @return  logLevel
     */
    public static int toLogLevel(String logLevel) {
        if (logLevel.equals("info")) {
            return 1;
        }
        if (logLevel.equals("detail")) {
            return 2;
        }
        return !logLevel.equals("debug") ? 0 : 3;
    }

}
