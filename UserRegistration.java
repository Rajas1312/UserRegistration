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
	public void checkEmailId() {
		System.out.println("Enter the Email ID");
		boolean email=Pattern.matches("^[a-zA-Z]{3}[0-9a-zA-Z\\.\\_\\-]*\\@[a-z]*\\.(com|co|in|co.in|com.au|net)$",scanner.next());
		if(email==true) {
			System.out.println("valid Email ID");
		}
		else {
			System.out.println("invalid Email ID");
		}
		
	}
	public void checkMobileNumber() {
		System.out.println("Enter the Mobile number");
		boolean mobile=Pattern.matches("^(\\+91)?[6-9]{1}[0-9]{9}$",scanner.next());
		if(mobile==true) {
			System.out.println("valid mobile number");
		}
		else {
			System.out.println("invalid mobile number");
		}
		
	}
	public void checkPassword() {
		System.out.println("Enter the Password");
		boolean mobile=Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9\\W]{8,}$",scanner.next());
		if(mobile==true) {
			System.out.println("valid password");
		}
		else {
			System.out.println("invalid password");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("welcome to user registration");
		
		UserRegistration userRegistration=new UserRegistration();
//		userRegistration.checkFirstName();
//		userRegistration.checkLastName();
//		userRegistration.checkEmailId();
//		userRegistration.checkMobileNumber();
		userRegistration.checkPassword();


	}

}
