package com.exp;

public class Bsort {

	public static void main(String[] args) {

		int a[] = {4, 67, 5,87,21,25,3,44, 60,43, 103};
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if(a[j-1] > a[j]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(" "+a[i]);
		}
	}

}
