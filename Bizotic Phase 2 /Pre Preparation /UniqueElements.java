import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a size of an array : ");
      int size = sc.nextInt();
      int[] arr = new int[size];
      int count = 1;
    
      System.out.println("Enter array elements");
      for(int i=0; i<size; i++) {
        arr[i] = sc.nextInt();
      }

      for(int i=1; i<size; i++) {
        if(arr[i-1] != arr[i]) {
          count++;
        }
      }

      System.out.println("Unique Elements Count = "+count);
      sc.close();
    }
}
