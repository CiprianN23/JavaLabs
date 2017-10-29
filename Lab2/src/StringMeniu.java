import java.util.Scanner;
import java.util.regex.*;

public class StringMeniu {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String userInput;
		System.out.println("Introduceti un sir de caractere");
		userInput = s.next();
		
		System.out.println("1.Lungimea sirului de caractere");
		System.out.println("2.Ultima pozitie a caracterului 'a'");
		System.out.println("3.Numarul de aparati a secventei 'abc'");
		System.out.println("4.Sirul este palindrom?");
		System.out.println("5.Stergerea caracterelor de pe pozitiile pare");
		
		String alegere = s.next();
		switch(alegere)
		{
		case "1":
			System.out.println("Lungimea sirului este: " + userInput.length());
			break;
		case "2":
			System.out.println("Ultima pozitie a lui 'a': " + userInput.lastIndexOf('a'));
			break;
		case "3":
			System.out.println("Numarul de apriti a sirului 'abc': " + countApariti(userInput, "abc"));
			break;
		case "4":
			System.out.println("Sirul de caractere este palindrom: " + isPalindrome(userInput));
			break;
		case "5":
			System.out.println("Sirul de caractere dupa stergerea caracterelor de pe poziti pare: " + deleteCharacterOnEvenPosition(userInput));
			
		}

		
	}
	public static int countApariti(String search, String searching) {
		Pattern p = Pattern.compile(searching);
		Matcher m = p.matcher(search);
		int count = 0;
		while (m.find())
		{
		    count +=1;
		}
		return count;
	}
	public static boolean isPalindrome(String str) {
	    return str.equals(new StringBuilder(str).reverse().toString());
	}
	public static String deleteCharacterOnEvenPosition(String input) {
		StringBuilder sb = new StringBuilder(input);
		for(int i = 0; i < sb.length(); i++) {
			if(i%2 == 0)
			{
				sb.deleteCharAt(i);
			}
		}
		return sb.toString();
	}
}
