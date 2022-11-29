package j16_컬렉션.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StringSet {

	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();

		nameSet.add("문승주");
		nameSet.add("장건녕");
		nameSet.add("고동현");
		nameSet.add("문경원");
		nameSet.add("임지현");

		System.out.println(nameSet);

		System.out.println(nameSet);

		for (String s : nameSet) {
			if (s.equals("문승주")) {
				System.out.println(s);
				break;
			}
		}

		List<String> nameList = Arrays.asList(new String[] { "문승주", "장건녕", "고동현", "문경원", "임지현" });
		
		System.out.println(nameList);
		
		Set<String> listToSet = new HashSet<String>();
		listToSet.addAll(nameList);
		
		System.out.println(listToSet);
		
		nameSet.remove("문승주");
		
		System.out.println(nameSet);
		
		
	}
}
