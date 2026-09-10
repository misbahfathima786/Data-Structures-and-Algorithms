/*
Problem 7: Check for Prime.
Platform: Online Compiler.

Complexity Analysis
● Time Complexity: O(√n)
● Space Complexity: O(1)
*/

class PrimeChecker {
    // Function to check if a given number is prime
    public boolean checkPrime(int n) {
        int cnt = 0;  // Initialize a counter variable to count the number of factors

        // Loop through numbers from 1 to the square root of n
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt++;  // If n is divisible by i, increment the counter

                // If n is not a perfect square, count its reciprocal factor
                if (n / i != i) {
                    cnt++;
                }
            }
        }

        // If the number of factors is exactly 2 (1 and the number itself), it's prime
        return cnt == 2;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 1483;  // Example number
        PrimeChecker obj = new PrimeChecker();
        boolean isPrime = obj.checkPrime(n);  // Function call to check if the number is prime

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
