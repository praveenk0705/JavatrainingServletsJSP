package OnMobile.Techinical.Questions.com;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String n1,n2,n3;
		n1="n1";
		n2="n2";
		n3="n3";
		{
			String n4="inner";
			n2=n1;
		}
		n3=null;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println();
		
	}

}
