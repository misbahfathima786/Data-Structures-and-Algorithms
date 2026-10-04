import java.util.*;

public class Main { 
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter the size of an array : ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      int sum = n * (n+1) / 2;
      int arraySum = 0;
      System.out.println("Enter array elements.");
      for(int i=0; i<n-1; i++) {
        arr[i] = sc.nextInt();
      }

      for(int i=0; i<n-1; i++) {
        arraySum += arr[i];
      }

      int missingNumber = sum - arraySum;
      System.out.println(missingNumber);
    }
}
