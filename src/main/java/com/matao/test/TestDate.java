package com.matao.test;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

import com.matao.beans.DateUtils;

/**
 * 
    * @ClassName: TestDate
    * @Description: 日期测试类
    * @author 马涛
    * @date 2019年11月8日
    *
 */
public class TestDate {
	/**
	 * 
	    * @Title: testCompare
	    * @Description: 测试参数不为空
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
		@Test
		public void testCompare() {
			DateUtils.compare(null,new Date());
		}
	/**
	 * 
	    * @Title: testAge
	    * @Description:	测试计算年龄工具类
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
		@Test
		public void testAge() {
			
			Date now = new Date();
			//当当前时间==0的时候 就终止此次运行
			assertTrue(0==DateUtils.calculateAge(now));
			//输入birthday参与运算
			Date birthday = new Date(-12,7,8);
			int age = DateUtils.calculateAge(birthday);
			System.out.println( " age 是"+age);
		}
}	
