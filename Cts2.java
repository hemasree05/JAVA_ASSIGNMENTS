import java.util.*;

public class Cts2 {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eve");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hank");
        studentMap.put(109, "Ivy");
        studentMap.put(110, "Jack");

        // Insert a new key-value pair
        studentMap.put(111, "Kevin");
        System.out.println("After adding (111, Kevin): " + studentMap);

        // Fetch value of a key
        System.out.println("Value for key 103: " + studentMap.get(103));

        // Clone the HashMap
        HashMap<Integer, String> clonedMap = new HashMap<>(studentMap);
        System.out.println("Cloned Map: " + clonedMap);

        // Check if key exists
        System.out.println("Does key 105 exist? " + studentMap.containsKey(105));

        // Check if value exists
        System.out.println("Does value 'Eve' exist? " + studentMap.containsValue("Eve"));

        // Check if map is empty
        System.out.println("Is the map empty? " + studentMap.isEmpty());

        // Print size of the map
        System.out.println("Size of HashMap: " + studentMap.size());

        // Print all keys
        System.out.println("Keys in HashMap: " + studentMap.keySet());

        // Print all values
        System.out.println("Values in HashMap: " + studentMap.values());

        // Remove a key-value pair
        studentMap.remove(107);
        System.out.println("After removing key 107: " + studentMap);

        // Copy elements to another HashMap
        HashMap<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(studentMap);
        System.out.println("Copied Map: " + anotherMap);
    }
}
