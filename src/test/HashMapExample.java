package test;

import java.util.*;

public class HashMapExample {
    public static void main(String args[]){
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        //slight difference between hashmap and hashtable//important interview question
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        hm.put(0,"ram");
        hm.put(1,"shyam");
        hm.put(42,"ram");
        hm.put(3,"mohan");
        hm.put(4,null);
        System.out.println(hm);
        hm.remove(42);
        System.out.println(hm.get(42));
        //storing all the key and value in set
        //goal is to seperate the key and value
        // using iterator we access the key and value
        Set sn=hm.entrySet();
        Iterator it=sn.iterator();
        while (it.hasNext()){
            Map.Entry mp=(Map.Entry)it.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());

        }

    }
}
