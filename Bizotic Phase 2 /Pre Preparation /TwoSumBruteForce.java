import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a size of an array : ");
      int size = sc.nextInt();
      int[] arr = new int[size];
      int[] res = new int[2];
      System.out.println("Enter array elements");
      for(int i=0; i<size; i++) {
        arr[i] = sc.nextInt();
      }

      System.out.print("Enter  target value : ");
      int target = sc.nextInt();

      for(int i=0; i<size-1; i++) {
        for(int j=i; j<size; j++) {
          if(arr[i] + arr[j] == target) {
            res[0] = i;
            res[1] = j;
            break;
          }
        }
      }
      System.out.println("["+ res[0] +" , "+res[1]+"]");
      sc.close();
    }
}
