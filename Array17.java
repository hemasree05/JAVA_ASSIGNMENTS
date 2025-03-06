import java.util.HashSet;
public class Array17{
    static boolean containsBoth(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) set.add(n);
        return set.contains(12) && set.contains(23);
    }
    public static void main(String[] args) {
        int[] arr = {10, 12, 15, 23, 35};
        System.out.println(containsBoth(arr) ? "Array contains both 12 and 23" : "Array does not contain both");
    }
}