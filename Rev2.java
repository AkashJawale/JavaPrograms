import java.util.Scanner;
class Rev2
{
	public static void main(String[] arg)
	{
	int a,res=0,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	n=sc.nextInt();
	for( ;n!=0; )
	{
	a=n%10;
	res=(res*10)+a;
	n=n/10;
	}
	System.out.println("Reverse of a number is =  "+res);
	}
}