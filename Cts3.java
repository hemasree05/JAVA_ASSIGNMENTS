import java.util.*;

public class Cts3 {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>(Arrays.asList(
            "Red", "Green", "Blue", "Yellow", "Orange",
            "Purple", "Black", "White", "Pink", "Brown"
        ));

        // Add an element
        stringSet.add("Cyan");
        System.out.println("After adding 'Cyan': " + stringSet);

        // Remove an element
        stringSet.remove("Blue");
        System.out.println("After removing 'Blue': " + stringSet);

        // Check if an element is present
        System.out.println("Does set contain 'Red'? " + stringSet.contains("Red"));

        // Find size of the HashSet
        System.out.println("Size of HashSet: " + stringSet.size());

        // Iterate using Iterator
        System.out.println("Iterating over HashSet:");
        Iterator<String> setIterator = stringSet.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        // Clear all elements
        stringSet.clear();
        System.out.println("After clearing HashSet: " + stringSet);
    }
}
