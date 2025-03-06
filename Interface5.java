interface First {
    void commonMethod();
}

interface Second {
    void commonMethod();
}

class CommonClass implements First, Second {
    public void commonMethod() {
        System.out.println("Common method implemented.");
    }
}

public class Interface5 {
    public static void main(String[] args) {
        CommonClass obj = new CommonClass();
        obj.commonMethod();
    }
}