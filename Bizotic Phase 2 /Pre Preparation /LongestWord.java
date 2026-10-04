import java.util.*;

public class Main {   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter a sentence : ");
      String str = sc.nextLine();
      String[] arr = str.split("\\s+");
      String longestString = arr[0];
      for(int i=1; i<arr.length; i++) {
        if(arr[i].length() > longestString.length()) {
          longestString = arr[i];
        }
      }
      System.out.print(longestString);
    }
}
