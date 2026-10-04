import java.util.*;

public class Main {
    public static int sumOfDigits(int n) {
      if(n == 0) {
        return 0;
      }
      int rem = n % 10;
      return rem + sumOfDigits(n/10);
    }
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      int sum = sumOfDigits(n);
      System.out.println("Sum of Digits = "+sum);
    }
}
