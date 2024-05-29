package StreamFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdNullMap {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,3,4,5,6,7);
		List<Integer> result = new ArrayList<Integer>();
		
		for(int n: number)
		{
			result.add(n*3);
		}
		System.out.println(result);
		System.out.println("--------------------------------------------");
		
		number.stream().map(n->n*3).forEach(System.out::println);
		
		System.out.println("--------------------------------------------");
		
		number.stream().map(n->n*3).forEach(mul->System.out.println(mul));
		
		System.out.println("--------------------------------------------");
		
		result = number.stream().map(n->n*3).collect(Collectors.toList());
		System.out.println(result);
		}

}
