package RegexDemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("welcome to user registration");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstName=scanner.next();
		System.out.println(Pattern.matches("[A-Z]{1}[a-z]{2,}",firstName));

	}

}
