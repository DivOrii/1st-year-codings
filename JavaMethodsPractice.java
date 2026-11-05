import java.util.Scanner;

public class JavaMethodsPractice {

    // 1. VOID METHOD
    // A void method performs an action but does not return a value.
    static void greetUser() {
        System.out.println("Hello! Welcome to Java Methods Practice!");
    }

    // 2. ADDITION
    // int means this method returns a whole number.
    static int add(int moew1, int moew2) {
        return moew1 + moew2;
    }

    // 3. BASIC ARITHMETIC OPERATIONS
    static int subtract(int moew1, int moew2) {
        return moew1 - moew2;
    }

    static int multiply(int moew1, int moew2) {
        return moew1 * moew2;
    }

    // double allows decimal answers.
    static double divide(double moew1, double moew2) {
        if (moew2 == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }

        return moew1 / moew2;
    }

    // 4. EVEN OR ODD
    // boolean returns either true or false.
    static boolean isEven(int moew) {
        return moew % 2 == 0;
    }

    // 5. FACTORIAL USING A LOOP
    // Example: 5! = 5 * 4 * 3 * 2 * 1 = 120
    static long factorial(int moew) {
        if (moew < 0) {
            return -1; // Negative numbers do not have factorials.
        }

        long answer = 1;

        for (int i = 1; i <= moew; i++) {
            answer = answer * i;
        }

        return answer;
    }

    // 6. SUM OF ARRAY
    static int sumArray(int[] moew) {
        int sum = 0;

        for (int i = 0; i < moew.length; i++) {
            sum = sum + moew[i];
        }

        return sum;
    }

    // 7. FIND THE LARGEST NUMBER IN AN ARRAY
    static int maxInArray(int[] moew) {
        int largest = moew[0];

        for (int i = 1; i < moew.length; i++) {
            if (moew[i] > largest) {
                largest = moew[i];
            }
        }

        return largest;
    }

    // 8. CHECK IF A NUMBER IS PRIME
    static boolean isPrime(int moew) {
        if (moew <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(moew); i++) {
            if (moew % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 9. GREATEST COMMON DIVISOR (GCD)
    static int gcd(int moew1, int moew2) {
        moew1 = Math.abs(moew1);
        moew2 = Math.abs(moew2);

        while (moew2 != 0) {
            int remainder = moew1 % moew2;
            moew1 = moew2;
            moew2 = remainder;
        }

        return moew1;
    }

    // 10. LEAST COMMON MULTIPLE (LCM)
    static int lcm(int moew1, int moew2) {
        if (moew1 == 0 || moew2 == 0) {
            return 0;
        }

        return Math.abs((moew1 / gcd(moew1, moew2)) * moew2);
    }

    // 11. RECURSIVE FACTORIAL
    // Recursion means a method calls itself.
    static long recursiveFactorial(int moew) {
        if (moew < 0) {
            return -1;
        }

        if (moew == 0 || moew == 1) {
            return 1; // Base case: stops the recursion.
        }

        return moew * recursiveFactorial(moew - 1);
    }

    // 12. FIBONACCI USING RECURSION
    // Sequence: 0, 1, 1, 2, 3, 5, 8, 13...
    static int fibonacci(int moew) {
        if (moew < 0) {
            return -1;
        }

        if (moew == 0) {
            return 0;
        }

        if (moew == 1) {
            return 1;
        }

        return fibonacci(moew - 1) + fibonacci(moew - 2);
    }

    // 13. PALINDROME CHECKER
    // A palindrome reads the same forward and backward.
    static boolean isPalindrome(String moew) {
        moew = moew.toLowerCase();

        int left = 0;
        int right = moew.length() - 1;

        while (left < right) {
            if (moew.charAt(left) != moew.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // 14. SQUARE A NUMBER
    static int square(int moew) {
        return moew * moew;
    }

    // 15. CHECK IF A NUMBER IS POSITIVE
    static boolean isPositive(int moew) {
        return moew > 0;
    }

    // 16. COUNT THE ELEMENTS IN AN ARRAY
    static int countElements(int[] moew) {
        return moew.length;
    }

    // 17. FIND THE SMALLEST NUMBER IN AN ARRAY
    static int minInArray(int[] moew) {
        int smallest = moew[0];

        for (int i = 1; i < moew.length; i++) {
            if (moew[i] < smallest) {
                smallest = moew[i];
            }
        }

        return smallest;
    }

    // 18. COUNT EVEN NUMBERS IN AN ARRAY
    static int countEven(int[] moew) {
        int count = 0;

        for (int i = 0; i < moew.length; i++) {
            if (moew[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sample array used for the array methods.
        int[] moew = {6, 7, 9, 3, 5};

        System.out.println("===== JAVA METHODS PRACTICE =====");

        // 1. VOID METHOD
        System.out.println("\n1. GREETING");
        greetUser();

        // 2. ADDITION
        System.out.println("\n2. ADDITION");
        System.out.println("Add 10 + 5 = " + add(10, 5));

        // 3. ARITHMETIC OPERATIONS
        System.out.println("\n3. ARITHMETIC OPERATIONS");
        System.out.println("Subtract 10 - 5 = " + subtract(10, 5));
        System.out.println("Multiply 10 * 5 = " + multiply(10, 5));
        System.out.println("Divide 10 / 5 = " + divide(10, 5));

        // 4. EVEN OR ODD
        System.out.println("\n4. EVEN OR ODD");
        System.out.println("Is 8 even? " + isEven(8));
        System.out.println("Is 7 even? " + isEven(7));

        // 5. FACTORIAL
        System.out.println("\n5. FACTORIAL");
        System.out.println("5! = " + factorial(5));

        // 6. SUM OF ARRAY
        System.out.println("\n6. SUM OF ARRAY");
        System.out.println("Array sum = " + sumArray(moew));

        // 7. LARGEST NUMBER
        System.out.println("\n7. LARGEST NUMBER");
        System.out.println("Largest number = " + maxInArray(moew));

        // 8. PRIME NUMBER
        System.out.println("\n8. PRIME NUMBER");
        System.out.println("Is 7 prime? " + isPrime(7));

        // 9. GCD
        System.out.println("\n9. GCD");
        System.out.println("GCD of 12 and 18 = " + gcd(12, 18));

        // 10. LCM
        System.out.println("\n10. LCM");
        System.out.println("LCM of 12 and 18 = " + lcm(12, 18));

        // 11. RECURSIVE FACTORIAL
        System.out.println("\n11. RECURSIVE FACTORIAL");
        System.out.println("Recursive 5! = " + recursiveFactorial(5));

        // 12. FIBONACCI
        System.out.println("\n12. FIBONACCI");
        System.out.println("Fibonacci position 7 = " + fibonacci(7));

        // 13. PALINDROME
        System.out.println("\n13. PALINDROME");
        System.out.println("Is 'level' a palindrome? " + isPalindrome("level"));

        // 14. SQUARE
        System.out.println("\n14. SQUARE");
        System.out.println("Square of 4 = " + square(4));

        // 15. POSITIVE NUMBER
        System.out.println("\n15. POSITIVE NUMBER");
        System.out.println("Is 5 positive? " + isPositive(5));

        // 16. COUNT ARRAY ELEMENTS
        System.out.println("\n16. COUNT ARRAY ELEMENTS");
        System.out.println("Number of elements = " + countElements(moew));

        // 17. SMALLEST NUMBER
        System.out.println("\n17. SMALLEST NUMBER");
        System.out.println("Smallest number = " + minInArray(moew));

        // 18. COUNT EVEN NUMBERS
        System.out.println("\n18. COUNT EVEN NUMBERS");
        System.out.println("Even numbers in array = " + countEven(moew));

        // OPTIONAL: Let yourself test a method using keyboard input.
        System.out.println("\n===== YOUR OWN TEST =====");
        System.out.print("Enter a whole number to check if it is even: ");

        while (!input.hasNextInt()) {
            System.out.print("Please enter a valid whole number: ");
            input.next();
        }

        int userNumber = input.nextInt();

        if (isEven(userNumber)) {
            System.out.println(userNumber + " is even.");
        } else {
            System.out.println(userNumber + " is odd.");
        }

        System.out.println("\n===== END OF PRACTICE =====");

        input.close();
    }
}
