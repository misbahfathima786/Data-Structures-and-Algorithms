/*
Problem 5: Armstrong Numbers.
Platform: Online Compiler.

Complexity Analysis
● Time Complexity: O(log₁₀ n)
● Space Complexity: O(1)
*/

public class ArmstrongChecker {

    // Static method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int k = String.valueOf(num).length(); // Get number of digits
        int sum = 0;
        int n = num;

        while (n > 0) {
            int ld = n % 10;             // Last digit
            sum += Math.pow(ld, k);      // Add ld^k
            n /= 10;                     // Remove digit
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int number = 153;

        // Use class method to check
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
