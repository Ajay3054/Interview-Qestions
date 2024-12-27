package InterviewQestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//find occurrence duplicate number only
public class CtrlAtlFix {

	public static void main(String[] args) {
	List<Integer>	list = Arrays.asList(44,6,3,6,7,8,3,44,6,7);
			
		 Map<Integer , Long> occurrences = list.stream().collect(Collectors.groupingBy(n -> n,Collectors.counting()));
		 occurrences.entrySet().stream()
					   .filter(entry -> entry.getValue() >1)
					   .forEach(entry -> 
					   	System.out.println("Number : " +entry.getKey()+ " Occurrences : "+entry.getValue()));
	}

}
