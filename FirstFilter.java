package StreamFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstFilter {

	public static void main(String[] args) {
		///collection
//		ArrayList<Integer> NumberList = ArrayList<Integer>();
//		
//		NumberList.add(10);
//		NumberList.add(20);
		
		
		List <Integer> NewList = Arrays.asList(10,15,20,25,30,40);
		List <Integer> EvenNumber = new ArrayList<Integer>();
		
		/*for(int i:NewList)
		{
			if(i%2==0)
			{
				EvenNumber.add(i);
			}
		}
		
		System.out.println("EvenNumber "+ EvenNumber);*/
		
//		EvenNumber = NewList.stream().filter(n->n%2==0).collect(Collectors.toList());
//		System.out.println("EvenNumber "+ EvenNumber);
		
//		NewList.stream().filter(m->m%2==0).forEach(n-> System.out.println(n));
		NewList.stream().filter(m->m%2==0).forEach(System.out::println);
	}

}
