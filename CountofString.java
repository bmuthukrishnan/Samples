package Java8.src.com.exp;

import java.util.HashMap;
import java.util.Map;

public class CountofString {
	public static void main(String[] args) {

		String str = "Muthu krishnan has house in this native and has another house in friend native";
		String strary [] = str.split(" ");
		System.out.println("String array value= "+ strary.length);
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < strary.length; i++) {
			if(map.containsKey(strary[i])) {
				int count = map.get(strary[i]);
						map.put(strary[i], count+1);
			}else {
				map.put(strary[i], 1); 
			}
		}
		System.out.println("=-------------------------");
		System.out.println("Value = "+map);
		for (int i = 0; i <  map.size(); i++) {
			
			System.out.println(strary[i]+"- key -"+map.get(strary[i]));
		}
	}
}