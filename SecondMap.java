package StreamFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondMap {

	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("bus","car","bike","auto","bicycle","train","scotty","flight");
		
		//List<Integer> lenOfChar = new ArrayList<Integer>();
		
		for(String n:vehicles)
		{
			System.out.println(n.length());
			
		}
		
		System.out.println("--------------------------------");
		
		vehicles.stream().map(vname->vname.length()).forEach(len->System.out.println(len));
		
		
		System.out.println("--------------------------------");
		
		vehicles.stream().map(v->v.length()).forEach(System.out::println);
	}

}
