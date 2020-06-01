package test;


public class StaticVarJavaExample {
    String name;
    String address;
    static String city;
    static int i;
    static {
        city="bangalore";
        i=0;
    }
    final int j=5;
    StaticVarJavaExample(String name,String address){
       this.name=name;
       this.address=address;
      // i++;
       //System.out.println(i);

    }
    public void getData(){
        System.out.println(address+" "+city);
        i++;
        System.out.println(i);
    }
    public static void getcity(){
       System.out.println(i);
    }
    public static void main(String args[]){
        StaticVarJavaExample ob1=new StaticVarJavaExample("ram","bilekahalli");
        StaticVarJavaExample ob2=new StaticVarJavaExample("Shyam","jaynagar");
        ob1.getData();
        ob2.getData();
        StaticVarJavaExample.getcity();
        System.out.println(StaticVarJavaExample.i=4);
        System.out.println(ob1.j);

    }
}
