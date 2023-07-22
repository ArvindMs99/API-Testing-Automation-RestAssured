package tests;

import org.testng.annotations.Test;
import basetest.BaseTest;

public class RestAssuredTest extends BaseTest{
	
	@Test(priority = 1, dataProvider="getName", dataProviderClass=utilities.DataproviderClass.class)
	public void verifyPOST(String name) {
		restAssuredMethods.addPlace(name);
	}	

	@Test(priority = 2)
	public void verifyGETPOST() {
		restAssuredMethods.getAddedPlace();
	}	
	
	@Test(priority = 3)
	public void verifyPUT() {
		restAssuredMethods.updatePlace();
	}	
	
	@Test(priority = 4)
	public void verifyGETPUT() {
		restAssuredMethods.getUpdatedPlace();		
	}	
	
	@Test(priority = 5)
	public void verifyDELETE() {		
		restAssuredMethods.deletePlace();
	}	
	
	@Test(priority = 6)
	public void verifyGETDELETE() {
		restAssuredMethods.getDeletedPlace();
	}	
	
}