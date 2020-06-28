package files;

public class payload {

	public static String AddPlace() {

		return "{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.382594,\r\n" + "    \"lng\": 33.429362\r\n"
				+ " },\r\n" + " \"accuracy\":50,\r\n" + " \"name\": \"Rahul Shettu Academy\",\r\n"
				+ " \"phone_number\": \"(+91) 880 989 0987\",\r\n" + " \"address\": \"5111 Rockerfeller St, US\",\r\n"
				+ " \"types\": [\r\n" + "  \"shoe park\",\r\n" + "  \"shop\"\r\n" + "  ],\r\n"
				+ "  \"website\": \"http://rahulshettyacademy.com\",\r\n" + "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n" + "";
	}

	public static String coursePrice() {
		return "{\r\n" + 
				"\"dashboard\": {\r\n" + 
				"\"purchaseAmount\": 910,\r\n" + 
				"\"website\": \"rahulshettyacademy.com\"\r\n" + 
				"},\r\n" + 
				"\"courses\": [\r\n" + 
				"{\r\n" + 
				"\"title\": \"Selenium Python\",\r\n" + 
				"\"price\": 50,\r\n" + 
				"\"copies\": 6\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\"title\": \"Cypress\",\r\n" + 
				"\"price\": 40,\r\n" + 
				"\"copies\": 4\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\"title\": \"RPA\",\r\n" + 
				"\"price\": 45,\r\n" + 
				"\"copies\": 10\r\n" + 
				"}\r\n" + 
				"]\r\n" + 
				"}";
	}
	
	public static String Addbook(String isbn,String aisle){
		return "{\r\n" + 
				"\"name\": \"Learn Appium Automation with Java\",\r\n" + 
				"\"isbn\": \""+isbn+"\",\r\n" + 
				"\"aisle\": \""+aisle+"\",\r\n" + 
				"\"author\":John foe\"\r\n" + 
				"}";
	}

	// public static String UpdatePlace(){
	//
	// return "{\r\n" +
	// " \"location\": {\r\n" +
	// " \"lat\": -38.382594,\r\n" +
	// " \"lng\": 33.429362\r\n" +
	// " },\r\n" +
	// " \"accuracy\":50,\r\n" +
	// " \"name\": \"Rahul Shettu Academy\",\r\n" +
	// " \"phone_number\": \"(+91) 880 989 0987\",\r\n" +
	// " \"address\": \"5111 Rockerfeller St, US\",\r\n" +
	// " \"types\": [\r\n" +
	// " \"shoe park\",\r\n" +
	// " \"shop\"\r\n" +
	// " ],\r\n" +
	// " \"website\": \"http://rahulshettyacademy.com\",\r\n" +
	// " \"language\": \"French-IN\"\r\n" +
	// "}\r\n" +
	// "";
	// }

}
