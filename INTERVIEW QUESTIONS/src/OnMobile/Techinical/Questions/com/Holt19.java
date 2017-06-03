package OnMobile.Techinical.Questions.com;

public class Holt19 extends Thread {

	private String sThreadName;

	public static void main(String[] args) {
		Holt19 h = new Holt19();
		h.go();
	}

	public Holt19() {
	}

	public Holt19(String s) {
		sThreadName = s;
	}

	public String getThreadName() {
		return sThreadName;
	}

	public void go() {

		Holt19 first = new Holt19("First");
		first.start();
		Holt19 second = new Holt19("second");
		second.start();
	}

	public void start() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getThreadName() + i + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
