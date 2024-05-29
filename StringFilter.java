package StreamFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = Arrays.asList("Apple","Banana","Cataa","Cars","Dog");
		
		List<String> longname = new ArrayList<String>();
		
//		longname = name.stream().filter(str->str.length()>3&& str.length()<6).collect(Collectors.toList());
//		
//		System.out.println(longname);
		
		//name.stream().filter(str->str.length()>3 && str.length()<6).forEach(System.out::println);
		name.stream().filter(str->str.length()>3 && str.length()<6).forEach(n-> System.out.println(n));
	}

}
