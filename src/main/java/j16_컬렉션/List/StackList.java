package j16_컬렉션.List;

import java.util.ArrayList;

public class StackList {

    public static void main(String[] args) {

        // 임지현, 신경수, 고희주, 문승주, 장건영, 박수현, 황석민, 박준현

        ArrayList<String> stack = new ArrayList<String>();

//        stack.add(0,"임지현");
//        stack.add(0,"신경수");
//        stack.add(0,"고희주");
//        stack.add(0,"문승주");
//        stack.add(0,"장건영");
//        stack.add(0,"박수현");
//        stack.add(0,"황석민");
//        stack.add(0,"박준현");//밀려난다
//        for(String name : stack) {
//            System.out.print(name);
//            if (!name.equals(stack.size() - 1)) {
//                System.out.print(", ");
//            }
//        }
        stack.add("임지현");
        stack.add("신경수");
        stack.add("고희주");
        stack.add("문승주");
        stack.add("장건영");
        stack.add("박수현");
        stack.add("황석민");

        ArrayList<String> copyList = new ArrayList<String>();
        int size = stack.size();//리무브 할때 마다 사이즈가 줄어 들어서 이렇게 고정시켜 두고 한다.
        for (int i = 0; i < size; i++) {
           copyList.add(0,stack.remove(size - i - 1));
        }
        System.out.println(copyList);
    }
}

