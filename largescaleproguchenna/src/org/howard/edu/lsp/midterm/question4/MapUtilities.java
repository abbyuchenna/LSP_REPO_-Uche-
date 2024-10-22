package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilities {

    /**
     * counts the number of common key-value pairs between two hashmaps.
     * if either map is empty, the method returns 0.
     * 
     * @param map1 the first hashmap containing string keys and values
     * @param map2 the second hashmap containing string keys and values
     * @return the number of common key-value pairs between map1 and map2
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonCount = 0;

        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map2.get(key).equals(map1.get(key))) {
                commonCount++;
            }
        }

        return commonCount;
    }
}