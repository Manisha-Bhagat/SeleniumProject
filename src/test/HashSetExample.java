package test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String args[]){
        HashSet<String> hs=new HashSet<String>();
        hs.add("ant");
        hs.add("shyam");
        hs.add("ram");
        System.out.println(hs);
        hs.remove("ram");
        hs.add("mohan");
        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        //iterator concept in HashSet
        Iterator<String> i=hs.iterator();
        while(i.hasNext()){
            //i.next();
            System.out.println(i.next());
        }
       /* System.out.println(i.next());
        System.out.println(i.next());

*/

    }
}
