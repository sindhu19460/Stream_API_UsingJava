package StreamFilter;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DistinctCountLimit {

	public static void main(String[] args) {
		
		List<String> vehicleList =  Arrays.asList("bus","car","bycle","bus","car","car","bike","bycle");
		// Distinct
		
		List<String> distinct_vehicle = new ArrayList<String>();
		
		distinct_vehicle = vehicleList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct_vehicle);
		System.out.println("-----------------------------");
		vehicleList.stream().distinct().forEach(value -> System.out.println(value));
		
		System.out.println("Count");
		System.out.println("-----------------------------");

		long countdata = vehicleList.stream().distinct().count();
		System.out.println(countdata);
		System.out.println("-----------------------------");

		//limit
		
		List<String> limit_fun = new ArrayList<String>();
		limit_fun = vehicleList.stream().limit(3).collect(Collectors.toList());
		System.out.println(limit_fun);
		
		System.out.println("-----------------------------");

		List<Integer> numberlist = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		long number = numberlist.stream().filter(num -> num%2==0).count();
		System.out.println(number);
		
		// min and max
		System.out.println("-----------------------------");

		Optional<Integer> min_no = numberlist.stream().min((val1,val2) -> {return val1.compareTo(val2);});
		System.out.println(min_no);
		System.out.println("-----------------------------");

		Optional<Integer> max_no = numberlist.stream().max((val1,val2) -> {return val1.compareTo(val2);});
		System.out.println(max_no);
		System.out.println("-----------------------------");

		List<String> stringList_reduce = Arrays.asList("A","B","C","1","2","3");
		//optinal<String> reduce_meth = stringList_reduce.stream().reduce(value,c_value) -> {return c_value+value;});
		//System.out.println(reduce_meth.get())
		
		Object arr[] = stringList_reduce.stream().toArray();
		System.out.println(arr.length);
		for(Object n:arr)
		{
			System.out.println(n);
		}	

	}

}
