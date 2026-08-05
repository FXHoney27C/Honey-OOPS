
        package javacalculator;
  
	import java.util.Scanner;

	public class dowhile{
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        char choice;

	        System.out.println("===== Simple Java Calculator =====");

	        do {
	            // Input numbers
	            System.out.print("Enter first number: ");
	            double num1 = sc.nextDouble();

	            System.out.print("Enter second number: ");
	            double num2 = sc.nextDouble();

	            // Input operator
	            System.out.print("Enter operator (+, -, *, /): ");
	            char operator = sc.next().charAt(0);

	            double result;

	            switch (operator) {
	                case '+':
	                    result = num1 + num2;
	                    System.out.println("Result = " + result);
	                    break;

	                case '-':
	                    result = num1 - num2;
	                    System.out.println("Result = " + result);
	                    break;

	                case '*':
	                    result = num1 * num2;
	                    System.out.println("Result = " + result);
	                    break;

	                case '/':
	                    if (num2 != 0) {
	                        result = num1 / num2;
	                        System.out.println("Result = " + result);
	                    } else {
	                        System.out.println("Error: Division by zero is not allowed.");
	                    }
	                    break;

	                default:
	                    System.out.println("Invalid operator!");
	            }

	            // Ask user if they want to continue
	            System.out.print("\nDo you want to perform another calculation? (Y/N): ");
	            choice = sc.next().charAt(0);

	        } while (choice == 'Y' || choice == 'y');

	        System.out.println("Thank you for using the calculator!");
	        sc.close();
	    }
	}

