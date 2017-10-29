import java.util.Scanner;

public class ReplaceVowel {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduceti cuvantul");
		String word = s.nextLine();
		System.out.println("Cuvantul rezultat este " + replaceVowel(word.toLowerCase()));
	}
	public static boolean checkVowel(char c) {
		c = Character.toLowerCase(c);
		return ("aeiou".indexOf(c) >= 0);
	}
	public static String replaceVowel(String word) {
		StringBuffer sb = new StringBuffer(word);
		for(int i = 0; i < sb.length(); i++)
		{
			if(checkVowel(sb.charAt(i))) {
				sb.setCharAt(i, (char)(sb.charAt(i) + 1));
			}
		}
		return sb.toString();
	}
}
