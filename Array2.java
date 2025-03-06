public class Array2 {
    static double avgArray(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Average: " + avgArray(arr));
    }
}