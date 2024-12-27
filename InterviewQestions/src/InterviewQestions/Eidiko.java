package InterviewQestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//find the number starts from '1'

public class Eidiko {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 10, 11, 2, 56, 21);
		
	List<Integer> resultList = 	list.stream().filter(e -> String.valueOf(e).startsWith("1"))
		.collect(Collectors.toList());
	
	System.out.println("Numbers Which are starts from '1' " + resultList );

	}
}
