package myfirst;

public class Method {
//    static int max(int x, int y)
    int max(int x, int y)
    {
        return x>y?x:y;
    }
    
    //parameter passing in java - variables are copied from actual to formal parameters and 
    //values changed - of the variables wont affect the original value, but when objects are passed the actual values will be modified as we share the refereence of the object and not he copy of the value
    

    
    static int gcd(int n,int m)
    {
        if(n==m)
        return n;
        if(n>m)
            return gcd(n-m,m);
        if(m>n)
            return gcd(n,m-n);
        
        return 0;
    }
    //Variable argument parameters should be the last of the parameters
    static void show(int ...x)
    {
//        for(int i:x)
//        {
//            System.out.println(i);
//        }
        for(int i=0;i<x.length;i++)
        {
            System.out.println(i+1+"."+x[i]);
        }
    }
    public static void main(String []args)
    {
//        int a=15,b=20;
//        Method mp=new Method();
//        
//        System.out.println(mp.max(a,b));
        
        System.out.println(gcd(25,15));
        
        
        //variable array as parameter
        show();
        show(10,20,38);
        show(new int[]{3,5,7,9,11,13,15});
    }
}
