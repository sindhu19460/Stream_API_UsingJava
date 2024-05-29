package StreamFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlastMapDemo2 {

	public static void main(String[] args) {
		List<String> teamA = Arrays.asList("Scott","David","John");
		List<String> teamB = Arrays.asList("Marry","Romeo","Cat");
		List<String> teamC = Arrays.asList("Tom","Jerry","DOg");
		
		List<List<String>> PlayersInWorldCup = new ArrayList<List<String>>();
		 PlayersInWorldCup.add(teamA);
		 PlayersInWorldCup.add(teamB);
		 PlayersInWorldCup.add(teamC);
		 
//		 for(List<String> team:PlayersInWorldCup)
//		 {
//			 for(String name: team)
//			 {
//				 System.out.println(name);
//			 }
//			 
//		 }
		 
		 List<String> names = PlayersInWorldCup.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
		 System.out.println(names);
	}

}