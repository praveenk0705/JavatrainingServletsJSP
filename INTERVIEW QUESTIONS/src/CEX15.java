Package OnMobile.Techinical.Questions.com;

public class CEX15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Base b = new Base();
		Sub s = (Sub) b;
		s.run();

	}

}

class Base {
	void run() {
		System.out.println("Base");
	}
}

class Sub extends Base {
	void run() {
		System.out.println("Sub");
	}
}