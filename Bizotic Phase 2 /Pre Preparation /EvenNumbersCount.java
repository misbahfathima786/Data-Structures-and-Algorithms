import java.util.*;

public class EvenCount {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of an array : ");
      int size = sc.nextInt(); 
      int[] arr = new int[size];
      int count = 0;
      System.out.println("Enter the array elements...");
      for(int i=0; i<size; i++) {
        arr[i] = sc.nextInt();
      }

      for(int i=0; i<size; i++) {
        if(arr[i] % 2 == 0) {
          count++;
        }
      }

      System.out.println("Even Numbers Count : "+count);
    }
}
