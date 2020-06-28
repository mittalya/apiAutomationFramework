package apiFramework;

import files.payload;
import io.restassured.path.json.JsonPath;

public class complexJsonParse {
	public static void main(String[] args){
		
		JsonPath js= new JsonPath(payload.coursePrice());
		
		// print number of courses
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		int totalAmount= js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		String title= js.get("courses[0].title");
		System.out.println(title);
		
		for (int i=0;i<count;i++){
			String courseTitle= js.get("courses["+i+"].title");
			//System.out.println(courseTitle);
			//System.out.println(js.get("courses["+i+"].price").toString());
			if (courseTitle.equalsIgnoreCase("RPA")){
				
				int copies= js.get("courses["+i+"].copies");
				System.out.println(copies);
				break;
			}
		}
	}

 }
