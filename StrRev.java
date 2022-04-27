package Java8.src.com.exp;

public class StrRev {

	public static void main(String[] args) {

		String str = "Java programming";
		char car;
		
		for (int l = str.length()-1; l >= 0; l--) {
			car = str.charAt(l);
//			StringBuffer sb = new StringBuffer();
			String st = "";
			//System.out.print(car);
//			sb =sb.append(car);
//			System.out.print(sb);
			st = st+car;
			System.out.print(st);
		}
		
		for (int i = str.length() -1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			
		}
	}
}
