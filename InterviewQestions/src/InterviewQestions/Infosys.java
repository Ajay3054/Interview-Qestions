package InterviewQestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//list =1,2,3,4,5; Even Odd Number
public class Infosys {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Map<String, List<Integer>> evenOdd = list.stream()
											.collect(Collectors.groupingBy(num -> num %2 == 0 ? "Even" : "Odd"));
		
		System.out.println("Even Numbers : " + evenOdd.get("Even"));
		System.out.println("Odd Numbers : " + evenOdd.get("Odd"));
	}

}
