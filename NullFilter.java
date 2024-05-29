package StreamFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NullFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = Arrays.asList("Apple",null,"Banana","Cataa","Cars","Dog"," ",null);
		
		List<String> result = name.stream().filter(m->m != null).collect(Collectors.toList());
		System.out.println(result);
	}

}
