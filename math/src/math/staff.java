package math;
import java.util.Scanner;
public class staff 
{
	String id,name;
	long phone;
	float salary;
	void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter staff name,id,salary and phone number ");
		name=s.next();
		id=s.next();
		salary=s.nextFloat();
		phone=s.nextLong();
	}
	void display()
	{
		System.out.println("staff name = "+name);
		System.out.println("staff id = "+id);
		System.out.println("staff salary = "+salary);
		System.out.println("staff phone number = "+phone);
	}
}
class teach extends staff
{
	String d;
	int n;
	public void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter domain");
		d=s.next();
		System.out.println("enter no of publications");
		n=s.nextInt();
		System.out.println("\n");
	}
	public void display()
	{
		System.out.println("domain = "+d);
		System.out.println("publications = "+n);
		System.out.println("\n");
	}
}
class tech extends staff
{
	String skill;
	public void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter technical skills ");
		skill=s.nextLine();
		System.out.println("\n");
	}
	public void display()
	{
		System.out.println("tech skills  = "+skill);
		System.out.println("\n");
	}
}
class contract extends staff
{
	int p;
	public void accept()
	{
		Scanner s=new Scanner(System.in);
		p=s.nextInt();
		System.out.println("\n");
	}
	public void display()
	{
		System.out.println("contract period = "+p);
		System.out.println("\n");
	}
}
class four
{
	public static void main(String[] args)
	{
		teach =new teach();
		System.out.println("enter teaching staff details ");
		teach accept();
		
	}
}