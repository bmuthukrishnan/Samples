package Java8.src.com.exp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CodeExample {

	public static void main(String[] args) {

		
		List<String> lst = new ArrayList<String>();
		String a[] = {"Regarding", "Fin", "Ability", "Calculator", "Vendor", "Result"};
		lst = Arrays.asList(a);
		List<String> stm = lst.stream().filter(p -> p.startsWith("R")).collect(Collectors.toList());
		System.out.println("List Size ="+stm.size());
	}

}
