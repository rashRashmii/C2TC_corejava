package second;

import edu.atria.java.first.base;

//by explictly giving entends keyword we can access all the members from the other package
public class ExecutorTwo extends base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base bTwo = new base();

		// private,protected and default members are not accessible outside the first
		// package but can be accesssed with the same package od differnt classes.
		ExecutorTwo ex = new ExecutorTwo();
		System.out.println(ex.variableProtected);

		System.out.println(bTwo.variablepPublic);
	}

}
