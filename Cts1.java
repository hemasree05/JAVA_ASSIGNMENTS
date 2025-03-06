import java.util.ArrayList;
import java.util.Iterator;

public class Cts1 {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList and add 10 elements
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Elderberry");
        stringList.add("Fig");
        stringList.add("Grapes");
        stringList.add("Honeydew");
        stringList.add("Indian Fig");
        stringList.add("Jackfruit");

        System.out.println("Initial ArrayList: " + stringList);

        // Step 2: Add an element to the ArrayList
        stringList.add("Kiwi");
        System.out.println("After adding 'Kiwi': " + stringList);

        // Step 3: Iterate through the ArrayList using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Step 4: Add an element at a specific index
        stringList.add(2, "Mango");
        System.out.println("After adding 'Mango' at index 2: " + stringList);

        // Step 5: Remove an element by value
        stringList.remove("Banana");
        System.out.println("After removing 'Banana': " + stringList);

        // Step 6: Remove an element at a specific index
        stringList.remove(3);
        System.out.println("After removing element at index 3: " + stringList);

        // Step 7: Update the element at a specific index
        stringList.set(5, "Pineapple");
        System.out.println("After updating index 5 to 'Pineapple': " + stringList);

        // Step 8: Check if an element is present at a particular index
        int checkIndex = 4;
        if (checkIndex < stringList.size()) {
            System.out.println("Element at index " + checkIndex + ": " + stringList.get(checkIndex));
        } else {
            System.out.println("Index " + checkIndex + " is out of bounds.");
        }

        // Step 9: Get an element at a particular index
        int getIndex = 2;
        System.out.println("Element at index " + getIndex + ": " + stringList.get(getIndex));

        // Step 10: Find the size of the ArrayList
        System.out.println("Size of ArrayList: " + stringList.size());

        // Step 11: Check if a given element is present in the ArrayList
        String searchElement = "Mango";
        System.out.println("Does ArrayList contain '" + searchElement + "'? " + stringList.contains(searchElement));

        // Step 12: Remove all elements from the ArrayList
        stringList.clear();
        System.out.println("After clearing ArrayList: " + stringList);
    }
}
