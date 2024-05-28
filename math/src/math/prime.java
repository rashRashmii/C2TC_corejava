package math;
import java.util.Scanner;
public class prime 
{
	public static void main(String[] args)
	{
		int i,n,flag=0;
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
			}
			break;
		}
		if(flag==1)
		{
			System.out.println("given number is not prime ");
		}
		else
		{
			System.out.println("given number is prime ");
		}
	}
}
