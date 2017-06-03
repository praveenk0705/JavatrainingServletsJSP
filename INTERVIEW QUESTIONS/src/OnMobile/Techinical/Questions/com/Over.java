package OnMobile.Techinical.Questions.com;

public class Over extends base {

	public static void main(String[] args) {
		Over o = new Over();
		int iBase = 0;
		o.amethod(iBase);
	}

	public void amethod(int over) {
		System.out.println("Over.amethod-");
	}
}

class base {
	private void amethod(int iBase) {
		System.out.println("Base.amethod");
	}
}