import java.util.*;

public class Calculator {

    public static void operation(int a, int b) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter operation no.");
        switch (n) {

            case 1:
                System.out.println("Add = " + (a + b));
                break;

            case 2:
                System.out.println("Sub = " + (a - b));
                break;

            case 3:
                System.out.println("Mult = " + (a * b));
                break;

            case 4:
                System.out.println("Div = " + (a / b));
                break;

            case 5:
                System.out.println("Mod = " + (a % b));
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int a = sc.nextInt();

        System.out.print("Enter second value: ");
        int b = sc.nextInt();

        System.out.println("Select operation:");
        System.out.println("1. Add\n2. Sub\n3. Mul\n4. Div\n5. Mod");

        operation(a, b);
    }
}