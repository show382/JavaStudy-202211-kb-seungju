package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {
	
	public static void main(String[] args) {
	
		User user = User.builder()
				.username("seungju")
				.password("1234")
				.name("문승주")
//				.email("show382@naver.com")
				.build();
		
		System.out.println(user);
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls()//null값도 나타나게 해준다
				.excludeFieldsWithoutExposeAnnotation()//serialize 가 true or false 기능을 넣었을시 기능을 표현한다
				.create();
		
		String userJson = gson.toJson(user);
		System.out.println(userJson);
		
		User userObj = null;
		
		userObj = gson.fromJson(userJson, User.class);
		System.out.println(userObj);
		
	}

}
