import java.util.*;
import java.io.*;
public class Has
{
    public static void main(String args[])throws Exception
    {
        int n,sal=0;
        String name="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hashtable  h = new Hashtable();
       System.out.println("Enter number of  Employee : ");
        n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++)
        {
            System.out.println("\nEnter name : ");
            name = br.readLine();
            System.out.println("Enter the Salary:");
            sal=Integer.parseInt(br.readLine());
            h.put(name,sal);
        }
       Enumeration v = h.elements();   //sal
       Enumeration k = h.keys();          //name
       System.out.println("\nEmployee Name \t Emp Sal");
       while(k.hasMoreElements())
       {
     System.out.println(k.nextElement()+"\t\t"+v.nextElement());
       }
      int max = 0;String str="";
      k = h.keys();
      v = h.elements();
       while(v.hasMoreElements())
       {
     //System.out.println(v.nextElements());
     sal=(Integer)v.nextElement();
     name = (String)k.nextElement();
     if(sal>max)
     {
           max = sal;
           str = name;
     }

       }
       System.out.println("\n Employee Name="+str +" \n has maximum salary is "+max);

  }
}