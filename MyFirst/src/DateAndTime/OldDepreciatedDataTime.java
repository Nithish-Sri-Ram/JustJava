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

public class OldDepreciatedDateTime {
    public static void main(String[] args) {
        // The following is for time representation.
        
        // Date is represented as a long number - it will contain milliseconds.
        // The start date is January 1st, 1970, by default.
        System.out.println(System.currentTimeMillis()); // This is the long value of all the milliseconds passed since the year 1970.
        // Now we want to check how many years have passed since then.
        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);
        
        // This is for the Date class.
        Date d = new Date();  // This will have the current date.
        Date dt = new Date(System.currentTimeMillis());  // Can also be done like this.
        Date dm = new Date("1/1/1980");  // Can also be done like this using parameters.
        System.out.println(d);
        System.out.println(dt);
        System.out.println(dm);
        
        // This is for the Calendar class.
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.MONTH)); // Starts counting from 0.
        System.out.println(gc.get(Calendar.WEEK_OF_MONTH)); // Starts counting from 1.
        
        // Next is TimeZone.
        // We can't create a TimeZone, but we can get the current time zone.
        
        TimeZone tz = gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());
        
        // We can change and set our time zone to a different one.
        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz1 = gc.getTimeZone();
        System.out.println(tz1.getID());
    }
}
