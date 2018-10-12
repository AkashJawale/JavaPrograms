import java.io.*;
class Marks
  {
    public static void main(String s[])
      {
        int m;
        m=Integer.parseInt(s[0]);
        switch(m/10)
          {
             case 10:
             case 9:
             case 8:
                 System.out.println("Excellent");
                 break;
             case 7:
                 System.out.println("very good");
                 break;
             case 6:
                 System.out.println("good");
                 break;
             case 5:
                 System.out.println("work hard");
                 break;
             case 4:
                 System.out.println("poor");
                 break;
             case 3:
             case 2:
             case 1:
             case 0:
                 System.out.println(" very poor");
                 break;
             default:
                 System.out.println("Enter valid marks out of 10");
            }
       }
  }