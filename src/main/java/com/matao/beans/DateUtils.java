package com.matao.beans;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
    * @ClassName: DateUtils
    * @Description:日期工具类
    * @author 马涛
    * @date 2019年11月8日
    *
 */
public class DateUtils {
	/**
	 * 一天有多少毫秒
	 */
	static final long millionSecondPerDay = 10000 * 60 * 60 * 24;
	
	/*public static void main(String[] args) {
		System.out.println(millionSecondPerDay);
	}*/
	/**
	 * 
	    * @Title: compare
	    * @Description:	设置日期参数不能为空
	    * @param @param date1
	    * @param @param date2
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */
	public static int compare(Date date1,Date date2) {
		if(date1==null || date2==null) {
			throw new RuntimeException("参数不能为空");
		}
		return date1.compareTo(date2);
	}
	/**
	 * 
	    * @Title: calculateAge
	    * @Description:	计算当前年龄
	    * @param @param birthday
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */
	public static int calculateAge(Date birthday) {
		//birthday必须早于当前时间
		if(birthday.compareTo(new Date())>0) {
			throw new RuntimeException("给定的日期不能大于当前日期"+birthday);
		}
		//计算 birthday的 年月 日
		//实例化对象，用于存放日期
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(birthday);
		
		int bdYear = calendar.get(Calendar.YEAR);//出生的年份
		int bdMonth = calendar.get(Calendar.MONTH);//出生的月份
		int bdDay = calendar.get(Calendar.DAY_OF_MONTH);//出生的天数
		
		System.out.println(" bdYear: "+bdYear+" bdMonth:"+bdMonth + " bdDay: " + bdDay);
		
		//计算当前年月日
		calendar.setTime(new Date());
		
		int currentYear = calendar.get(Calendar.YEAR);//现在的年份
		int currentMonth = calendar.get(Calendar.MONTH);//现在的月份
		int currentDay = calendar.get(Calendar.DAY_OF_MONTH);//现在的天数
		
		System.out.println(
				" currentYear: " + currentYear + " currentMonth:" + currentMonth + " currentDay: " + currentDay);
			int  age = currentYear-bdYear;
			if(currentMonth<bdMonth) {
				age--;
			}else if(currentMonth == bdMonth&&currentDay<bdDay){
				age--;
			}
			return age;
	}
	/**
	 * 
	    * @Title: remainDays
	    * @Description: 计算将来的一个日期 还剩余多少天
	    * @param @param futureDate
	    * @param @return
	    * @param @throws CmsException    参数
	    * @return int    返回类型
	    * @throws
	 */
	public static int remainDays(Date futureDate) throws CmsException {
		/**
		 *给定的参数是否合法，小于当前日期则认为不合法，抛出异常
		 */
		if(futureDate.compareTo(new Date())<0) {
			throw new CmsException("未来日期不能小于当前日期： "+futureDate);
		}
		//计算有多少天
		int days =(int) (futureDate.getTime()-new Date().getTime());
		return days;
	}
	/**
	 * 
	    * @Title: isToday
	    * @Description: 判断是否是今天
	    * @param @param date
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */
	public static int isToday(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		//获取日期的字符串
		String dateStr = sdf.format(date);
		
		//获取日期的字符串
		String todayStr = sdf.format(new Date());
		
		return (dateStr.compareTo(todayStr));
	}

	
}
