import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a String : ");
      String str = sc.nextLine(); 
      boolean isPalindrome = true;
      int left = 0;
      int right = str.length() - 1;

      while(left < right) {
        if(str.charAt(left) != str.charAt(right)) {
          isPalindrome = false;
        }
        left++;
        right--;
      }
      
      if(isPalindrome) {
        System.out.println("Given String is Palindrome..");
      }

      else {
        System.out.println("Given String is Palindrome..");
      }
      
      sc.close();
    }
}
