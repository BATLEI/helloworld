package stu;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        map.put("a","aa");
        map.put("b","bb");
        map.put("c","cc");
        System.out.println(map);
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            System.out.println(entry.getValue());
            System.out.println("呵呵");
            System.out.println("666");
        }

    }
}
