package InterviewQestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//String str = "Acharaya"; Find The Occurrence 
public class TCS {
	
	public static void findOccurrence(String inputString) {
		
		Map<Character, Long> occurenceMap = inputString.chars()
										.mapToObj(e -> (char) e)
										.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		occurenceMap.forEach((ch , num)  -> 
		System.out.println("Charcter : " + ch +" : " + "Number : "+num )
				);
		
	}
	
	public static void main(String[] args) {
		String str = "Acharaya";
		findOccurrence(str);
	}

}
