package com.gtmc.util;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.gtmc.common.macrodef.GtmcConst.CommonValue;

/**
 * DateUtil.java
 * 
 * @author common
 * 
 */
public class DateUtil {

	/** yyyy-MM-dd */
	public static final String FORMAT_YMD_1 = "yyyy-MM-dd";

	/** yyyy/MM/dd */
	public static final String FORMAT_YMD_2 = "yyyy/MM/dd";

	/** yyyyMMdd */
	public static final String FORMAT_YMD_3 = "yyyyMMdd";

	/** yy/MM/dd */
	public static final String FORMAT_YMD_4 = "yy/MM/dd";

	/** yyyy/M/d */
	public static final String FORMAT_YMD_5 = "yyyy/M/d";

	/** yyMMdd */
	public static final String FORMAT_YMD_6 = "yyMMdd";

	/** yyyy.MM.dd */
	public static final String FORMAT_YMD_7 = "yyyy.MM.dd";

	/** yyyyMM */
	public static final String FORMAT_YM_1 = "yyyyMM";

	/** yyyy/MM */
	public static final String FORMAT_YM_2 = "yyyy/MM";

	/** yyyy-MM-dd HH:mm:ss */
	public static final String FORMAT_DATE_TIME_1 = "yyyy-MM-dd HH:mm:ss";

	/** yyyy/MM/dd HH:mm:ss */
	public static final String FORMAT_DATE_TIME_2 = "yyyy/MM/dd HH:mm:ss";

	/** yyyyMMddHHmmss */
	public static final String FORMAT_DATE_TIME_3 = "yyyyMMddHHmmss";

	/** yyyy-MM-dd HH:mm */
	public static final String FORMAT_DATE_TIME_4 = "yyyy-MM-dd HH:mm";

	/** yyyy/MM/dd HH:mm */
	public static final String FORMAT_DATE_TIME_5 = "yyyy/MM/dd HH:mm";

	/** yyyy-MM-dd HH:mm:ss.SSS */
	public static final String FORMAT_DATE_TIME_6 = "yyyy-MM-dd HH:mm:ss.SSS";

	/** HHmmss */
	public static final String FORMAT_DATE_TIME_7 = "HHmmss";

	/** yyyyMMddHHmmss_SSS */
	public static final String FORMAT_DATE_TIME_8 = "yyyyMMddHHmmss_SSS";

	/** yyyyMMdd_HHmmssSSS */
	public static final String FORMAT_DATE_TIME_9 = "yyyyMMdd_HHmmssSSS";

	/** yyyyMMddHHmmssSSS */
	public static final String FORMAT_DATE_TIME_10 = "yyyyMMddHHmmssSSS";

	/** HH:mm */
	public static final String FORMAT_DATE_TIME_11 = "HH:mm";

	/** HH:mm:ss */
	public static final String FORMAT_DATE_TIME_12 = "HH:mm:ss";

	/** dd/MM/yyyy HH:mm:ss */
	public static final String FORMAT_DATE_TIME_13 = "dd/MM/yyyy HH:mm:ss";

	/**
	 * 日期format
	 * 
	 * @param date
	 *            日期
	 * @param toFormat
	 *            format格式
	 * @return format后日期
	 */
	public static String toString(Date date, String toFormat) {

		if (date == null) {
			return CommonValue.NULL_SPACE;
		}

		SimpleDateFormat df = new SimpleDateFormat(toFormat);
		df.setLenient(false);
		return df.format(date);
	}

	/**
	 * 日期格式check
	 * 
	 * @param date
	 *            check对象
	 * @param format
	 *            check格式
	 * @return check结果
	 */
	public static boolean isDate(String date, String format) {

		boolean isDate = true;
		DateFormat df = new SimpleDateFormat(format);
		try {
			if (!StringUtil.isEmpty(date)) {
				Date checkDate = df.parse(date);
				return date.equals(df.format(checkDate));
			}
		} catch (Exception e) {
			isDate = false;
		}
		return isDate;
	}

	/**
	 * Date Format To "HH:mm"
	 * 
	 * @param date
	 *            Date
	 * @return Date(String) Format: HH:mm:ss
	 */
	public static String formatDateHhmm(Date date) {
		return format(date, FORMAT_DATE_TIME_11);
	}

	/**
	 * Date Format To "HH:mm:ss"
	 * 
	 * @param date
	 *            Date
	 * @return Date(String) Format: HH:mm:ss
	 */
	public static String formatDateHhmmss(Date date) {
		return format(date, FORMAT_DATE_TIME_12);
	}

	/**
	 * Date Format
	 * 
	 * @param date
	 *            Date
	 * @param pattern
	 *            Format
	 * @return Date(String) Format: Format(@param)
	 */
	public static String format(Date date, String pattern) {
		if (null == date) {
			return CommonValue.NULL_SPACE;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

	/**
	 * String To Date
	 * 
	 * @param date
	 *            Date(String)
	 * @return Date(Date) Format: yyyy-MM-dd HH:mm:ss
	 * @throws Exception
	 *             Exception
	 */
	public static Date parseDate(String date) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_DATE_TIME_1);
		return sdf.parse(date);
	}

	/**
	 * String To Date
	 * 
	 * @param date
	 *            Date(String)
	 * @param format
	 *            format(String)
	 * @return Date(Date) Format: yyyy-MM-dd HH:mm:ss
	 * @throws Exception
	 *             Exception
	 */
	public static Date parseDate(String date, String format) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(date);
	}

	/**
	 * Date2(String) - Date1(String)
	 * 
	 * @param dateTime1
	 *            Date1(String)
	 * @param dateTime2
	 *            Date2(String)
	 * @return Date2(String) - Date1(String) hour
	 * @throws Exception
	 *             Exception
	 */
	public static BigDecimal subtractDate(String dateTime1, String dateTime2) throws Exception {

		Date date1 = parseDate(dateTime1);
		Date date2 = parseDate(dateTime2);
		return subtractDate(date1, date2);
	}

	/**
	 * Date2(Date) - Date1(Date)
	 * 
	 * @param dateTime1
	 *            Date1(Date)
	 * @param dateTime2
	 *            Date2(Date)
	 * @return Date2(Date) - Date1(Date) hour
	 * @throws Exception
	 *             Exception
	 */
	public static BigDecimal subtractDate(Date dateTime1, Date dateTime2) throws Exception {

		long l = dateTime2.getTime() - dateTime1.getTime();
		BigDecimal n = new BigDecimal(l).divide(new BigDecimal(1000 * 60 * 60), 1, BigDecimal.ROUND_HALF_DOWN);
		return n;
	}

	/**
	 * 获取系统时间
	 * 
	 * @return 系统时间
	 */
	public static String getSysDate() {

		Date date = new Date();
		DateFormat format = new SimpleDateFormat(FORMAT_DATE_TIME_1);

		return format.format(date);
	}

	/**
	 * 获取系统时间(yyyyMMdd)
	 * 
	 * @return 系统时间
	 */
	public static String getSysDateYmd() {
		Date date = new Date();
		DateFormat format = new SimpleDateFormat(FORMAT_YMD_3);
		return format.format(date);
	}

	public static String checkAndGetNextDay(String ymd) {
		String result = "";
		if (!StringUtil.isEmpty(ymd)) {
			result = ymd;
			if (ymd.length() == 10) {
				String year = ymd.substring(0, 4);
				String month = ymd.substring(5, 7);
				String day = ymd.substring(8, 10);
				if ("02".equals(month) && "29".equals(day)) {
					result = year + "-" + "03-01";
				}
			}
		}
		return result;
	}

	/**
	 * 两个时间相差距离多少秒
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 * @throws ParseException 
	 */
	public static long getDistanceTimes(String str1, String str2) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date one;
		Date two;
		long diff = 0;
		one = df.parse(str1);
		two = df.parse(str2);
		long time1 = one.getTime();
		long time2 = two.getTime();

		if (time1 < time2) {
			diff = time2 - time1;
		} else {
			diff = time1 - time2;
		}
		return diff / 1000;
	}

	/**
	 * 判断日期是否为今天
	 * @param time
	 * @return
	 * @throws Exception 
	 */
	public static boolean formatDateTime(String time) throws Exception {
		boolean flag = false;
		SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm");
		if (time == null || "".equals(time)) {
			return false;
		}else{
			Date date = null;
			date = format.parse(time);
			Calendar current = Calendar.getInstance();

			Calendar today = Calendar.getInstance(); // 今天
			today.set(Calendar.YEAR, current.get(Calendar.YEAR));
			today.set(Calendar.MONTH, current.get(Calendar.MONTH));
			today.set(Calendar.DAY_OF_MONTH, current.get(Calendar.DAY_OF_MONTH));
			// Calendar.HOUR——12小时制的小时数 Calendar.HOUR_OF_DAY——24小时制的小时数
			today.set(Calendar.HOUR_OF_DAY, 0);
			today.set(Calendar.MINUTE, 0);
			today.set(Calendar.SECOND, 0);

			current.setTime(date);

			if (current.after(today)) {
				flag = true;
			}
		}
		return flag;
	}
	
	// Add by liangxiao at 20170609 start 
	/*
	 * 当前日期加上天数后的日期
	 * @param num 为增加的天数
	 * @return
	 */
	public static String plusDay2(int num){
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Calendar ca = Calendar.getInstance();
		ca.add(Calendar.DATE, num);// num为增加的天数，可以改变的
		d = ca.getTime();
		String enddate = format.format(d);
		return enddate;
	}
	// Add by liangxiao at 20170609 end
	
}