import java.util.*;

public class Main {   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter a size of an array : ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      int j = 0;

      System.out.println("Enter array elements.");
      for(int i=0; i<n; i++) {
        arr[i] = sc.nextInt();
      }

      for(int i=0; i<n; i++) {
        if(arr[i] != 0) {
          arr[j] = arr[i];
          j++;
        }
      }

      while(j < n) {
        arr[j] = 0;
        j++;
      }
      
      System.out.println("Array after moving zeros to end");
      for(int i=0; i<n; i++) {
        System.out.print(arr[i] + " ");
      }

    }
}
