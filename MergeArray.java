import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 = new int[4];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first array");
		for(int i=0;i<=5;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter the second array");
		for(int i=0;i<=3;i++) {
			arr2[i]=scan.nextInt();
		}
		
		int index=arr1.length-1;
		int arr1_index= 5;
		int arr2_index=3;
		
		while(arr1_index>=0&& arr2_index>=0) {
			if(arr1[arr1_index] > arr2[arr2_index]) {
				arr1[index]=arr1[arr1_index];
				index--;
				arr1_index--;
			}else {
				arr1[index]=arr2[arr2_index];
				index--;
				arr2_index--;
			}
		}
		
		for(int n:arr1) {
			System.out.println(n);
		}
		
		
		
		
		
	scan.close();	
	}

}
