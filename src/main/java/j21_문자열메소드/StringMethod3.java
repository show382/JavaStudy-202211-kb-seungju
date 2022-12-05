package j21_문자열메소드;

import java.util.function.Function;

public class StringMethod3 {
	public static void main(String[] args) {
		Function<String, String> replacePhoneToken = phoneNumber -> phoneNumber.replace("/", "")
				.replaceAll(" ", "").replace("-", "").replace(".", "");
		
		String phone = "010-1234-1234";
		
		System.out.println(replacePhoneToken.apply(phone));
		

	}

}
