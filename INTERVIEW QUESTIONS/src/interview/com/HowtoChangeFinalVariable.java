package interview.com;

public class HowtoChangeFinalVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(22);
		p.setName("Singh");
		System.out.println(p.getAge());
		System.out.println(p.getName());
	}

}

class Person {
int age = 222888;
String name = "Manillllll";
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

	

}