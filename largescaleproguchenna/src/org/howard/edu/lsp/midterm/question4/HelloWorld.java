

import java.util.HashMap;

/**
 * utility class for operations related to hashmaps.
 */
public class MapUtilities {

    /**
     * calculates the number of common value pairs between two hashmaps.
     * returns 0 if either or both maps are empty.
     * 
     * @param map1 the first hashmap containing string keys and values.
     * @param map2 the second hashmap containing string keys and values.
     * @return the number of common key-value pairs between map1 and map2.
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // if either map is empty, return 0
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonCount = 0;

        // iterate through map1 and check if each key-value pair exists in map2
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map2.get(key).equals(map1.get(key))) {
                commonCount++;
            }
        }

        return commonCount;
    }

    public static void main(String[] args) {
        // create the first map and populate it with values
        HashMap<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("Alice", "Healthy");
        hashMap1.put("Mary", "Ecstatic");
        hashMap1.put("Bob", "Happy");
        hashMap1.put("Chuck", "Fine");
        hashMap1.put("Felix", "Sick");

        // create the second map and populate it with values
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("Mary", "Ecstatic");
        hashMap2.put("Felix", "Healthy");
        hashMap2.put("Ricardo", "Superb");
        hashMap2.put("Tam", "Fine");
        hashMap2.put("Bob", "Happy");

        // call the method and print te number of common key-value pairs
        int commonPairs = commonKeyValuePairs(hashMap1, hashMap2);
        System.out.println("Number of common key-value pairs is: " + commonPairs);
    }
}