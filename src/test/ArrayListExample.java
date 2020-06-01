package test;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String args[]){
        ArrayList<String> a = new ArrayList<String>();
        a.add("ram");
        a.add("shyam");
        a.add("kishan");
        a.add("ram");
        System.out.println(a);
        a.add(1,"mohan");
        System.out.println(a);
        a.remove(1);
        System.out.println(a);
        a.remove("shyam");
        System.out.println(a);
        System.out.println(a.get(0));
        //check whether "testing" word is present is the list or not
        System.out.println(a.contains("testing"));
        System.out.println(a.indexOf("ram"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());

    }
}
