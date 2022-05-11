package listenerConcept;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class ListenerTest {
	@Test
	public void test1() {
		System.out.println("I am inside test1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside test2");
		

	}
	@Test
	public void test3() {
		System.out.println("I am inside test3");
		throw new SkipException("this test3 skiped");

	}

}
