package utilities;

public class Payload {
	
public static String postPayload(String name) {
	return "{ \r\n"
			+ "\r\n"
			+ "  \"location\": { \r\n"
			+ "\r\n"
			+ "    \"lat\": -38.383494, \r\n"
			+ "\r\n"
			+ "    \"lng\": 33.427362 \r\n"
			+ "\r\n"
			+ "  }, \r\n"
			+ "\r\n"
			+ "  \"accuracy\": 50, \r\n"
			+ "\r\n"
			+ "  \"name\": \""+name+"\", \r\n"
			+ "\r\n"
			+ "  \"phone_number\": \"(+91) 983 893 3937\", \r\n"
			+ "\r\n"
			+ "  \"address\": \"29, side layout, cohen 09\", \r\n"
			+ "\r\n"
			+ "  \"types\": [ \r\n"
			+ "\r\n"
			+ "    \"shoe park\", \r\n"
			+ "\r\n"
			+ "    \"shop\" \r\n"
			+ "\r\n"
			+ "  ], \r\n"
			+ "\r\n"
			+ "  \"website\": \"http://google.com\", \r\n"
			+ "\r\n"
			+ "  \"language\": \"French-IN\" \r\n"
			+ "\r\n"
			+ "} ";
}
	

public static String putPayload(String placeID,String Address) {
return "{ \r\n"
		+ "\r\n"
		+ "\"place_id\":\""+placeID+"\", \r\n"
		+ "\r\n"
		+ "\"address\":\""+Address+"\", \r\n"
		+ "\r\n"
		+ "\"key\":\"qaclick123\" \r\n"
		+ "\r\n"
		+ "}";
}	

public static String deletePayload(String placeID) {
return "{ \r\n"
		+ "\r\n"
		+ "    \"place_id\":\""+placeID+"\" \r\n"
		+ "\r\n"
		+ "} ";
}	

public static String jsonPayload() {
return "{\r\n"
		+ "\r\n"
		+ "\"dashboard\": {\r\n"
		+ "\r\n"
		+ "\"purchaseAmount\": 910,\r\n"
		+ "\r\n"
		+ "\"website\": \"rahulshettyacademy.com\"\r\n"
		+ "\r\n"
		+ "},\r\n"
		+ "\r\n"
		+ "\"courses\": [\r\n"
		+ "\r\n"
		+ "{\r\n"
		+ "\r\n"
		+ "\"title\": \"Selenium Python\",\r\n"
		+ "\r\n"
		+ "\"price\": 50,\r\n"
		+ "\r\n"
		+ "\"copies\": 6\r\n"
		+ "\r\n"
		+ "},\r\n"
		+ "\r\n"
		+ "{\r\n"
		+ "\r\n"
		+ "\"title\": \"Cypress\",\r\n"
		+ "\r\n"
		+ "\"price\": 40,\r\n"
		+ "\r\n"
		+ "\"copies\": 4\r\n"
		+ "\r\n"
		+ "},\r\n"
		+ "\r\n"
		+ "{\r\n"
		+ "\r\n"
		+ "\"title\": \"RPA\",\r\n"
		+ "\r\n"
		+ "\"price\": 45,\r\n"
		+ "\r\n"
		+ "\"copies\": 10\r\n"
		+ "\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "]\r\n"
		+ "\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "\r\n"
		+ "";
}	

}
