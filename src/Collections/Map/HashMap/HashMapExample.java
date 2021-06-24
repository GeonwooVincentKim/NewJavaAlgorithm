package Collections.Map.HashMap;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;

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

        out.print("map -> ");
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], nums[i]);
            out.print(map.get(names[i]) + " ");
        }
    }
}
