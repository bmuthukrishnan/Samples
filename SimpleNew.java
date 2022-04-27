package Java8.src.com.exp;

public class SimpleNew {

	public static void main(String[] args) {
//		String sarray[] = new String ();
		String str = "Muthukrishnan had a house named as Muthukrishnan is Muthukrishnan";
		String sarray[] = str.split(" ");
		int count =0;
		for (int i=0;i<=sarray.length-1;i++) {
		if (sarray[i].contains("Muthukrishnan")) 
		count = count +1;
		}
		System.out.println(" Count of Muthukrishnan is "+count);
		System.out.println("String length ="+str.length());
		
	}
}
