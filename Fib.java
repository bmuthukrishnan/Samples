package Java8.src.com.exp;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Fib {

	public static void main(String[] args) throws IOException {

		int a[] = {1,4,6, 56,34,3,9,20,45,90,200,30};

		//Fibonaci series
		for (int i = 0; i < 10; i++) {
//			System.out.println("Array output "+ a[i]);
		}
		int i,j=0; 
		int k=1;
		for (int k2 = 0; k2 < 10; k2++) {
			i=j;
			j=k;
			k=i+j;
			System.out.println("Series = "+i);
			
		}
//		URL url = new URL("http://example.com");
//		URLConnection n = url.openConnection();
//		n.
	}
}
