package OnMobile.Techinical.Questions.com;

public class Agg17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Agg17 a = new Agg17();
		a.go();
	}

	public void go() {

		DSRoss ds1 = new DSRoss("One");
		ds1.start();

	}

}

class DSRoss extends Thread {
	private String sTname = "";

	public DSRoss(String s) {
		sTname = s;
	}

	public void run() {
		notwait();
		System.out.println("finished");
	}

	public void notwait() {
		while (true) {
			try {
				System.out.println("waiting");
				wait();
			} catch (InterruptedException e) {

			}
			System.out.println(sTname);
			notifyAll();
		}
	}
}
