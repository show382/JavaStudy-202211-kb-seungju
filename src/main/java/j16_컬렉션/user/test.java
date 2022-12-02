package j16_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
public class test {
	@Getter
	private List<Map<String, Object>> userList;

	public void register(Map<String, Object> userMap) {
		System.out.println("[사용자 등록]");
		userList.add(userMap);
	}

	public Map<String, Object> findUserByUsername(String username) {
		Map<String, Object> userMap = null;

		for (Map<String, Object> user : userList) {
			String _username = (String) user.get(username);
			if (_username.equals(username)) {
				userMap = user;
				break;
			}
		}
		return userMap;
	}

	public void modifyPasswordByUsername(String username, String newPassword) {
		Map<String, Object> userMap = findUserByUsername(username);
		if(userMap==null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return;
		}
		userMap.replace("password", newPassword);
	}
	public void deleteUserByUsername(String username) {
		Map<String, Object> userMap = findUserByUsername(username);
		if(userMap==null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return;
		}
		int userIndex = userList.indexOf(userMap);
		userList.remove(userIndex);
	}
	public static void main(String[] args) {
		List<Map<String, Object>>userList = new ArrayList<>();
		test userRepository = new test(userList);
		Map<String, Object> user1 = new HashMap<>();
		user1.put("username", "aaa");
		user1.put("password", "1111");

		Map<String, Object> user2 = new HashMap<>();
		user2.put("username", "bbb");
		user2.put("password", "2222");
		
		Map<String, Object> user3 = new HashMap<>();
		user3.put("username", "ccc");
		user3.put("password", "3333");
		
		userRepository.register(user1);
		userRepository.register(user2);
		userRepository.register(user3);
		
		System.out.println(userRepository.getUserList());
		System.out.println(userRepository.findUserByUsername("aaa"));
		
	}
}
