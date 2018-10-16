import java.io.*;
class Logical
{
public static void main(String s[])
{
Boolean A=true;
Boolean B=false;
System.out.println("A|B="+(A|B));
System.out.println("A&B="+(A&B));
System.out.println("!A="+(!A));
System.out.println("A^B="+(A^B));
System.out.println("(A|B)&A="+(A|B&A));
}
}