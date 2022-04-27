package Java8.src.com.exp;

import java.lang.reflect.Array;
import java.util.Iterator;

public class Sample {

	public static void main(String[] args) {

		String str1="This is to check occurance of a specifice character";
		int count=0;
		for (int i = 0; i < str1.length(); i++) {
//			System.out.println(str.charAt(i));
			if (str1.charAt(i) == 'c') {
				count ++;
			}
		}
//		System.out.println("C character count"+count);
//		String str = "TESTu45";
//		str=str.replaceAll("\\d", "");
//		int l = str.length();
//		System.out.println("The length of the string without digit is:" + l);
		char c[] = str1.toCharArray();
		
		for (int i = 0; i < c.length/2; i++) {
			char temp = c[i];
			c[i] = c[c.length - i-1];
			c[c.length - i-1] = temp;			
		}
		System.out.println("Reverse strign is ="+str1);
		
		int a[]= new int[10];
		a[0]=1;
		a[1]=5;
		a[2]=17;
		a[3]=9;
		a[4]=8;
		a[5]=67;
		a[6]=23;
		a[7]=7;
		a[8]=4;
		a[9]=21;
		int greatest =0;
		for (int i = 0; i < a.length-1; i++) {
			//greatest = a[i];
			if (a[i] > a[i+1]) {
				if(greatest <a[i]) {
				greatest = a[i];
//				System.out.println("Grt =a[i]"+greatest);
				}
			}
		}
		System.out.println("greatest = "+greatest);
		}
}
