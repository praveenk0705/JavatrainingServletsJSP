package interview.com;

public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		C d = new C();
		d.m1();

	}

}

class B extends A {

	B() {
		System.out.println("I am B Constructor");
	}

}

class C extends B {
	C() {
		System.out.println("I am C Constructor");
	}

	void m1() {

	}

}