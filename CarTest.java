

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarTest
{

	private int expectedWheels;
	private Car myCar;

	@BeforeClass
	public static void setUpBeforeClass () throws Exception
	{
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass () throws Exception
	{
		System.out.println("AfterClass");
	}

	@Before
	public void setUp () throws Exception
	{
		System.out.println("Before");
		expectedWheels = 4;
		myCar = new Car();
	}

	@After
	public void tearDown () throws Exception
	{
		System.out.println("After");
		myCar = null;
	}

	@Test
	public void testGetWheels1 ()
	{
		System.out.println("Test1");
		assertEquals(expectedWheels, myCar.getWheels());
	}

	@Test
	public void testGetWheels2 ()
	{
		System.out.println("Test2");
		assertEquals(expectedWheels, myCar.getWheels());
	}
	
	@Test
	public void testGetWheelsAgain ()
	{
		assertEquals(expectedWheels, myCar.getWheels());
	}

}
