package OnMobile.Techinical.Questions.com;

public class Morecombe21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Morecombe21 m = new Morecombe21();
		m.go(new Turing() {
		});
	}

	public void go(Turing t) {
		t.start();
	}
}

class Turing extends Thread {
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(i);
		}
	}
}