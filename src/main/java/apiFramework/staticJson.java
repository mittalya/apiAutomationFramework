package apiFramework;

import static io.restassured.RestAssured.given;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.testng.annotations.Test;
import files.reUsableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class staticJson {

	@Test
	public void addBook() throws IOException

	{

		RestAssured.baseURI = "http://216.10.245.166";
		String resp = given().header("Content-Type", "application/json")
				//.body(GenerateStringFromResource(System.getProperty("user.dir")+"\\Addbookdetails.json")).when()
				.body(GenerateStringFromResource("C:\\Users\\yasmittal\\Documents\\Selenium package\\SeleniumTestNG-master_final\\Addbookdetails.json")).when()
				.post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response().toString();
		JsonPath js = reUsableMethods.rawToJson(resp);
		String id = js.get("ID");
		System.out.println(id);

		// deleteBook

	}

	public static String GenerateStringFromResource(String path) throws IOException {

		return new String(Files.readAllBytes(Paths.get(path)));

	}
}
