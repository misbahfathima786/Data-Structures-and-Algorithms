import java.util.*;

public class Main {
    public static int fib(int n) {
      if(n == 0) {
        return 0;
      }
      if(n == 1) {
        return 1;
      }
      return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      if(n < 0) {
        System.out.println("N must be a positive number!");
        return;
      }
      int fibonacci = fib(n);
      System.out.println("Nth fibonacci number = "+fibonacci);
    }
}
