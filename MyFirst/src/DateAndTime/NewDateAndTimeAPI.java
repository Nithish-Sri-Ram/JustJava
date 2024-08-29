/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateAndTime;

/**
 *
 * @author nithish
 */

import java.time.*;

public class NewDateAndTimeAPI {
    public static void main(String args[])
    {
        //This new date API will store the value in seconds - Previously it used to store it in milli seconds 
        //This date and time created will br immutable and we cannot make any kind of modifications
        
        //We cant create a new date but we can get the current date
        LocalDate dt=LocalDate.now();   //This will give todays date
        LocalDate dt1=LocalDate.now(Clock.systemDefaultZone());
        LocalDate dt2=LocalDate.now(ZoneId.of("Asia/Kolkata"));
        
        System.out.println(dt);
        System.out.println(dt1);
        System.out.println(dt2);
        
        //if we want date of a particular month
        LocalDate dt3=LocalDate.of(2020, Month.MARCH, 10);
        System.out.println(dt3);
        LocalDate dt4=LocalDate.parse("2019-01-24");
        System.out.println(dt4);
        LocalDate d=dt4.plusYears(3);       //This will add 3 extra years and will not make modifications on the same object rather give a new object
        System.out.println(d);
        
        
        //THis will contain the time 
        LocalTime t=LocalTime.now();
        System.out.println(t);
        
        
        //This will contain both date and time 
        LocalDateTime dtt=LocalDateTime.now();
        System.out.println(dtt);
    }
}
