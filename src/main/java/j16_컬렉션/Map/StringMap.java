package j16_컬렉션.Map;

import java.util.HashMap;
import java.util.Map;

/*
 * spring.io 검색 프로젝트에  스프링 툴 4 에 맨밑 윈도우 버전 설치
jarfix 검색 다운후 실행
lombok 검색 후 다운 스프링툴 있는 폴더에 저장 후 실행 스프링툴 specify location으로 찾아서 선택
이클립스 폰트 @지우고 d2코딩 설정 @하면한글 옆으로 나옴
Structured text httml 문자 설정 이건 verdana가 보기 편함 d2는 깨짐
encoding 검색 후 text의  java 모두 UTB-8로 업데이트(맥이랑 협업을 위해)
자바프로젝트 우클릭 후 maven으로 업데이트 art +f5
패키지 정렬 방식 수정
 */

public class StringMap {

	public static void main(String[] args) {
		Map<String, String> language = new HashMap<String, String>();

		language.put("java", "자바");
		language.put("httml", "에이치티티엠엘");
		language.put("css", "씨에스에스");
		language.put("js", "제이에스");
		language.put("python", "파이썬");
		language.put("python", "파이썬2");

		System.out.println(language);

		String s = language.get("python");// 키 값이 같으면 벨류(값을) 덮어 씌운다. 그래서 키값은 다르게 해야 한다.
		System.out.println(s);

		language.replace("java", "자바", "자바3");
		System.out.println(language.get("java"));

	}

}
