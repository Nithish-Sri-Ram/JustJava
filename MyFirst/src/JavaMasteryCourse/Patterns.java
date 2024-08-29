package JavaMasteryCourse;

import java.util.*;
//package myfirst;
/**
 *
 * @author nithish
 */
public class Patterns {
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt(),stars=1,spaces=n-2;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=stars;j++)
                System.out.print("* ");
            
            for(int j=1;j<=spaces;j++)
                System.out.print("  ");
            
            int s=stars;
            if((n/2)+1==i)
            {
                s--;
            }
            for(int j=1;j<=s;j++)
                System.out.print("* ");
            
            System.out.println();
            
            if(i<=n/2)
            {
                stars++;
                spaces-=2;
            }
            else{
                stars--;
                spaces+=2;
            }
        }
        
        
        
        
        
        
//        Enter a number: 7
//              * 
//            * * * 
//          * * * * * 
//        * * * * * * * 
//          * * * * * 
//            * * * 
//              * 
//        
//        int n=in.nextInt(),stars=1,spaces=n/2;
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=spaces;j++)
//                System.out.print("  ");
//            for(int j=1;j<=stars;j++)
//                System.out.print("* ");
//            
//            System.out.println();
//            if(i<=n/2)
//            {
//                stars+=2;
//                spaces--;
//            }
//            else{
//                stars-=2;
//                spaces++;
//            }
//            
//        }
//        
        
        
//        7
//        * 
//        * * 
//        * * * 
//        * * * * 
//        * * * 
//        * * 
//        * 
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=stars;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//            if(i<=(n/2))
//                stars++;
//            else
//                stars--;
//        }
    }
}
