package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Vector;

public class StringList {

    public static void main(String[] args) {
        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "Jsp";
        strArray[2] = "Servlet";

        System.out.println("<<<<일반반복>>>>>>");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println();

        System.out.println("<<<<foreach>>>>>>");
        for (String str : strArray) {
            System.out.println(str);
        }

        ArrayList<String> strList = new ArrayList<String>();
        //값 추가(Create) -> add(값), add(index, 값)
        strList.add("java");
        strList.add("jsp");
        strList.add("servlet");
        strList.add(1,"C++");
        strList.add(0,"HTML");

        System.out.println("<<<<List foreach>>>>>>");
        for (String str : strList) {
            System.out.println(str);
        }

        //값 조회(Read) -> get(index)
        System.out.println("<<<<List 일반반복>>>>>>");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        //값 수정(UpDate) -> get(index, 값)
        strList.add(0, "HTML5");

        System.out.println(strList);

        //값 삭제(Delete) -> remove(index);
        String removeData = strList.remove(2);
        System.out.println(removeData);
        System.out.println(strList);
    }

}
