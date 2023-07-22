package methods;

import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import utilities.*;

public class RestAssuredMethods {
			
	 private String placeID;
	 private String updatedAddress = "#C-336 CyberNest Apartment";

	 public void addPlace(String name) {
			String postResponse = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body(Payload.postPayload(name))
			.when().post("maps/api/place/add/json")
			.then().log().all().assertThat().statusCode(200)
			.body("scope",equalTo("APP")).header("Server","Apache/2.4.41 (Ubuntu)").extract().response().asString();
					
			JsonPath jsonPath = new JsonPath(postResponse);
			String placeID = jsonPath.getString("place_id");
			this.placeID=placeID;
		} 

		public void updatePlace() {
			given().log().all().queryParam("key","qaclick123").queryParam("place_id",placeID).header("Content-Type","application/json").
			body(Payload.putPayload(placeID,updatedAddress))
			.when().put("maps/api/place/update/json")
			.then().log().all().assertThat().statusCode(200)
			.body("msg",equalTo("Address successfully updated")).header("Server","Apache/2.4.41 (Ubuntu)");
		} 
		
		public void deletePlace() {
			given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body(Payload.deletePayload(placeID))
			.when().delete("maps/api/place/delete/json")
			.then().log().all().assertThat().statusCode(200)
			.body("status",equalTo("OK")).header("Server","Apache/2.4.41 (Ubuntu)");
		} 
		
		public void getAddedPlace() {
			given().log().all().queryParam("key","qaclick123").queryParam("place_id",placeID)
			.when().get("maps/api/place/get/json")
			.then().log().all().assertThat().statusCode(200)
			.body("address",equalTo("29, side layout, cohen 09")).header("Server","Apache/2.4.41 (Ubuntu)");					
		} 
		
		public void getUpdatedPlace() {
			given().log().all().queryParam("key","qaclick123").queryParam("place_id",placeID)
			.when().get("maps/api/place/get/json")
			.then().log().all().assertThat().statusCode(200)
			.body("address",equalTo("#C-336 CyberNest Apartment")).header("Server","Apache/2.4.41 (Ubuntu)");			
		} 
		
		public void getDeletedPlace() {
			given().log().all().queryParam("key","qaclick123").queryParam("place_id",placeID)
			.when().get("maps/api/place/get/json")
			.then().log().all().assertThat().statusCode(404)
			.body("msg",equalTo("Get operation failed, looks like place_id  doesn't exists")).header("Server","Apache/2.4.41 (Ubuntu)");															
		}
		
		public String getAlphaNumericString(int n) {
			 String alphabets = "abcdefghijklmnopqrstuvxyz";
			 
			 StringBuilder sb = new StringBuilder(n);
			 
			  for (int i = 0; i < n; i++) {
			   int index
			    = (int)(alphabets.length()
			      * Math.random());
			 
			   sb.append(alphabets
			      .charAt(index));
			  }
			 
			  return sb.toString();
			  
			}
		
		public static String GenerateStringFromResource(String path){
		    try {
				return new String(Files.readAllBytes(Paths.get(path)));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return path;
		}

	}


