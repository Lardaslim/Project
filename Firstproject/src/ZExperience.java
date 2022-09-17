import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ZExperience {

    public static void main(String args[]) throws Exception {

        Map<Integer, String> keys = new HashMap<Integer, String>();
        keys.put(1, "квартира №1");
        for (int i = 0; i < 10; i++) {
            keys.put(i, "квартира№ " + i);
        }
        // System.out.println(keys);
        // System.out.println(keys.keySet());
        // System.out.println(keys.values());

        Map<Integer, ArrayList<Integer>> keys1 = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < 10; i++) {
            // keys1.put(i, new ArrayList<>());
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                numbers.add(j);
            }
            keys1.put(i, numbers);
        }

        // System.out.println(keys1);
        // System.out.println(keys1.keySet());
        // System.out.println(keys1.values());

        Map<Integer, HashMap<Integer, String>> cool = new HashMap<Integer, HashMap<Integer, String>>();
        for (int i = 0; i < 10; i++) {
            HashMap<Integer, String> cool1 = new HashMap<Integer, String>();
            for (int j = 10; j < 20; j++) {
                cool1.put(j, "квартира №" + j);
            }
            cool.put(i, cool1);
        }
        // System.out.println(cool);
        // System.out.println(cool.keySet());
        // System.out.println(cool.values());

        Map<Integer, ArrayList<String>> name = new HashMap<Integer, ArrayList<String>>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                ArrayList<String> name1 = new ArrayList<String>();
                for (int j = 0; j <= i; j++) {
                    name1.add("квартира №" + j);
                }
                name.put(i, name1);
            } else if (i % 2 != 0) {
                ArrayList<String> name2 = new ArrayList<String>();
                for (int j = i * 10; j <= i * 15; j++) {
                    name2.add("квартира №" + j);
                }
                name.put(i, name2);
            }
        }
        System.out.println(name.get(9));
        // System.out.println(name.keySet());
        // System.out.println(name.values());
    }

}