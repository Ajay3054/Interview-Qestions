package InterviewQestions;

/*
Write a program to print the all combinations of the given string.
Example - ABC. Output - ABC,BCA,CAB,CBA,BAC,ACB
*/
public class Kludgin {
	public static void printCombinations(String input, String temp) {

		if (input.length() ==0) {
			System.out.println(temp);
		}else {
			for (int i = 0; i < input.length(); i++) {
				String result = input.substring(0, i) +input.substring(i+1);
				
				printCombinations(result, temp +input.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		
		String inputString = "ABC";
		
		printCombinations(inputString, "");
	}
}
