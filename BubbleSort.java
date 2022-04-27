package Java8.src.com.exp;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = {12, 56, 78, 4, 56, 98, 54, 9};
		BubbleSort.bsort(a);
		for(int k=0; k < a.length; k++){  
			System.out.print(a[k] + " ");  
//		System.out.println("Array value ="+ b);
		}
	}
	static void bsort(int []a) {
		//int b[] = {10};
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j-1] > a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
