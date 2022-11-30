package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethod {

	public static void printList(String listName, List<String> list) {
		System.out.println("["+ listName +" ]");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i + " ->\t");
			System.out.println(list.get(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>();
		List<String> nameList2 = new ArrayList<String>();

		// add() -> 리스트에 값을 추가함
		nameList.add("문승주");
		nameList.add("장건녕");
		nameList.add("고동현");
		nameList.add("문경원");
		nameList.add("임지현");
		nameList.add("박수현");
		printList("nameList", nameList);

		// addAll() -> 리스트에 다른 Collection의 값을 모두 추구함
		nameList2.addAll(nameList);
		printList("nameList2", nameList2);
		nameList2.addAll(3, nameList);
		printList("nameList2", nameList2);
		
		//contains() -> 리스트에 해당 값이 있는지 확인(boolean 타입 반환)
		boolean isContains = nameList.contains("장건녕");
		System.out.println("이름 목록에 장건녕이 있나? " + (isContains ? "있다" : "없다"));
		
		// int index() -> 리스트에서 해당 값의 인덱스 위치를 반환(앞에서 부터 탐색)
		int index = nameList.indexOf("문승주");
		System.out.println(index);
		
		// int lastIndex() -> 리스트에서 해당 값의 인덱스 위치를 반환(뒤에서 부터 탐색)
		int lastIndex = nameList2.lastIndexOf("문승주");
		System.out.println(lastIndex);
		
		boolean isEmpty = nameList.isEmpty();
		System.out.println("해당 리스트가 비어있는가? "+ isEmpty);
		
		for(String name : nameList) {
			System.out.println(name);
		}
		
		Iterator<String> ir = nameList.iterator();//interator 길다란 통에 값을 담는 위에서 부터 하나씩 꺼낼수 있는 형태
		
		while(ir.hasNext()) {//is 는 이다 아니다 has 는 있다 없다
			System.out.println(ir.next());//ir.next 다음 값이 있는가? 진행
		}
		System.out.println();
		
		nameList.forEach(name ->{ //반복
			System.out.println(name);
		});
		
	}

}
