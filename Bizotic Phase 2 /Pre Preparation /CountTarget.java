import java.util.*;

public class Main {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter a size of an array : ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.print("Enter a target value : ");
      int target = sc.nextInt();
      int count = 0;

      System.out.println("Enter the array elements.");
      for(int i=0; i<n; i++) {
        arr[i] = sc.nextInt();
      }

      for(int i=0; i<n; i++) {
        if(arr[i] == target) {
          count++;
        }
      }
      
      System.out.println("Target appears "+count+" times.");
    }
}
