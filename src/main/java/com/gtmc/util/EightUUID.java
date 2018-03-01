package com.gtmc.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * 根据UUID生成8位缩短版UUID
 * @author wanghao
 *
 */
public class EightUUID {
	public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
			"w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
			"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
	/**
	 * 1.生成32位唯一UUID，去掉UUID的‘-’。
	 * 2.每4位截取UUID 16进制数字。
	 * 3.将16进制数字转换成10进制数字。
	 * 4.对10进制数字用62求余，余数为几，就取得是哪个字符。
	 * 5.测试8000W记录不重复 理论上是永不重复的
	 * @return
	 */
	public static String generateShortUuid() {
		StringBuffer shortBuffer = new StringBuffer();
		String uuid = UUID.randomUUID().toString().replace("-", "");
		for (int i = 0; i < 8; i++) {
			String str = uuid.substring(i * 4, i * 4 + 4);
			int x = Integer.parseInt(str, 16);//将16进制转换为10进制
			shortBuffer.append(chars[x % 62]);//取出对应的字符
		}
		return shortBuffer.toString();  
	}
	
	/**
	 * 1.批量生成唯一优惠券码
	 * 2.循环条件为set的size等于count
	 * 3.5位码最大生成数为10万个
	 * @param constantCode 固定码
	 * @param count 需要生成的随机数数量
	 * @param length 长度
	 * @return
	 */
	public static Set<String> getCouponId(String constantCode,int count,int length) {
		Set<String> set = new HashSet<>();
		do {
			String code = constantCode + RandomUtil.getSixNumRandom(length);
			set.add(code);
		} while (set.size() != count);
		return set;
	}
	
	/**
	 * DB优惠券码与本次优惠券码对比去重
	 * @param constantCode 固定码
	 * @param list DB优惠券码
	 * @param count 生成总数
	 * @param length 优惠券码长度
	 * @return
	 */
	public static Set<String> contrastArray(String constantCode, List<String> list, int count, int length) {
		/* 
		 * 判断最大生成数是否超出
		 */
		Set<String> repeatSet = new HashSet<>();
		int gather = list.size() + count;
		if(gather >= 100000){
			return null;
		}
		/* *******************************************
		 * 1、将DBlist转set
		 * 2、计算需要生成的优惠券数量
		 * 3、根据needCount生成优惠券码
		 * 4、循环新生成的优惠券码
		 * 5、记录dbRepeatSet的数量
		 * 6、将新生成的优惠券码放进dbRepeatSet中
		 * 7、判断dbRepeatSet的size是否增长，增长表示不重复
		 * 8、不重复放入repeatSet中
		 * 9、循环结束条件repeatSet数量满足需要生成的优惠券
		 * *******************************************
		 */
		Set<String> dbRepeatSet = new HashSet<>();
		for (String dbcode : list) {
			dbRepeatSet.add(dbcode);
		}
		do{
			int needCount = count - repeatSet.size();
			Set<String> newCodeSet = getCouponId(constantCode, needCount, length);
			for (String newCode : newCodeSet) {
				int dbcount = dbRepeatSet.size();
				dbRepeatSet.add(newCode);
				if(dbRepeatSet.size() > dbcount){
					repeatSet.add(newCode);
				}
				if(repeatSet.size() == count){
					break;
				}
			}
		} while(repeatSet.size() != count);
		return repeatSet;
	}
}
