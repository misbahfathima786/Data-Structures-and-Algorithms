/*
Problem 7:Quick Sort (Decreasing order).
Platform:Online Compiler.

Complexity Analysis
1.Time complexity = O(Nlog(n))
2.Space complexity = O(1)

*/

public class Main {
    public static int partition(int arr[], int low , int high) {
      int i = low , j = high;
      int pivot = low;
      while(i<j) {
        while(arr[i]>=arr[pivot] && i<=high) {
          i++;
        }
        while(arr[j]<=arr[pivot] && j>=low) {
          j--;
        }
        if(i<j) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      int temp = arr[low];
      arr[low] = arr[j];
      arr[j] = temp;

      return j;
    }
    public static void quickSort(int [] arr , int low , int high) {
      int i = low , j = high;
      if(i<j) {
        int pivot = partition(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
      }
    }
    public static void main(String[] args) {
      int [] arr = {2,4,5,1,6,8,3,9};
      quickSort(arr,0,arr.length- 1);
      for(int i=0; i< arr.length; i++) {
        System.out.print(arr[i]+" ");
      }
    }
}


/*
Problem 7:Quick Sort (Increasing order).
Platform:Online Compiler.

Complexity Analysis
1.Time complexity = O(Nlog(n))
2.Space complexity = O(1)

*/
public class Main {
    public static int partition(int arr[], int low, int high) {
      int i = low;
      int j = high;
      int pivot = arr[low];

      while (i < j) {

          while (i <= high && arr[i] <= pivot) {
              i++;
          }

          while (j >= low && arr[j] > pivot) {
              j--;
          }

          if (i < j) {
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
          }
      }

      int temp = arr[low];
      arr[low] = arr[j];
      arr[j] = temp;

      return j;
    }
    public static void quickSort(int [] arr , int low , int high) {
      if(low<high) {
        int pivot = partition(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
      }
    }
    public static void main(String[] args) {
      int [] arr = {2,4,5,1,6,8,3,9};
      quickSort(arr,0,arr.length- 1);
      for(int i=0; i< arr.length; i++) {
        System.out.print(arr[i]+" ");
      }
    }
}
