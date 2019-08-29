package GetRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMethod {
	@Test
	public void GetAPI() {
		Response res=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int statuscode=res.getStatusCode();
		System.out.println("the status code is"+ statuscode);

		Assert.assertEquals(statuscode, 200);
		String statuscode1=res.getContentType();
		System.out.println("the content type is "+ statuscode1);
		
	}
	@Test
	public void PostMethod() {
		RequestSpecification request= RestAssured.given();
		request.header("Content-tyep", "application/json");
		
	}

}
