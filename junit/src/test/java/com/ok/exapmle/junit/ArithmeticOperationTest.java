package com.ok.exapmle.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArithmeticOperationTest {
	@Autowired
	private ArithmeticOperation ao;
	
	@Test
	public void testAdditionOfTwoValidNumber() {
		long result = ao.add(3, 4);
		System.out.println(result);
	}
	
	@Test
	public void testDivWithValidNumbers() throws Exception {
		double result = ao.div(8,5);
		assertEquals(8/5,result, 0.001);
	}
	
	@Test(expected = RuntimeException.class )
	public void testDivByZero() throws Exception {
		double result = ao.div(8, 0);
	}
	
//	@Test(expected = ArithmeticException.class )
//	public void testDivByZero1() throws Exception {
//		double result = ao.div(8, 0);
//	}
	
	@Test(expected = Exception.class)
	public void testDivByInvalidInput() throws Exception {
		double result = ao.div(88888888, 7777777);
	}
	

}
