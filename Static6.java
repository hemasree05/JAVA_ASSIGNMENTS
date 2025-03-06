public class Static6 {
    static int staticVar1 = 30;
    static String staticVar2 = "Static Data";

    int instanceVar1 = 60;
    String instanceVar2 = "Instance Data";

    public static void main(String[] args) {
        Static6 obj = new Static6();

        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);
        System.out.println("InstanceVar1: " + obj.instanceVar1);
        System.out.println("InstanceVar2: " + obj.instanceVar2);
    }
}