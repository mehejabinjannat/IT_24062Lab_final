
// Q4: Exception Handling

import java.util.*;

public class Q4Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("Program Execution Completed");
            sc.close();
        }
    }
}
