package interview.com;

public class Test1 {
	public static void main(String args[]) {
		Student st = new Student();
		st.m1(23, "mani");
	}
}

class Student {
	private int age;

	void m1(int age, final String name) {
		this.age = age;
		System.out.println(age);
		System.out.println(name);
	}
}

