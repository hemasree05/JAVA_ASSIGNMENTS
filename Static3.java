public class Static3 {
    static int staticVar1 = 50;
    static String staticVar2 = "Static Data";

    void displayStaticVars() {
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
    }

    public static void main(String[] args) {
       Static3 obj = new Static3();
        obj.displayStaticVars();
    }
}