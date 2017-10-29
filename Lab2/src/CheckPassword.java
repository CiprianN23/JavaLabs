import java.util.*;

public class CheckPassword {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String password = "java";
		String userInput ;
		System.out.println("Care este parola?");
		userInput = s.next();
		
		System.out.println("Ai tastat ");
		System.out.println("userInput");
		System.out.println("Dar parola este ");
		System.out.println("password");
		
		if(password.equals(userInput)) {
			System.out.println("Ai trecut mai departe");
		}
		else {
			System.out.println("Nu ai trecut mai departe");
		}
	}
}
