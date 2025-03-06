class Exp4 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}