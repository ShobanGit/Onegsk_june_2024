package example;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hmap = new HashMap<String, Integer>();
        hmap.put("Shoban", 100001);
        hmap.put("Nitin", 100002);
        hmap.put("Gowri", 100003);

        System.out.println(hmap.get("Shoban"));
        System.out.println(hmap.size());
        
    }
}
