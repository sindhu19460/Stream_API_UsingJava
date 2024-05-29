package StreamFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,3,4,5,6,7);
		List<Integer> result = new ArrayList<Integer>();
		
		number.stream().map(n->n+10).forEach(System.out::println);
		System.out.println("-----------------------------------");
		result = number.stream().map(n->n+10).collect(Collectors.toList());
		System.out.println(result);
		System.out.println("---------------Flatmap-------------------");
		
		
		List<Integer> lst1 = Arrays.asList(1,2);
		List<Integer> lst2 = Arrays.asList(3,4);
		List<Integer> lst3 = Arrays.asList(5,6);
		
		List<List<Integer>> FlatMap = Arrays.asList(lst1,lst2,lst3);
		FlatMap.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(FlatMap);
		
		List<Integer> Finalresult = FlatMap.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(Finalresult);
		
		
		
		List<Integer> Mulresult = FlatMap.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
		System.out.println(Mulresult);
		
	}

}
