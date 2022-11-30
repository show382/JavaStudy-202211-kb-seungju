package j16_컬렉션.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMethod {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("username", "show382");
		map.put("password", "1234");
		map.put("name", "문승주");
		map.put("email", "show382@naver.com");
		map.put("age", 31);
		map.put("gender", true);

		Map<String, String> address = new HashMap<>();
		address.put("address1", "부산광역시");
		address.put("address2", "북구");
		address.put("address3", "금곡동");
		
		map.put("address", address);
		
		System.out.println(map);

		Map<Integer, String> subject = new TreeMap<>();//TreeMap 숫자는 순서대로 나옴 hashmap에선 안나옴
		subject.put(100, "java");
		subject.put(200, "C#");
		subject.put(300, "python");
		subject.put(401, "python2");
		subject.put(403, "python3");
		subject.put(502, "python4");
		subject.put(604, "python5");
		
		map.put("subject", subject);
		
		System.out.println(map);
		
		System.out.println(((Map<?, ?>)map.get("subject")).get(403));
		
		List<String> hobby = new ArrayList<>();
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		hobby.add("족구");
		
		map.put("hobby", hobby);
		System.out.println(((List<String>)map.get("hobby")).get(2));
		
		Set<Entry<String, Object>> userEntry = map.entrySet();
		//set은 하나의 값만 map은 k값과v값이 한쌍
//		List<Map<String, Object>> listMap = new ArrayList<>();
//		
		for(Entry<String, Object> entry : userEntry) {
			System.out.println(entry.getKey());
		}
		System.out.println();
		/*================*/
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		System.out.println("---------");
		System.out.println(map.values());
		System.out.println("---------");
		for(Object obj : map.values()) {
			System.out.println(obj);
		}
	}

}
