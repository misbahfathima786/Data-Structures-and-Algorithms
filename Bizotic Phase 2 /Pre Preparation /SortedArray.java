import java.util.*;

public class Main {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter a size of an array : ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      boolean isSorted = true;

      System.out.println("Enter the array elements.");
      for(int i=0; i<n; i++) {
        arr[i] = sc.nextInt();
      }

      for(int i=1; i<n; i++) {
        if(arr[i-1] > arr[i]) {
          isSorted = false;
          break;
        }
      }
      if(isSorted) {
        System.out.println("Given array is sorted.");
      }
      else {
        System.out.println("Given array is not sorted.");
      }
    }
}
