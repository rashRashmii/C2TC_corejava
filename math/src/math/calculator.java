package math;
import java.util.*;
public class calculator
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter operator ");
		char op=s.next().charAt(0);
		System.out.println("enter operand");
		double fi=s.nextDouble();
		double se=s.nextDouble();
		double r=0;
		switch (op)
		{
			case'+':r=fi+se;
			System.out.println("result is "+r);break;
			case'-':r=fi-se;
			System.out.println("result is "+r);break;
			case'*':r=fi*se;
			System.out.println("result is "+r);break;
			case'/':r=fi/se;
			System.out.println("result is "+r);break;
			case'%':r=fi%se;
			System.out.println("result is "+r);break;
			default:System.out.println("invalid operator ");break;
		}
	}
}
