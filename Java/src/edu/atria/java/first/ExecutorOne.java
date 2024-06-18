package edu.atria.java.first;

public class ExecutorOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base bOne = new base();

		// private members are not visible outside the class
		// System.out.println(bOne.varPrivate);
		System.out.println(bOne.variableDefault);
		System.out.println(bOne.variableProtected);
		System.out.println(bOne.variablepPublic);

	}

}
