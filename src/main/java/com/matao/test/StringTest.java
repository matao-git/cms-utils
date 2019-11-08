package com.matao.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.matao.beans.StringUtils;

public class StringTest {
	
	@Test
	public void testIsBlank() {
		// TODO Auto-generated method stub
		System.out.println(StringUtils.isBlank(" "));
		//断言 假
		assertFalse(StringUtils.isBlank("aa"));
	}
	@Test
	public void testIsBlank1() {
		System.out.println(StringUtils.isBlank(" "));
		//断言 真
		assertTrue(StringUtils.isBlank(" "));
	}
	@Test
	public void testRandomn() {
		String s =StringUtils.getRandomStr(10);
		System.out.println("s is ::"+s);
	}
	@Test
	public void testStrRland() {
		String s =StringUtils.getRandomStr2(25);
		System.out.println("s is "+s+" and 长度是 "+s.length());
	}
}
