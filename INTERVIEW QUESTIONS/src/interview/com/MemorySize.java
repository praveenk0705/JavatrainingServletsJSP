package interview.com;

public class MemorySize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long heapsize = Runtime.getRuntime().totalMemory();
		System.out.println("TotalMemory():->" + heapsize);
		System.out.println();
		long heapsize1 = Runtime.getRuntime().freeMemory();
		System.out.println("FreeMemory():->" + heapsize1);
		System.out.println();
		long heapsize2 = Runtime.getRuntime().maxMemory();
		System.out.println("MaxMemory():->" + heapsize2);
		System.out.println();
		long heapsize3 = Runtime.getRuntime().availableProcessors();
		System.out.println("AvailableProcessors():->" + heapsize3);
	
	
	}

}
