package com.matao.beans;
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
}
