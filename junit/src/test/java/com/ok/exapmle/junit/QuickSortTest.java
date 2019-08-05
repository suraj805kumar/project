package com.ok.exapmle.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * some basic JUnit annotations you should understand:
 * 
 * @BeforeClass – Run once before any of the test methods in the class, public
 *              static void
 * @AfterClass – Run once after all the tests in the class have been run, public
 *             static void
 * @Before – Run before @Test, public void
 * @After – Run after @Test, public void
 * @Test – This is the test method to run, public void
 *
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuickSortTest {

	@Autowired
	private QuickSort qs;

	private int[] input;
	private int[] output;

	@BeforeClass
	public static void setUpForTestClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void destroyForTestClass() {
		System.out.println("@AfterClass");
	}

	/**
	 * Before each test method.
	 */
	@Before
	public void setUpForEachTest() {
		System.out.println("@Before");
		input = new int[] { 23, 44, 55, 1, 67, 78, 34, 65, 88, 47 };
		output = new int[] { 1, 23, 34, 44, 47, 55, 65, 67, 78, 88 };
	}

	/**
	 * After each test method.
	 */
	@After
	public void destroyForEachTest() {
		System.out.println("@After");
		input = null;
		output = null;
	}

	@Test
	public void testQuickSortWithValidInput() {
		System.out.println("Test1");
		// assertEquals(expected, actual);quickSort.sort(input);
		int[] expectedResult = output;
		int[] actualResult = qs.sort(input);

		// assertArrayEquals(expectedResult, actualResult);
		// input = new int[] { 23, 44, 55, 1, 67, 78, 34, 65, 88, 47 };
		assertArrayEquals("Quick sort is not working!", input, actualResult);
		// Quick sort is not working!: arrays first differed at element [0]; expected:<23> but was:<1>
		
		assertEquals(qs.printArray(output), qs.printArray(qs.sort(input)));
	}

	@Test
	public void testQuickSortWithValidInputInvalidOutput() {
		System.out.println("Test2");
		assertNotEquals(qs.printArray(input), qs.printArray(qs.sort(input)));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivisionWithException() {
		int i = 1 / 0;
	}

//	@Test(expected = ArithmeticException.class)
//	public void testDivisionWithException1() {
//		// int i = 1 / 0; //java.lang.ArithmeticException: / by zero
//		// fail("Devide By zero."); //java.lang.AssertionError: Devide By zero.
//
//		// java.lang.AssertionError: Expected exception: java.lang.ArithmeticException
//	}
	
	@Test
    public void testEmptyList() {
        try {
            new ArrayList<>().get(0);
            fail();//remember this line, else 'may' false positive
        } catch (IndexOutOfBoundsException e) {
            assertEquals(new ArrayList<>().size(), 0);
        }
    }

	////////// OUTPUT/////////////
	/*
	 * @BeforeClass
	 * @Before 
	 * Test1
	 * @After
	 * @Before
	 * Test2
	 * @After
	 * @AfterClass
	 */

}
