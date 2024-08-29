/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;

/**
 *
 * @author nithish
 */

class Subject
{
    private String  subID,name;
    private int maxMarks,marksObtain;
    
    public  Subject(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtained(){return marksObtain;}
    
    public void setMarks(int m)
    {
        maxMarks=m;
    }
    public void setMarksObtain(int m)
    {
        marksObtain=m;
    }
    
    boolean isQualified(int m)
    {
        return m>maxMarks;
    }
    public String toString()
    {
        return "\nSubject ID :"+subID+"\nName :"+name+"\nMarks Obtained: "+marksObtain;
    }
}

public class ArrayOfObjects {
    public static void main(String []args)
    {
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DS",100);
        subs[1]=new Subject("s102","Algorithmss",100);
        subs[2]=new Subject("s103","OS",0);
        
        for(Subject s:subs)
        {
            System.out.println(s);
        }
    }
}
