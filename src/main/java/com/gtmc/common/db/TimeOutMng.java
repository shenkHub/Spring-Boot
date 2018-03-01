package com.gtmc.common.db;

import java.util.Calendar;

/**********************************************************
 * TimeOutMng.java
 * 
 * @author common
 * @version 1.0.0
 *
 **********************************************************/
public class TimeOutMng {

	protected Calendar start;
	protected int timeout;

	/**
	 * 延时设定
	 * 
	 * @param timeout 延时时间
	 * @return 延时管理对象
	 */
	public static TimeOutMng set(int timeout) {
		return new TimeOutMng(timeout);
	}

	/**
	 * 构造函数 
	 * 
	 * @param timeout 延时时间
	 */
	public TimeOutMng(int timeout) {
		this.start = Calendar.getInstance();
		this.timeout = timeout;
	}

	/**
	 * 经过时间
	 * 
	 * @return 经过时间(s)
	 */
	public int diff() {
		if (this.timeout > 0) {
			Calendar now = Calendar.getInstance();
			return (int) ((now.getTimeInMillis() - this.start.getTimeInMillis()) / 1000);
		}
		return 0;
	}

	/**
	 * 超时判断
	 * 
	 * @return true：超时
	 */
	public boolean isTimeOut() {
		if (this.timeout > 0) {
			Calendar now = Calendar.getInstance();
			int diff = (int) ((now.getTimeInMillis() - this.start
					.getTimeInMillis()) / 1000);
			return diff > this.timeout;
		}
		return false;
	}
}
