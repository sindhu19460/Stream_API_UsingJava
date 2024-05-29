package StreamFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstMap {

	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("bus","car","bike","auto","bicycle","train","scotty","flight");
		
		List<String> UpperCaseVehicles = new ArrayList<String>();
		
		//Before java 8
	/*	
		for(String name: vehicles)
		{
			UpperCaseVehicles.add(name.toUpperCase());
		}
		
		System.out.println(UpperCaseVehicles); */
		
		//Copy to another list
		
		UpperCaseVehicles = vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(UpperCaseVehicles);
		
		//using stream
		
		vehicles.stream().map(name->name.toUpperCase()).forEach(System.out::println);
	}

}
