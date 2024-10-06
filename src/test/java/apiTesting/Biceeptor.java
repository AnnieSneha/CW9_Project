package apiTesting;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class Biceeptor {
    
    // Base URL for the API
	
    protected static final String BASE_URI = "https://posthook-api.mock.beeceptor.com";
    
    // Test to schedule a new hook by sending a POST request
    
    @Test(priority = 0)
    
    public void scheduleHook() { 
        
        // Set the base URI for the API
    	
        RestAssured.baseURI = BASE_URI;
        
        // Create an empty JSON object to send in the request body
        
        JSONObject js = new JSONObject();
        
        // Send a POST request to /v1/hooks endpoint and check if the status code is 200
        
        given().contentType("application/json").body(js.toJSONString()).when().post("/v1/hooks").then().statusCode(200).log().all();
    }
    
    // Test to get a list of all hooks by sending a GET request
    
    @Test(priority = 1)
    
    public void getHook() {  
        
        // Set the base URI for the API
    	
        RestAssured.baseURI = BASE_URI;
        
        // Send a GET request to /v1/hooks endpoint and check if the status code is 200
        
        given().get("/v1/hooks").then().statusCode(200).log().all();
        
    }
    
    // Test to get details of a specific hook by sending a GET request with an ID
    
    @Test(priority = 2)
    
    public void getID() { 
        
        // Set the base URI for the API
    	
        RestAssured.baseURI = BASE_URI;
        
        // Send a GET request to /v1/hooks/{id} endpoint and check if the status code is 200
        
        given().get("/v1/hooks/6ab4d4d5-4767-452d-b72f-6ec40562b27e").then().statusCode(200).log().all();
        
    }
    
    // Test to update an existing hook by sending a PUT request with new data
    
    @Test(priority = 3)
    
    public void updateHook() {  
        
        // Set the base URI for the API
    	
        RestAssured.baseURI = BASE_URI;
        
        // Create a JSON object with updated details to send in the request body
        
        JSONObject jsonObject = new JSONObject();
        
        jsonObject.put("name", "updated-project");
        
        jsonObject.put("domain", "api.example.com");
        
        jsonObject.put("headerAuthorization", "");
        
        jsonObject.put("minRetries", "1");
        
        jsonObject.put("retryDelaySecs", "5");
        
        // Send a PUT request to update the hook and check if the status code is 200
        
        given().contentType("application/json").body(jsonObject.toJSONString()).when().put("/v1/projects/").then().statusCode(200).log().all();
    }
    
    // Test to delete a specific hook by sending a DELETE request with an ID
    
    @Test(priority = 4)
    
    public void deleteID() {  
        
        // Set the base URI for the API
    	
        RestAssured.baseURI = "https://posthook-api.mock.beeceptor.com";
        
        // Send a DELETE request to /v1/hooks/{id} endpoint and check if the status code is 200
        
        given().delete("/v1/hooks/6ab4d4d5-4767-452d-b72f-6ec40562b27e").then().statusCode(200).log().all();
    }
}

