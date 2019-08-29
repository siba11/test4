package GetRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class getauth {
	
	@Test
	public void testauth() {
		int code=RestAssured.given()
	    .auth().preemptive()
	    .basic("", "")
	    .when()
	    .get("")
	    .getStatusCode();
		System.out.println(code);
	}

}
