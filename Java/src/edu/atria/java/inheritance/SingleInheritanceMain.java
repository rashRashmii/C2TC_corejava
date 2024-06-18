package edu.atria.java.inheritance;

public class SingleInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee eOne=new Employee(1314521544,5468415,"Indian",121,"Rahul","Full Stack Developer",500000.00);
		Citizen eTwo = new Employee(854154752,3212544,"Indian",131,"Ravi","tester",523366.00);
		System.out.println(eTwo);
		
		Citizen sOne = new Student(154864152,8685251,"Indian",101,"Rich","CSE","Rahul");
		System.out.println(sOne);
	}

}
