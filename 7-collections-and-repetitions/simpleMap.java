//simpleMap

import java.util.HashMap;
import java.util.Map;
import java.lang.Math;

public class simpleMap {
    public static void main(String[] args) {
        Map<String, Integer> names = new HashMap<String, Integer>();
        
        //associate a random age with each name
        for (int i=1; i<=10; i++) {
            String name = "name"+i;
            names.put(name, (int)(Math.random() * 10+1));
        }
        
        //print them all out, the keys and the values
        for (String key : names.keySet()) {
            System.out.println(key + " " + names.get(key));
        }
    }
}
