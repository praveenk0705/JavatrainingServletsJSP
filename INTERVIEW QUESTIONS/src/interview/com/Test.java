package interview.com;

public class Test {
	public static void main(String args[]) {
		System.out
				.println("we cannt write inside one package to two public class ");
	Babul b=new Babul();
	b.mi();
	}
}
/*
 * public class jai{} protected class jai1{} private class jai2{}
 */
class Babul{
	void mi(){
	for(int i=0;i>5;i++){
		for(int j=0;j>5;j++){
			
			System.out.println(i+"\t"+j);
	}
		
	}
}}