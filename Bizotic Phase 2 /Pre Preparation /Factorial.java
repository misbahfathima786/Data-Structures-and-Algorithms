import java.util.*;

public class Main {
    public static int fact(int n) {
      if(n == 0) {
        return 1;
      }
      return n * fact(n-1);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      if(n < 0) {
        System.out.println("N must be a positive number!");
        return;
      }
      int factorial = fact(n);
      System.out.println("Factorial of a number = "+factorial);
    }
}
