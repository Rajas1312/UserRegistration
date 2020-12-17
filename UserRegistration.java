package RegexDemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	Scanner scanner=new Scanner(System.in);

	public void checkFirstName() {
		System.out.println("Enter the first name");
		boolean firstName=Pattern.matches("[A-Z]{1}[a-z]{2,}",scanner.next());
		if(firstName==true) {
			System.out.println("valid firstname");
		}
		else {
			System.out.println("invalid firstname");
		}
	}
	public void checkLastName() {
		System.out.println("Enter the last name");
		boolean lastName=Pattern.matches("[A-Z]{1}[a-z]{2,}",scanner.next());
		if(lastName==true) {
			System.out.println("valid lastname");
		}
		else {
			System.out.println("invalid lastname");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("welcome to user registration");
		
		UserRegistration userRegistration=new UserRegistration();
		userRegistration.checkFirstName();
		userRegistration.checkLastName();

	}

}
