package interview.com;

public class UstlGolobal {
	public static void main(String args[]) {
		test t = new A();
		System.out.println(t.hashCode());
		A a = new B();
		a.m1();

	}
}

interface test {

}

class A implements test {
	void m1() {
		System.out.println("--m1()---");
	}

	void m2() {
		System.out.println("--m2()---");
	}
}

class B extends A {
	void m1() {
		System.out.println("--m1 B()---");
	}
}