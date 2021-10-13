package day19Solproblem;
import java.util.Scanner;

public class MainDemo {

	    public static void main(String[] args) {
	        // write your code here
	        Student student = new Student();
	        RegexDemo methods = new RegexDemo();
	     //   Implementation implementation = new Implementation();

	        Scanner scanner = new Scanner(System.in);
	     //   student.setFirstName(scanner.nextLine());
	     //   implementation.info(student,methods);
	        System.out.println(" 1.About First Name \n 2.About Last Name \n " +
	                "3.About Email \n 4.About Phone no \n 5.Password");
	        int choice = scanner.nextInt();
	        switch (choice){
	            case 1:
	                student.setFirstName(scanner.next());
	                System.out.println("First Name is: "+student.getFirstName());
	                if(Regex.checkValidation(methods.FirstName,student.getFirstName())){
	                    System.out.println("Valid FirstName");
	                }
	                else
	                    System.out.println("Invalid FirstName");
	                break;
	            case 2:
	                student.setLastName(scanner.next());
	                System.out.println("Last Name is: "+student.getLastName());
	                if(Regex.checkValidation(methods.LastName,student.getLastName())){
	                    System.out.println("Valid LastName");
	                }
	                else
	                    System.out.println("Invalid LastName");
	                break;
	            case 3:
	                student.setEmail(scanner.next());
	                System.out.println("Email is: "+student.getEmail());
	                if(Regex.checkValidation(methods.Email,student.getEmail())){
	                    System.out.println("Valid Email");
	                }
	                else
	                    System.out.println("Invalid Email");
	                break;
	            case 4:
	                student.setPhoneno(scanner.nextLine());
	                System.out.println("Phone num is: "+student.getPhoneno());
	                if(Regex.checkValidation(methods.Phone,student.getPhoneno())){
	                    System.out.println("Valid Phone");
	                }
	                else
	                    System.out.println("Invalid Phone");
	                break;
	            case 5:
	                student.setPassword(scanner.next());
	                System.out.println("Password is: "+student.getPassword());
	                if(Regex.checkValidation(methods.Password,student.getPassword())){
	                    System.out.println("Valid Pass");
	                }
	                else
	                    System.out.println("Invalid Pass");
	                break;
	            default:
	                break;
	        }
	   //     System.out.println("choice is: "+choice);
	    }
	}
