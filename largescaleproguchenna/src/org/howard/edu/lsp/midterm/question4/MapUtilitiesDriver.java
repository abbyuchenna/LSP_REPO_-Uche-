package org.howard.edu.lsp.midterm.question4;
import java.util.HashMap;

/**
 * driver class to test the MapUtilities class.
 */
public class MapUtilitiesDriver {
    public static void main(String[] args) {
        // create first hashmap and populate it
        HashMap<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("Alice", "Healthy");
        hashMap1.put("Mary", "Ecstatic");
        hashMap1.put("Bob", "Happy");
        hashMap1.put("Chuck", "Fine");
        hashMap1.put("Felix", "Sick");

        // create second hashmap and populate it
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("Mary", "Ecstatic");
        hashMap2.put("Felix", "Healthy");
        hashMap2.put("Ricardo", "Superb");
        hashMap2.put("Tam", "Fine");
        hashMap2.put("Bob", "Happy");

        // call the method and print the result
        int commonPairs = MapUtilities.commonKeyValuePairs(hashMap1, hashMap2);
        System.out.println("Number of common key-value pairs is: " + commonPairs);
    }
}