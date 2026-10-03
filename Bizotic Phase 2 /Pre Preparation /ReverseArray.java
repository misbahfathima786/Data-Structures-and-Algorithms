import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of an array : ");
      int size = sc.nextInt(); 
      int[] arr = new int[size];
      int left = 0;
      int right = size - 1;
      System.out.println("Enter the array elements...");
      for(int i=0; i<size; i++) {
        arr[i] = sc.nextInt();
      }

      System.out.println("Original Array..");
      for(int i=0; i<size; i++) {
        System.out.print(arr[i] + " ");
      }
      while(left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }

      System.out.println();
      System.out.println("Reversed Array..");
      for(int i=0; i<size; i++) {
        System.out.print(arr[i] + " ");
      }
      
    }
}
