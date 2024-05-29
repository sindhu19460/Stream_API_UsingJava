package StreamFilter;

import java.net.FileNameMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class AnyMatchAllMatcgNoneMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fruits = new HashSet<String>();
		
		fruits.add("one apple");
		fruits.add("one manago");
		fruits.add("two apples");
		fruits.add("more grapes");
		fruits.add("two guavas");
		
		boolean result = fruits.stream().anyMatch(value -> {return value.startsWith("one");});
		System.out.println(result);
		System.out.println("--------------------------");
		boolean result1 = fruits.stream().allMatch(value -> {return value.startsWith("one");});
		System.out.println(result1);
		System.out.println("--------------------------");
		boolean result2 = fruits.stream().noneMatch(value -> {return value.startsWith("one");});
		System.out.println(result2);
		System.out.println("--------------------------");
		
		List<String>FindAny_list  = Arrays.asList("one","two","three","one");
		Optional<String> ele = FindAny_list.stream().findAny();
		System.out.println(ele.get());
		
		System.out.println("--------------------------");
		
		List<String>Findfirst_list  = Arrays.asList("one","two","three","one");
		Optional<String> ele1 = Findfirst_list.stream().findFirst();
		System.out.println(ele1.get());
		
		System.out.println("--------------------------");
		
		List<String> animal = Arrays.asList("Dog","cat","elep");
		List<String> bridlist = Arrays.asList("peackok","parrot","crow");
		Stream <String> stream1 = animal.stream();
		Stream <String> stream2 = bridlist.stream();
		
		Stream<String> finallist = Stream.concat(stream1, stream2);
		System.out.println(finallist);
	
		
	}

}
