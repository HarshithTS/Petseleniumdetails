/*package test;

import org.json.simple.JSONObject;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest {
	@org.testng.annotations.Test
	public void Test(){
	RestAssured.baseURI ="http://restapi.demoqa.com/utilities/weather/city/";
	RequestSpecification httpRequest =RestAssured.given();
	Response response = httpRequest.request(Method.GET,"Bangalore");
	String responseBody = response.getBody().asString();
	System.out.println("Response Body is =>" +responseBody);
	}
	
	@org.testng.annotations.Test
	public void postRequest(){
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RequestSpecification httpRequest = RestAssured.given();
		
		JSONObject requestparams = new JSONObject();
		requestparams.put("FirstName","fsfs");
		requestparams.put("LastName","fgdge");
		requestparams.put("UserName","5wwy");
		requestparams.put("Password","zzc");
		requestparams.put("Email","abcd@gmail.com");
		
		httpRequest.body(requestparams.toJSONString());
		System.out.println("JSON body is:"+requestparams.toJSONString());
		Response response  = httpRequest.post("/register");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		
		Assert.assertEquals(response.getStatusCode(),201);
	}
	
}

*/