interface Displayable {
    void display();
}

class DisplayClass implements Displayable {
    public void display() {
        System.out.println("Display method implemented.");
    }
}

public class Interface3 {
    public static void main(String[] args) {
        Displayable obj = new DisplayClass();
        obj.display();
    }
}
