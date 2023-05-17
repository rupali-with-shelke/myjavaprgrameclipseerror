package testngconcepts;

import org.testng.annotations.Test;

public class PriorityExample {
	@Test(priority=-0)
	void TestOne() {
		System.out.println("This is test1");
	}
	@Test(priority=1)
	void TestTwo() {
		System.out.println("This is test2");
	}
	@Test(priority=0)
	void TestThree() {
		System.out.println("This is test3");
	}
	@Test(priority=2,enabled=false)
	void TestFour() {
		System.out.println("This is test4");
	}
	//By default testng follow alphabetical order
}
