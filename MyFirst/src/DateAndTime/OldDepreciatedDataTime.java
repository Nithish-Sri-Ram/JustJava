/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateAndTime;

/**
 *
 * @author nithish
 */

import java.util.*;
public class OldDepreciatedDataTime {
    public static void main(String args[])
    {
        //THe below one is for rime 
        
        //Date is represented as a long number - it will contain milli seconds
        //The start date is 1970 - 1st Jan by default
        System.out.println(System.currentTimeMillis()); //This is long value of all the milli seconds passed from the year 1970
        //Now we want to check how many years have passed from then 
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        
        
        //This is for time class
        Date d=new Date();  //THis will have the current date
        Date dt=new Date(System.currentTimeMillis());  //can also be done like this 
        Date dm=new Date("1/1/1980");  //can also be done like this using parameters
        System.out.println(d);
        System.out.println(dt);
        System.out.println(dm);
        
        //This is for the calendar class 
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.MONTH)); //Starts counting from 0
        System.out.println(gc.get(Calendar.WEEK_OF_MONTH)); //Starts counting from 1
        
        
        //Next is TimeZone 
        //WE can't create a timezone but we can get timezone
        
        TimeZone tz=gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());
        
        //we can change and set our time zone to a different one 
        gc.setTimeZone(TimeZone.getTimeZone("America/los_Angles"));
        TimeZone tz1=gc.getTimeZone();
        System.out.println(tz1.getID());
        
    }
}
