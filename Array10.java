import java.util.HashSet;
public class Array10 {
    static void printDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int n : arr) {
            if (!seen.add(n)) System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        printDuplicates(arr);
    }
}