package InterviewQestions;

import java.util.Arrays;

/*
 String original = "Hello, World!";
output : -  String: !dlroW ,olleH

 */
public class Accenture2 {

	public static String reverseString(String input) {
		
		String result = Arrays.stream(input.split("")).reduce(" ", (a , b) -> b+a);
		
		return result;
	}
	public static void main(String[] args) {
		String original = "Hello, World!";
		
		System.out.println("Original String : " +original);
		
		System.out.println("Reverse OF String : "+	reverseString(original));
	}
}
