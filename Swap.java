import java.io.*;
class Swap
  {
    public static void main(String s[])
      {
        int a,b,t;
        a=Integer.parseInt(s[0]);
        b=Integer.parseInt(s[1]);
        t=a;
        a=b;
        b=t;
        System.out.println("Swaping of two numbers:"+a+b);
     }
  } 
