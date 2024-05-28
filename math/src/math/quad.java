package math;
import java.util.Scanner;
public class quad 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		double r1,r2;
		System.out.println("enter coefficients");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		double d=(b*b)-(4*a*c);
		System.out.println("determinant is " +d);
		if(d>0)
		{
			r1=(-b+Math.sqrt(d))/(2*a);
			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("roots are real and distinct ");
			System.out.format("r1=%.2f and r2=%.2f",r1,r2);
		}
		else if(d==0)
		{
			r1=r2=-b/(2*a);
			System.out.println("roots are real and equal ");
			System.out.format("r1=r2= %.2f",r1);
		}
		else
		{
			double r=-b/(2*a);
			double i=Math.sqrt(-d)/(2*a);
			System.out.println("roots are real and imaginary ");
			System.out.format("r1=%.2f+i%.2f\n",r,i);
			System.out.format("r2=%.2f-i%.2f",r,i);
		}
	}
}
