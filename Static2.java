public class Static2 {
    int instanceVar1 = 100;
    String instanceVar2 = "Instance Data";

    static void displayInstanceVars() {
        Static2 obj = new Static2();
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }
    public static void main(String[] args) {
        displayInstanceVars();
    }
}