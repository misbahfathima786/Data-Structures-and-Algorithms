/*
Problem 11:Union of Two Sorted Arrays.
Platform:Online compiler.

Complexity Analysis 
1.Time Complexity:O(n+m)
2.space Complexity:O(n+m)
*/

import java.util.*;

public class Main {

    public static void findUnion(int[] arr1, int[] arr2, int n, int m) {

        int i = 0, j = 0;
        ArrayList<Integer> union = new ArrayList<>();

        while (i < n && j < m) {

            if (arr1[i] == arr2[j]) {

                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) { // if duplicate is there , remove it , by comparing previous element present in union list.
                    union.add(arr1[i]);
                }

                i++;
                j++;
            }

            else if (arr1[i] < arr2[j]) {

                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }

                i++;
            }

            else {

                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }

                j++;
            }
        }

        // Remaining elements of arr1
        while (i < n) {

            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }

            i++;
        }

        // Remaining elements of arr2
        while (j < m) {

            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }

            j++;
        }

        System.out.println(union);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array : ");
        int n = sc.nextInt();

        System.out.print("Enter the size of second array : ");
        int m = sc.nextInt();

        System.out.print("Enter elements of first array : ");
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[m];

        System.out.print("Enter elements of second array : ");

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        findUnion(arr1, arr2, n, m);
    }
}
