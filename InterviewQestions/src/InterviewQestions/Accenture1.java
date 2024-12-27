package InterviewQestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Accenture1 {
	public static boolean findTheMatch(int input[]) {
		
		int [] firstTwo = Arrays.copyOfRange(input, 0, 2);
		int [] lastTwo  = Arrays.copyOfRange(input, input.length-2, input.length);
		
		if (Arrays.equals(firstTwo, lastTwo)) {
		
			return true;
		} 
		return false;
		
	}

	public static void main(String[] args) {
		int[] arr = {5, 6, 22, 4, 5, 6};


		System.out.println(findTheMatch(arr));

	}

}
