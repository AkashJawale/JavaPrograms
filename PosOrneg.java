import java.io.*;
class PosOrNeg
{
public static void main(String s[])
{
int a;
a=Integer.parseInt(s[0]);
if(a==0)
{
System.out.println("no. is zero");
}
else
if(a>0)
{
System.out.println("no. is positive");
}
else
{
System.out.println("no is negative");
}
}
}