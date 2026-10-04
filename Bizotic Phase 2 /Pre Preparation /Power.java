import java.util.*;

public class Main { 
    public static int power(int base , int exp) {
      if(base == 1 || exp == 0) {
        return 1;
      }
      return base * power(base , exp - 1);
    }  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter base value : ");
      int base = sc.nextInt();
      System.out.print("Enter exponent value : ");
      int exp = sc.nextInt();

      int res = power(base , exp);
      System.out.println(res);
    }
}
