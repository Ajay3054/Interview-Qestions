package InterviewQestions;

//find last unique character
public class Mothersons {
	private static char findLastUniqueCharacter(String str) {
      return str.chars() // Convert string to IntStream
              .mapToObj(c -> (char) c) // Convert IntStream to Stream<Character>
              .filter(c -> str.indexOf(c) == str.lastIndexOf(c)) // Filter unique characters
              .reduce((first, second) -> second) // Get the last unique character
              .orElse('\0'); // Return null character if none found
  }

	public static void main(String[] args) {
		String string = "hello world";
		
		 char lastUniqueChar = findLastUniqueCharacter(string);
		System.out.println("Last unique character: " + lastUniqueChar);
	}
	
}