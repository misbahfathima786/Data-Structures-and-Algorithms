import java.util.*;

public class Maximum {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of an array : ");
      int size = sc.nextInt(); 
      int[] arr = new int[size];
      int max = Integer.MIN_VALUE;

      System.out.println("Enter the array elements...");
      for(int i=0; i<size; i++) {
        arr[i] = sc.nextInt();
      }

      for(int i=0; i<size; i++) {
        if(max < arr[i]) {
          max = arr[i];
        }
      }
      System.out.println("Maximum Element : "+max);
    }
}
