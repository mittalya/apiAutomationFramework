package apiFramework;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

public class jiraTest {
   public static void main(String[]args){
	   RestAssured.baseURI="http://localhost:8080";
	   
	   SessionFilter session = new SessionFilter();
	   String response= given().header("Content-Type","Application/Json").body("{\r\n" + 
	   		"\"username\":\"yasmittal\",\r\n" + 
	   		"\"password\":\"Password0!\"\r\n" + 
	   		"}").log().all().filter(session).when().post("/rest/auth/1/session").then().log().all().extract().asString();
	 String expectedMessage= "Expected";
	 
	   // Add comment
	  String addComment= given().pathParam("key", "10101").log().all().header("Content-Type","Application/Json").body("{\r\n" + 
	   		"\"body\":\""+expectedMessage+"\",\r\n" + 
	   		"\"visibility\":{\r\n" + 
	   		"   \"type\":\"role\",\r\n" + 
	   		"   \"value\":\"Administrators\"\r\n" + 
	   		"  }\r\n" + 
	   		"}").filter(session)
	   .when().post("/rest/api/2/issue/{key}/comment").then().log().all()
	   .assertThat().statusCode(201).extract().response().asString();
	  
	  JsonPath js = new JsonPath(addComment);
	  String commentId= js.getString("id");
	  
	  
	   // Add attachment
	   given().header("X-Atlassian-Token","no-check").filter(session).pathParam("key", "10101")
	   .header("Content-Type","multipart/form-data")
	   .multiPart("file",new File("jira.txt")).when()
	   .post("rest/api/2/issue/{key}/attachments").then().log().all().assertThat().statusCode(200);
	   
	   
	   //Get Issue
	   String issueDetails= given().filter(session).pathParam("key", "10101")
	   .queryParam("fields", "comments")
	   .log().all().when().get("/rest/api/2/issue/{key}").then().log().all()
	   .extract().response().asString();
	   
	   JsonPath js1 = new JsonPath(issueDetails);
	   int commentsCount= js.get("fields.comment.comments.size()");
	   
	   for (int i=0;i<commentsCount;i++) {
		   String commentidIssue= js1.get("fields.comment.comments["+i+"].id").toString();
		   if (commentidIssue.equalsIgnoreCase(commentId)) {
			   String message= js1.get("fields.comment.comments["+i+"].id");
		   }
	   }
   }
}
