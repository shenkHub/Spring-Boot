package com.gtmc.util;

import java.util.Random;
import java.util.UUID;

/**
 * 随机生成数字和字母
 * 
 * @author Administrator
 * 
 */
public class RandomUtil {

	// 生成随机数字和字母
	public static String getStringRandom(int length) {

		String val = "";
		Random random = new Random();

		// 参数length，表示生成几位随机数
		for (int i = 0; i < length; i++) {

			String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
			// 输出字母还是数字
			if ("char".equalsIgnoreCase(charOrNum)) {
				// 输出是大写字母还是小写字母
				int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
				val += (char) (random.nextInt(26) + temp);
			} else if ("num".equalsIgnoreCase(charOrNum)) {
				val += String.valueOf(random.nextInt(10));
			}
		}
		return val;
	}

	// 生成制定长度随机数
	public static String getSixNumRandom(int length) {
		Random random = new Random();
		String result = "";
		for (int i = 0; i < length; i++) {
			result += random.nextInt(10);
		}
		return result;
	}

	// 生成UUID
	public static String getUUID() {
		String s = UUID.randomUUID().toString();
		// 去掉“-”符号
		return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18)
				+ s.substring(19, 23) + s.substring(24);
	}

	// add for iclub2app站内信同步 xie_dandan 201701/06 Start
	// 生成4位随机数字
	public static String getNumRandom(int length) {
		int pross = (int) (10000 * (Math.random()));
		String val = String.valueOf(pross);
		return val;
	}

	public static void main(String[] args) {
		System.out.println(getSixNumRandom(6));
	}
	// add for iclub2app站内信同步 xie_dandan 201701/06 End
}
