import java.util.*;

public class Main {   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      int[] a = {1,3,5,7,9};
      int[] b = {2,4,6,8,10};
      int i = 0 , j = 0 , k = 0; 
      int n = a.length , m = b.length;
      int[] merged = new int[n+m];
      

      while(i<n && j<m) {
        if(a[i] <= b[j]) {
          merged[k] = a[i];
          k++;
          i++;
        }
        else {
          merged[k] = b[j];
          k++;
          j++;
        }
      }

      while(i<n) {
        merged[k] = a[i];
        i++;
        k++;
      }

      while(j<m) {
        merged[k] = b[j];
        j++;
        k++;
      }

      for(int idx=0; idx<k; idx++) {
        System.out.print(merged[idx]+" ");
      }
      
    }
}
