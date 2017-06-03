package interview.com;

abstract class Testt1 {
	abstract void m1() ;

	/*void m2() {
		System.out.println("Jai ho m()2");
	}

	void m3() {
		System.out.println("Jai ho m()3");
	}
}*/
}

  class sub1 extends Testt1 {
	/*
	 * void m1(){ System.out.println("Jai ho m()1"); } void m2(){
	 * System.out.println("Jai ho m()2"); } void m3(){
	 * System.out.println("Jai ho m()3"); }
	 */
	void m1() {
		System.out.println("NOt Override");
	}
}
public class Daut {

	public static void main(String[] args) {
		
		Testt1 tt = new sub1();
		
		tt.m1();
		System.out.println(tt);
	}

}
