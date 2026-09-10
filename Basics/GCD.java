/*
Problem 4: GCD or HCF
Platform: Online Compiler

Complexity Analysis
● Time Complexity: O(log min(a, b))
● Space Complexity: O(log min(a, b)) -> when you have used recursion, if you are using while loop then O(1).

*/


import java.util.Scanner;
class GCD {
    public static int gcd(int a,int b) {
        int result;
        if(b==0) {
            return a;
        }
        else {
            return gcd(b,a%b); // recursive call 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = gcd(a,b);
        System.out.println("GCD("+a+", "+b +") = "+result);
        sc.close();
    }
}
