package Collections.Map.HashMap;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        out.println(map);

        String[] names = { "홍길동", "김유신", "이순신", "강감찬", "김유신" };
        out.print("names -> ");
        for (int i = 0; i < names.length; i++) {
            out.print(names[i] + " ");
        }

        out.println();

        int[] nums = { 1234, 4567, 2350, 9870, 2345 };
        out.print("nums -> ");
        for (int i = 0; i < nums.length; i++) {
            out.print(nums[i] + " ");
        }

        out.println();

        out.println("map -> ");
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], nums[i]);
            out.print(map.get(names[i]) + " ");
        }

        out.println();

        out.print("Map Keys -> ");
        Set<String> keys = map.keySet();
        out.println(keys);

        out.println("----------------------");

        out.println("일반적인 For 문을 사용했을 때 -> ");
        for (int i = 0; i < keys.size(); i++) {
            out.println(names[i] + " = " + map.get(names[i]));
        }

        out.println("----------------------");

        out.println("For-Each 문을 사용했을 때 -> ");
        for (String key : keys) {
            out.println(key + " = " + map.get(key));
        }

        out.println("----------------------");

        out.print("Iterator 를 사용했을 때 -> ");

        Iterator<String> it = keys.iterator();
        out.println(it);

        while (it.hasNext()) {
            String a = (String) it.next();
            out.println(a + " = " + map.get(a));
        }
    }
}
