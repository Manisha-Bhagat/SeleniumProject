package test;

import java.util.ArrayList;

public class CollectionProgramQuestion {
    public static void main(String args[]) {
        //given an array with duplicated values
        //write a program to print only unique number and print the frequency of that number as well.
        int a[] = {4, 4, 4, 4, 4, 2, 2, 2, 2, 1, 1, 1, 1,3};
        //output should be 4 is repeated 4 times
        //output should be 3 is repeated 4 times etc
        ArrayList<Integer> al = new ArrayList<Integer>();
       for(int i=0;i<a.length;i++){
           int k=0;
           if(!al.contains(a[i])){
               al.add(a[i]);
               k++;
               for(int j=i+1;j<a.length;j++){
                   if(a[i]==a[j]){
                       k++;
                   }
               }
               System.out.println(a[i]+ "="  +k);
           }
           if(k==1){
               System.out.println(a[i]+ " is a unique number");
           }

       }

        //System.out.println(al);  //print the unique numbers from array
    }

}
