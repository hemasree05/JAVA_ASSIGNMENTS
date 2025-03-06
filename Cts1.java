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
        stringList.add("Kiwi");
        System.out.println("After adding 'Kiwi': " + stringList);
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        stringList.add(2, "Mango");
        System.out.println("After adding 'Mango' at index 2: " + stringList);
        stringList.remove("Banana");
        System.out.println("After removing 'Banana': " + stringList);
        stringList.remove(3);
        System.out.println("After removing element at index 3: " + stringList);
        stringList.set(5, "Pineapple");
        System.out.println("After updating index 5 to 'Pineapple': " + stringList);
        int checkIndex = 4;
        if (checkIndex < stringList.size()) {
            System.out.println("Element at index " + checkIndex + ": " + stringList.get(checkIndex));
        } else {
            System.out.println("Index " + checkIndex + " is out of bounds.");
        }
        int getIndex = 2;
        System.out.println("Element at index " + getIndex + ": " + stringList.get(getIndex));
        System.out.println("Size of ArrayList: " + stringList.size());
        String searchElement = "Mango";
        System.out.println("Does ArrayList contain '" + searchElement + "'? " + stringList.contains(searchElement));
        stringList.clear();
        System.out.println("After clearing ArrayList: " + stringList);
    }
}
