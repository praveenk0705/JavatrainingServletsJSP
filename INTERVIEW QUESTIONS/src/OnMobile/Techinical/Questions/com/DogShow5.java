package OnMobile.Techinical.Questions.com;

public class DogShow5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Hound().bark();
((Dog) new Hound()).bark();
/*((Dog) new Hound()).sniff();*/
	}

}
class Dog{
	public void bark(){
		System.out.println("---Dog Woof---");
	}
}
class Hound extends Dog{
	public void bark(){
		System.out.println("---Override Dog Woof in Hound HOW1---");
	}
	public void sniff(){
		System.out.println("sniff");
	}
}