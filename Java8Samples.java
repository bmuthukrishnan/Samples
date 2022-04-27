package Java8.src.com.exp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Stream;
 
public class Java8Samples {
    public static void main(String[] args)
    {
        String[] words = new String[5];
        words[0] = "Top ten";
        words[1] = "Top ten";
        words[2] = "Top ten";
        words[3] = "Top ten";
        words[4] = "Top ten";
        //words[5] = "Top ten";

//        Optional<String> checkNull
//            = Optional.ofNullable(words[4]);
//        if (checkNull.isPresent()) {
//            String word = words[4].toLowerCase();
//            System.out.print(word);
//        }
//        else
//            System.out.println("word is null");
        List ls = new ArrayList<Integer>();
        		
        for(int i = 0; i<=10;i++) {
        	ls.add(i);
        }
        System.out.println("Array Value ="+ls);
        Stream<Integer> st = ls.stream();
        Stream<Integer> st1 = ls.parallelStream();
        Stream<Integer> high = st1.filter(p -> p >4);
        System.out.println("High Value ="+high.count());
        ls.forEach(n -> System.out.println("Value of list"+n));
        
//        high.forEach(p -> System.out.println("Value of P= "+p));
        Map<Integer, String> map =new HashMap<Integer, String>();
        map.put(1, "First");
        map.put(2, "Second");
        map.put(3, "Third");
        map.put(4, "Fourth");
        map.put(5, "Fifth");
        
        System.out.println("Map Values ="+map);
        Iterator<Map.Entry<Integer, String>> itr = (Iterator) map.entrySet().iterator();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//			System.out.println("Key = "+entry.getKey()+"Value ="+entry.getValue());
		}
        map.forEach((k, v) -> System.out.println(" Key ="+k+"Value ="+v));
        
//        // using keySet() for iteration over keys
//        for (Integer name : map.keySet())
//            System.out.println("key: " + name);
//         
//        // using values() for iteration over values
//        for (String url : map.values())
//            System.out.println("value: " + url);
        
    }
}