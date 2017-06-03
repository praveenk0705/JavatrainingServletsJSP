package interview.com;

public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("String()");
		String st=new String("Mani");
		String st1=new String("Mani");
		System.out.println(st.equals(st1));
		System.out.println(st==st1);
		System.out.println();
		System.out.println("StringBuffer()");
		System.out.println();
		StringBuffer sb=new StringBuffer("Mani");
		StringBuffer sb1=new StringBuffer("Mani");
		System.out.println(sb.equals(sb1));
		System.out.println(sb==sb1);
		System.out.println();
		System.out.println(sb.equals(sb1));
	}

}
