package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataFormatJava {
    public static void main(String args[]){
        //date programs
        Date d=new Date();
        SimpleDateFormat sd=new SimpleDateFormat("M/d/y");
        SimpleDateFormat sdf=new SimpleDateFormat("M/d/y hh:mm:s");
        System.out.println(d.toString());
        System.out.println(sd.format(d));
        System.out.println(sdf.format(d));
        //Calender Demo
        calenderDemo();
    }
    private static void calenderDemo() {
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat sdft=new SimpleDateFormat("M/d/y hh:mm:s");
        System.out.println(sdft.format(cal.getTime()));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
