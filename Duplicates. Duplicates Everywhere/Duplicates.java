package duplicates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {

    public static void main(String[] args) {
        Map<Integer, List<String>> duplicates = new HashMap<>();
        Map<Integer, List<String>> obj = new HashMap<>();
        List<String> v = new ArrayList<>();
        List<String> v1 = new ArrayList<>();
        v.add("A");
        v.add("B");
        v.add("C");
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");

        duplicates.put(1, v);
        duplicates.put(2, v);
        System.out.println(duplicates);

        List<String> characters = new ArrayList<>();
        List<Integer> keys = new ArrayList<>();

        for (Integer key : duplicates.keySet()) {
            keys.add(key);
        }
        Collections.sort(keys);
        Collections.reverse(keys);
        
        for (Integer x : keys) {
            List<String> newList = new ArrayList<>();
            for(String character:duplicates.get(x)){
                if(!(characters.contains(character))){
                    characters.add(character);
                    newList.add(character);
                }
            }
            obj.put(x, newList);
        }

    }
    //{1:A,2:B,3:C}
    //{1:A,2:B,3:C}

//    {1,2,3}
//    {A,B,B,C,D}
}
