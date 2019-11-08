package com.matao.beans;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
    * @ClassName: StringUtils
    * @Description: 字符串工具类
    * @author 马涛
    * @date 2019年11月7日
    *
 */
public class StringUtils {
	/**
	 * 
	    * @Title: main
	    * @Description:判断字符串是否为空
	    * @param @param args    参数
	    * @return void    返回类型
	    * @throws
	 */
	public static boolean isBlank(String str) {
		
		return (str == null||str.trim().equals(""));
	}
	/**
	 * 
	    * @Title: haveValue
	    * @Description:判断字符创是否有空值，空引号也算没值
	    * @param @param str
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	public static boolean haveValue(String str) {
		//trim方法 自动去除前后的空值
		return !(str == null||str.trim().equals(""));
	}
	/**
	 * 
	    * @Title: isPhoneNum
	    * @Description: 验证手机号码
	    * @param @param str
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	public static boolean isPhoneNum(String str) {
		String regex="^((13[0-9])|(14[5|7])|(15[0-3][5-9])|(17[013678])|(18[0,5-9]))/d{8}$";
		Pattern compile = Pattern.compile(regex);
		Matcher m = compile.matcher(str);
		return m.find();
	}
	/**
	 * 
	    * @Title: isEmail
	    * @Description:判断是否是邮箱地址
	    * @param @param email
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	public static boolean isEmail(String email) {
		String regex= "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern compile = Pattern.compile(regex);
		Matcher m = compile.matcher(email);
		return m.find();
	}
	/**
	 * 
	    * @Title: getRandomStr
	    * @Description: 获取n位随机英文字符串
	    * @param @param n
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	public static String getRandomStr(int n) {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			//sb.append((char)('A' + random.nextInt(26)));
			char c =(char)('A' + random.nextInt(26));
			sb.append(c);
			System.out.println("c is "+c);
			System.out.println("字符串是： "+sb);
		}
		return sb.toString();
	}
	/**
	 * 
	    * @Title: getRandomStr2
	    * @Description: 获取n位随机英文和数字字符串
	    * @param @param n
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	public static String getRandomStr2(int n) {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			int r =random.nextInt(36);
			if(r<26) {
				char c =(char)('A'+r);
				sb.append(c);
			}else {
				sb.append(r-26);
			}
		}
		return sb.toString();
	}
	/**
	 * 
	    * @Title: getRandomChinese
	    * @Description: 获取n为随机中文
	    * @param @param n
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	public static String getRandomChinese(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(getRandomCn());
		}
		return sb.toString();
	}
	/**
	 * 
	    * @Title: getRandomCn
	    * @Description: 获取随机中文
	    * @param @return    参数
	    * @return char    返回类型
	    * @throws
	 */
	private static char getRandomCn() {
		String str="";
		int hightPos;
		int lowPos;
		Random random = new Random();
		hightPos=(176+Math.abs(random.nextInt(39)));
		lowPos=(161+Math.abs(random.nextInt(93)));
		
		byte[] b=new byte[2];
		b[0]=(Integer.valueOf(hightPos)).byteValue();
		b[1]=(Integer.valueOf(lowPos)).byteValue();
		
		try {
			str = new String(b, "GBK");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("错误");
		}
		
		return str.charAt(0);
	}
	
}
