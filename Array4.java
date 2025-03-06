public class Array4 {
    static boolean contains(int[] arr, int key) {
        for (int num : arr) {
            if (num == key) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(contains(arr, 3) ? "Found" : "Not Found");
    }
}