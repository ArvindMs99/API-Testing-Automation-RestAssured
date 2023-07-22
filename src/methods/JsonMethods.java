package methods;

import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import utilities.*;

public class JsonMethods {
	
	 private int expectedCount = 3;
	 private int expectedPurchaseAmount = 910;
	 private String expectedCourseTitle = "Selenium Python";
	 private int expectedCopies = 10;
	 private int courseSize;
	 private int totalCoursesAmount = 0;
	 private int purchaseAmount = 910;

	 JsonPath jsonPath = new JsonPath(Payload.jsonPayload());
	 
		public void verifyCourseCount() {
			int actualCount = Integer.parseInt(jsonPath.get("courses.size()").toString());
			assertEquals(actualCount,expectedCount);
			courseSize = actualCount;
		} 
		
		public void verifyPurchaseAmount() {
			int actualPurchaseAmount = Integer.parseInt(jsonPath.get("dashboard.purchaseAmount").toString());
			assertEquals(actualPurchaseAmount,expectedPurchaseAmount);
		} 

		public void verifyFirstCourseTitle() {
			String actualCourseTitle = jsonPath.get("courses[0].title").toString();
			assertEquals(actualCourseTitle,expectedCourseTitle);
		} 
		
		public void verifyRPACopies() {
			int actualCopies = Integer.parseInt(jsonPath.get("courses[2].copies").toString());
			assertEquals(actualCopies,expectedCopies);
		} 
		
		public void verifyAllCourses() {			
			for (int i = 0; i < courseSize; i++) {
				String courseTitles = jsonPath.get("courses["+i+"].title").toString();
				int coursePrices = Integer.parseInt(jsonPath.get("courses["+i+"].price").toString());
				System.out.println(courseTitles);
				System.out.println(coursePrices);
			}
		} 
		
		public void verifyPurchaseAmountCoursePrice() {			
			for (int i = 0; i < courseSize; i++) {
				int coursePrices = Integer.parseInt(jsonPath.get("courses["+i+"].price").toString());
				int courseCopies = Integer.parseInt(jsonPath.get("courses["+i+"].copies").toString());
				int coursesAmount = coursePrices * courseCopies;
				totalCoursesAmount+=coursesAmount;
			}
				assertEquals(totalCoursesAmount,purchaseAmount);
		} 
	}


