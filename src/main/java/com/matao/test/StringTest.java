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
		assertFalse(StringUtils.isBlank("aa"));
	}
	@Test
	public void testIsBlank1() {
		System.out.println(StringUtils.isBlank(" "));
		assertTrue(StringUtils.isBlank(" "));
	}
}
