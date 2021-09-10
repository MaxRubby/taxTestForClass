package com.swpu.util;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import com.swpu.util.TaxCalculator;

public class taxTest {

	 @Test
	public void testNULL() {
		 assertNotNull(new TaxCalculator());
	} 
	@Test
	public void test0() {
		assertEquals(0, new TaxCalculator().TaxC(0,20));
	}
	@Test
	public void test1500() {
		assertEquals(0, new TaxCalculator().TaxC(1500,20));
	}
	@Test
	public void test4500() {
		assertEquals(6, new TaxCalculator().TaxC(4500,800));
	}

	@Test
	public void test9000() {
		assertEquals(385, new TaxCalculator().TaxC(9000,800));
	}
	
	@Test
	public void test35000() {
		assertEquals(6670, new TaxCalculator().TaxC(35000,800));
	}
	@Test
	public void test55000() {
		assertEquals(12455, new TaxCalculator().TaxC(55000,800));
	}
	
	@Test
	public void test80000() {
		assertEquals(20990, new TaxCalculator().TaxC(80000,800));
	}
	
}
