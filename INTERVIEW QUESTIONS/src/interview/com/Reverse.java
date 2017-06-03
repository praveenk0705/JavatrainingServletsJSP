package interview.com;

public class Reverse {
	public static void main(String[] args){

 		String str = "mani@jlcindia";
 		String revstr="";
 		for(int i=0;i<str.length();i++){
 			revstr=str.charAt(i)+revstr;
 		}
 		System.out.println(revstr);
 	}
}
