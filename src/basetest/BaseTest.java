package basetest;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import methods.JsonMethods;
import methods.RestAssuredMethods;

public class BaseTest {
	public RestAssuredMethods restAssuredMethods = new RestAssuredMethods();
	public JsonMethods jsonMethods = new JsonMethods();

	@BeforeTest
	public void setup() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
	}	
}
