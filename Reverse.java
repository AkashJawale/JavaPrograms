import java.io.*;
class Reverse1
{
int n,p,q;
void getdata(int x)
{
n=x;
}
void calculate()
{
while(n>0)
{
q=n%10;
p=p*10+q;
n=n/10;
}
}
void display()
{
System.out.println("Reverse of a no.is:"+p);
}
}
class Reverse
{
public static void main(String s[])
{
Reverse1 r=new Reverse1();
r.getdata(123);
r.calculate();
r.display();
}
}