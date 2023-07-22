package utilities;

import methods.RestAssuredMethods;

public class Constants {

	static RestAssuredMethods restAssuredMethods = new RestAssuredMethods();
	public static String name = restAssuredMethods.getAlphaNumericString(6);
	public static String jsonPath = System.getProperty("user.dir")+"src\\utilities\\Payload.json";


}
