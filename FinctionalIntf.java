package Java8.src.com.exp;

interface Addition {
	public int add(int a, int b);
}

public class FinctionalIntf {

	public static void main(String[] args) {
		
//		Addition ad = new Addition() {
//			
//			@Override
//			public int add(int a, int b) {
//				// TODO Auto-generated method stub
//				return a.add(10, 15);
//			}
//		}; 
		
		Addition ad1 = (a, b) -> (a + b);
//		ad1.add(10, 40);
		System.out.println(" Added value = "+ad1.add(10, 40));
	}

}
