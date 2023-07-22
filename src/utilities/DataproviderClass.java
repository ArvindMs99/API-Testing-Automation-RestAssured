package utilities;
import org.testng.annotations.DataProvider;

public class DataproviderClass {
	
	 @DataProvider(name="getName")
     public static Object[][] InvalidCredentials(){
         return new Object[][] {
             {"Arvind"},
             {"Abhi"},
             {"Sudhi"}
       };  
    }
	 
}