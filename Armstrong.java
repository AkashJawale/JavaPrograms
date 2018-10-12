import java.io.*;
class Armstrong123
{
int n,p,q;
Armstrong123(int x)
{
n=x;
}
void calculate()
{
int temp;
temp=n;
while(n>0)
{
p=n%10;
q=q+(p*p*p);
n=n/10;
}
if(temp==q)
{
System.out.println("no.is armstrong"+q);
}
else
{
System.out.println("no. is not armstrong"+q);
}
}
}
class Armstrong
{
public static void main(String s[])
{
Armstrong123 a=new Armstrong123(153);
a.calculate();
}
}