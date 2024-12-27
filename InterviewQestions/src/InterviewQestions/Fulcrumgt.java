package InterviewQestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//	Find the duplicate element and its occurrence in a given string using streams

public class Fulcrumgt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="Ajay Malewar";

	Map<Character, Long> occourance = name.chars().mapToObj(e -> (char) e)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	occourance.forEach((character , count) ->
			System.out.println(character + " : " + count)
			);

	}

}
