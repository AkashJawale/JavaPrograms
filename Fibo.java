import java.io.*;
class Fibo
{
public static void main(String s[])
{
int a=0,b=1,c=0,n,i=2;
n=Integer.parseInt(s[0]);
System.out.println(""+a);
System.out.println(""+b);
while(i<n)
{
c=a+b;
System.out.println(""+c);
a=b;
b=c;
i++;
}
}
}
