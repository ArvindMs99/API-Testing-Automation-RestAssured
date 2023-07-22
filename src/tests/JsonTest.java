package tests;

import org.testng.annotations.Test;
import basetest.BaseTest;

public class JsonTest extends BaseTest{
	
	@Test(priority = 1)
	public void verifyCourseCount() {
		jsonMethods.verifyCourseCount();
	}
	
	@Test(priority = 2)
	public void verifyPurchaseAmount() {
		jsonMethods.verifyPurchaseAmount();
	}
	
	@Test(priority = 3)
	public void verifyFirstCourseTitle() {
		jsonMethods.verifyFirstCourseTitle();
	}
	
	@Test(priority = 4)
	public void verifyRPACopies() {
		jsonMethods.verifyRPACopies();
	}
	
	@Test(priority = 5)
	public void verifyAllCourses() {
		jsonMethods.verifyAllCourses();
	}
	
	@Test(priority = 6)
	public void verifyPurchaseAmountCoursePrice() {
		jsonMethods.verifyPurchaseAmountCoursePrice();
	}
}