package edu.atria.java.polymorphism;

public class OverridingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rbi bankOne = new Sbi();
		System.out.println(bankOne.getRI());
		
		Rbi bankTwo = new Icici();
		System.out.println(bankTwo.getRI());
	}

}
// while overriding child class method signature and parent class method signatures must be sameotherwise we are getting compilation error
// the return types of overridden method and overriding method must be same.
// while overriding the methods it is possible to maintain same level permission or increasing order but not in decreasing order, if you are trying to reduce the permission compiler generates error message "attempting to assign weaker access privilages".
// final methods are preventing overriding.
// static methods are bounded with same class hence we are unable to override static methods.
