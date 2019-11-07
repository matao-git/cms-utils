package com.matao.beans;

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
	public static boolean isEmail(String email) {
		String regex= "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern compile = Pattern.compile(regex);
		Matcher m = compile.matcher(email);
		return m.find();
	}
}
