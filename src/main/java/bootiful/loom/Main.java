package bootiful.loom;

import java.util.ArrayList;

public class Main {

    /*public static void main(String[] args) {
        String name = "Joan";
        String info = STR."My name is \{name}";
        System.out.println(info);
    }*/

    ArrayList<String> list = new ArrayList<>();

    void addNewString(String str) {
        list.add(str);
    }


    public void removeString() {
        list.removeLast();
    }
}
