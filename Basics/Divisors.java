/*
Problem 6: Print All Divisors
Platform: Online Compiler

Complexity Analysis
Time Complexity: O(sqrt(N)).
Space Complexity: O(2*sqrt(N)).
*/

import java.util.*;

class Divisors {
    // Function to find all divisors
    public List<Integer> getDivisors(int N) {
        // Create list to store divisors
        List<Integer> res = new ArrayList<>();

        // Loop from 1 to N
        for (int i = 1; i <= N; i++) {
            // Check if i is a divisor of N
            if (N % i == 0) {
                // Add i to the result
                res.add(i);
            }
        }
        // Return the list of divisors
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object of Solution class
        Divisors sol = new Divisors();
        //Scanner object for getting input from users.
        Scanner sc = new Scanner(System.in);
        // Input number
        int N = sc.nextInt();

        // Call the function to get divisors
        List<Integer> result = sol.getDivisors(N);

        // Print the result
        System.out.print("Divisors of " + N + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
        sc.close();
    }
}
