package interview.com;

public class AscendingOrder {
	public static void main(String[] args){

	 	int arr[] = {1,0,9,6,7,3,9,2,90,6,76,67,5,9};
	 	
	 	for(int i=0;i<arr.length-1;i++){
	 		for(int j=i+1;j<arr.length;j++){
	 			if(arr[i]>=arr[j]){
	 				int temp=arr[i];
	 					arr[i]=arr[j];
	 					arr[j]=temp;
	 			}
	 		}
	 	}
	 	for(int i=0;i<arr.length;i++){
	 		System.out.print(" "+arr[i]);
	 	}
	 		
	}
}
