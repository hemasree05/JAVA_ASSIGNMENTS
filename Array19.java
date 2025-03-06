public class Array19 {
    static int findMissing(int[] arr) {
        int n = 100;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] arr = new int[99];
        int missing = 50; // Assume 50 is missing
        for (int i = 1, j = 0; i <= 100; i++) {
            if (i != missing) arr[j++] = i;
        }
        System.out.println("Missing Number: " + findMissing(arr));
    }
}