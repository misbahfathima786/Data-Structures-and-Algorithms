import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a size of an array : ");
      int size = sc.nextInt();
      int[] arr = new int[size];

      int max = Integer.MIN_VALUE;
      int secMax = Integer.MIN_VALUE;;
      
      System.out.println("Enter array elements.");
      for(int i=0; i<size; i++) {
        arr[i] = sc.nextInt();
      }

      for(int i=0; i<size; i++) {
        if(arr[i] > max) {
          secMax = max;
          max = arr[i];
        }

        if(arr[i] < max && arr[i] > secMax) {
          secMax = arr[i];
        }
      }
      System.out.println("Second Maximum : "+secMax);
      sc.close();
    }
}
