package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

	

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("임지현");
		names.add("문승주");
		names.add("장건녕");
		names.add("고동현");
		names.add("문경원");

		names.forEach(n -> {
			System.out.println(n);
		});
		
		
		
	}
}
