package math;
import java.util.*;
public class student 
{
	String name,branch,usn;
	long phnno;
	void insert(String na,String b,String u,long p)
	{
		name=na;
		branch=b;
		usn=u;
		phnno=p;
	}
	void display()
	{
		System.out.println("name= "+name);
		System.out.println("branch= "+branch);
		System.out.println("usn= "+usn);
		System.out.println("phoneno= "+phnno);
	}
	public static void main(String[] args)
	{
		student st[]=new student[10];
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of students ");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
			st[i]=new student();
		for(int j=0;j<n;j++)
		{
			System.out.println("enter name branch usn phone no");
			String name=s.next();
			String branch=s.next();
			String usn=s.next();
			long phnno=s.nextLong();
			st[j].insert(name, branch, usn, phnno);
		}
		for(int m=0;m<n;m++)
		{
			System.out.format("student %d details are \n ",m+1);
			st[m].display();
		}
	}
}
