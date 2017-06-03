package interview.com;

import java.util.HashSet;

public class Hashsetduplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("DuplicateValue");
		StringBuffer sb2=new StringBuffer("DuplicateValue");
		StringBuffer sb3=new StringBuffer("DuplicateValue");
		StringBuffer sb4=new StringBuffer("DuplicateValue");
		HashSet set=new HashSet();
		set.add(sb1);
		set.add(sb2);
		set.add(sb3);
		set.add(sb4);
		/*System.out.println(set);*/
		set.add(1);
		set.add("null");
		set.add("null");
		set.add("Hello");
		set.add("HEllo");
		System.out.println(set);
	}

}
