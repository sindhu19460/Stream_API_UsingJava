package StreamFilter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedAnyMatchAllMatchNoneMatch {
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,9);
		List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println("-----------------------------");
		
		
		List<Integer> reverssorted = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverssorted);
		System.out.println("-----------------------------");

		
		//String
		List<String> vehicleList =  Arrays.asList("bus","car","bycle","bus","car","car","bike","bycle");
		List<String> StrsortedList = vehicleList.stream().sorted().collect(Collectors.toList());
		System.out.println(StrsortedList);
		System.out.println("-----------------------------");
		List<String> strreverssorted = vehicleList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(strreverssorted);
		System.out.println("-----------------------------");
	

	}

}
