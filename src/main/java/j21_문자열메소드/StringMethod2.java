  package j21_문자열메소드;

public class StringMethod2 {
	public static void main(String[] args) {

		String name = "김준일김수현";

//		System.out.println(name.length());
//
//		// 문자의 위치 찾기
//		System.out.println(name.indexOf("문"));
//		System.out.println(name.indexOf("승"));
//
//		// 문자의 위치 뒤에서 부터 찾기
//		System.out.println(name.lastIndexOf("문"));
//
//		char name1 = name.charAt(0);
//		System.out.println(name1);
//
//		char name2 = name.charAt(name.indexOf("문"));
//		System.out.println(name2);
		
		String  nameJunil ="김수현";
		
//		String subName1 =name.substring(name.indexOf("김준일"),name.indexOf(0));
//		String subName2 =name.substring(3);
		System.out.println(name.substring(name.indexOf(nameJunil),name.indexOf(nameJunil)+nameJunil.length()));
		
		String file = "C:/String.java";
//		String fileName = "String";
//		String extension = "java";
//		System.out.println(file.substring(file.indexOf(fileName),file.indexOf(fileName)+fileName.length()));
//		System.out.println(file.substring(file.indexOf(extension),file.indexOf(extension)+extension.length()));
//		System.out.println(file.substring("C:/".length(),file.lastIndexOf("."));
	}

}
