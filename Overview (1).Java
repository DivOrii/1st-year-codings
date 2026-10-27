// This will serve as a short yet comprehensive (unta) overview that will help you recall certain methods, AND this will be an in-progress project that will be refurbished later on in the near future




// ========= To get started skeleton code ============= // 

public class Main {
    public static void main(String[] args) {
        // Your code goes here
    }
}

// Sidenote: If you are coding in netbeans, and have started over on a blank page dont forget to state the package at the very top if not done so already, for example: 

package NAMESAIMONGFILE

public class Main {
    public static void main(String[] args) {
        // Your code goes here
    }
}

// ================================================== // 





// ========= Important Imports To Remember ====================== // 

import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

/*
 * NOTES:
 * - Everything is contained in this single file.
 * - Methods are static so they can be called directly from main.
 * - The main method demonstrates basic usage. 
 *   
 *
 * 
 *     
 *
 * IMPORTANT:
 * - Use int for ordinary whole numbers.
 * - Use long when values may become larger than int.
 * - Use double for decimal calculations.
 * - Use BigInteger when integer values can become extremely large.
 */



// ================================================================
    // 1. BASICS
    // ================================================================

    /*
     * SCANNER METHODS:
     * input.nextInt()    -> Reads an integer
     * input.nextDouble() -> Reads a decimal
     * input.next()       -> Reads a single word (up to space)
     * input.nextLine()   -> Reads the whole line (including spaces)
     *
     * Common issue:
     * After nextInt()/nextDouble(), nextLine() may read the leftover
     * newline character. Use input.nextLine() once to consume it.
     */

    /*
     * PRINTING TO CONSOLE:
     * System.out.println() -> Prints text and moves cursor to NEXT line
     * System.out.print()   -> Prints text and keeps cursor on SAME line
     * System.out.printf()  -> Formatted printing (e.g., %.2f for 2 decimal places)
     */

    /*
     * PRIMITIVE DATA TYPES (Most Common 4):
     * int     -> Whole numbers (-2 billion to +2 billion)
     * double  -> Decimal numbers (e.g., 3.14159)
     * boolean -> Logical flag (true or false only)
     * char    -> Single character in SINGLE quotes (e.g., 'A', '$', '9')
     *
     * Note: String uses DOUBLE quotes ("Hello") and is an Object, not primitive!
     */

    /*
     * TYPE CASTING (Converting Numbers):
     * Automatic (Widening):  int -> double | double x = 5;      // Stores 5.0
     * Manual (Narrowing):   double -> int  | int x = (int) 5.9; // Cuts off decimal -> 5 (NO rounding)
     */

    /*
     * STRING COMPARISON (Crucial Beginner Trap):
     * NEVER use '==' to compare String content (checks memory address, not text).
     * ALWAYS use .equals() or .equalsIgnoreCase()
     *
     * Example:
     * name.equals("Alice")           -> true if exact match
     * name.equalsIgnoreCase("alice") -> true regardless of upper/lowercase
     */

    /*
     * MODULO OPERATOR (%):
     * Gives the REMAINDER of division, not the result.
     * 7 % 3 = 1  (3 goes into 7 twice, remainder 1)
     * 8 % 2 = 0  (Even numbers ALWAYS give 0 when % 2)
     * 9 % 2 = 1  (Odd numbers ALWAYS give 1 when % 2)
     */

    /*
     * OPERATOR SHORTCUTS:
     * x++      -> x = x + 1 (Increment)
     * x--      -> x = x - 1 (Decrement)
     * x += 5   -> x = x + 5
     * x *= 2   -> x = x * 2
     */

    /*
     * LOGICAL OPERATORS:
     * && -> AND (Both conditions must be true)
     * || -> OR  (At least one condition must be true)
     * !  -> NOT (Flips true to false, false to true)
     */

    /*
     * LOOP SELECTION:
     * for loop      -> Best when you KNOW exact number of repetitions.
     * while loop    -> Best when repeating UNTIL a condition changes (0 or more times).
     * do-while loop -> Guaranteed to run AT LEAST ONCE before checking condition.
     */

    // ================================================================
    // 2. CONDITIONAL STATEMENTS
    // ================================================================

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static String checkSign(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static String getGrade(double grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    /*
     * Comparison operators:
     * ==   equal
     * !=   not equal
     * >    greater than
     * <    less than
     * >=   greater than or equal
     * <=   less than or equal
     *
     * Logical operators:
     * &&   AND
     * ||   OR
     * !    NOT
     */

    // ================================================================
    // 3. SWITCH
    // ================================================================

    public static String menuChoice(int choice) {
        switch (choice) {
            case 1:
                return "Addition";
            case 2:
                return "Subtraction";
            case 3:
                return "Multiplication";
            case 4:
                return "Division";
            default:
                return "Invalid choice";
        }
    }

    // ================================================================
    // 4. LOOPS
    // ================================================================

    /*
     * FOR LOOP
     * Use when you know how many times you want to repeat something.
     *
     * for (int i = 0; i < 10; i++) {
     *     System.out.println(i);
     * }
     */

    public static void forLoopDemo() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    /*
     * WHILE LOOP
     * Use when repetition depends on a condition.
     */

    public static void whileLoopDemo() {
        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }

    /*
     * DO-WHILE LOOP
     * Runs at least once before checking the condition.
     */

    public static void doWhileDemo() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }

    // ================================================================
    // 5. BASIC MATH
    // ================================================================

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        return a / b;
    }

    public static int remainder(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        return a % b;
    }

    /*
     * Useful Math methods:
     *
     * Math.abs(x)       absolute value
     * Math.max(a, b)    larger value
     * Math.min(a, b)    smaller value
     * Math.pow(a, b)    a raised to b
     * Math.sqrt(x)      square root
     * Math.round(x)     nearest whole number
     * Math.floor(x)     rounds down
     * Math.ceil(x)      rounds up
     */

    // ================================================================
    // 6. ARRAYS - BASIC
    // ================================================================

   

        // Method A: Declare size first, populate later (Filled with default values: 0)
        int[] scores = new int[5]; // Stores 5 integers (Indices 0 to 4)

        // Method B: Declare and initialize with exact hardcoded values
        int[] numbers = {10, 20, 30, 40, 50};

        // Method C: Alternative syntax (Less common, but valid)
        String[] fruits = new String[]{"Apple", "Banana", "Cherry"};


        // ====================================================================
        // SECTION 2: DEFAULT VALUES IN NEW ARRAYS
        // ====================================================================
        // When you create an empty array with 'new', Java auto-fills it with defaults:
        // - int / double / byte / short / long -> 0 or 0.0
        // - boolean                            -> false
        // - Objects (String, Scanner, etc.)    -> null

        int[] emptyInts = new int[3];       // [0, 0, 0]
        boolean[] emptyBools = new boolean[3]; // [false, false, false]
        String[] emptyStrings = new String[3]; // [null, null, null]

        System.out.println("Default int: " + emptyInts[0]);
        System.out.println("Default bool: " + emptyBools[0]);
        System.out.println("Default String: " + emptyStrings[0]);


        // ====================================================================
        // SECTION 3: ACCESSING & MODIFYING ELEMENTS
        // ====================================================================
        System.out.println("\n--- SECTION 3: ACCESS & MODIFY ---");

        // Getting array length (Total number of slots)
        int totalElements = numbers.length; // 5
        System.out.println("Array Length: " + totalElements);

        // Reading elements by index
        int firstElement = numbers[0];               // 10
        int lastElement  = numbers[numbers.length - 1]; // 50 (Index 4)

        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element:  " + lastElement);

        // Modifying an existing element
        numbers[2] = 99; // Changes 30 to 99
        System.out.println("Updated Index 2: " + numbers[2]);


        // ====================================================================
        // SECTION 4: LOOPS WITH ARRAYS
        // ====================================================================
        System.out.println("\n--- SECTION 4: LOOP EXAMPLES ---");

        // --------------------------------------------------------------------
        // 4.1 Standard FOR Loop (Best when index position 'i' is needed)
        // --------------------------------------------------------------------
        System.out.print("1. Standard For-Loop: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("[" + i + "]=" + numbers[i] + " ");
        }
        System.out.println();

        // --------------------------------------------------------------------
        // 4.2 Populating/Writing to an Array using a Loop
        // --------------------------------------------------------------------
        int[] multiplesOfTen = new int[5];
        for (int i = 0; i < multiplesOfTen.length; i++) {
            multiplesOfTen[i] = (i + 1) * 10; // Assigns 10, 20, 30, 40, 50
        }
        System.out.println("2. Populated Array: " + Arrays.toString(multiplesOfTen));

        // --------------------------------------------------------------------
        // 4.3 Enhanced FOR-EACH Loop (Simpler syntax, read-only iteration)
        // --------------------------------------------------------------------
        System.out.print("3. For-Each Loop: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // --------------------------------------------------------------------
        // 4.4 WHILE Loop with an Array
        // --------------------------------------------------------------------
        System.out.print("4. While Loop: ");
        int index = 0;
        while (index < fruits.length) {
            System.out.print(fruits[index] + " ");
            index++; // CRITICAL: Increment index to prevent infinite loop
        }
        System.out.println();


        // ====================================================================
        // SECTION 5: COMMON ARRAY OPERATIONS (PATTERNS)
        // ====================================================================
        System.out.println("\n--- SECTION 5: COMMON PATTERNS ---");

        int[] sampleData = {12, -5, 27, 8, -2, 19};

        // Pattern A: Summing all elements
        int sum = 0;
        for (int value : sampleData) {
            sum += value;
        }
        System.out.println("Sum of elements: " + sum);

        // Pattern B: Counting positive/negative elements
        int positiveCount = 0;
        int negativeCount = 0;
        for (int value : sampleData) {
            if (value > 0) {
                positiveCount++;
            } else if (value < 0) {
                negativeCount++;
            }
        }
        System.out.println("Positives: " + positiveCount + " | Negatives: " + negativeCount);

        // Pattern C: Finding Maximum value
        int max = sampleData[0]; // Start assuming index 0 is largest
        for (int i = 1; i < sampleData.length; i++) {
            if (sampleData[i] > max) {
                max = sampleData[i];
            }
        }
        System.out.println("Maximum Value: " + max);
    }
}

    // ================================================================
    // 7. 2D ARRAYS
    // ================================================================

    public static void print2DArray(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }

            System.out.println();
        }
    }

    public static int sum2DArray(int[][] matrix) {
        int sum = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }

        return sum;
    }

    // ================================================================
    // 8. ARRAY UTILITY METHODS
    // ================================================================

    public static int[] copyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    public static void fillArray(int[] array, int value) {
        Arrays.fill(array, value);
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }

    public static boolean arraysEqual(int[] first, int[] second) {
        return Arrays.equals(first, second);
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    // ================================================================
    // 9. STRING BASICS
    // ================================================================

    public static int countCharacters(String text, char target) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }

    public static String reverseString(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    public static boolean isPalindrome(String text) {
        String cleaned = text.toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // ================================================================
    // 10. NUMBER MANIPULATION
    // ================================================================

    public static int countDigits(int number) {
        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    public static int sumDigits(int number) {
        number = Math.abs(number);

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

    public static int reverseNumber(int number) {
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);

        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed * sign;
    }

    public static boolean isNumberPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        return number == reverseNumber(number);
    }

    // ================================================================
    // 11. FACTORIAL / COMBINATIONS / PERMUTATIONS
    // ================================================================

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative integers.");
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static long nPr(int n, int r) {
        if (n < 0 || r < 0 || r > n) {
            throw new IllegalArgumentException("Require n >= 0 and 0 <= r <= n.");
        }

        long result = 1;

        for (int i = 0; i < r; i++) {
            result *= (n - i);
        }

        return result;
    }

    public static long nCr(int n, int r) {
        if (n < 0 || r < 0 || r > n) {
            throw new IllegalArgumentException("Require n >= 0 and 0 <= r <= n.");
        }

        // Use the smaller side to reduce unnecessary multiplication.
        r = Math.min(r, n - r);

        long result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (n - r + i) / i;
        }

        return result;
    }

    // ================================================================
    // 12. PRIME NUMBERS
    // ================================================================

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /*
     * Why i * i <= number?
     *
     * If a number has a factor larger than its square root,
     * it must also have a factor smaller than its square root.
     * Therefore, once i * i > number, no new factor is necessary.
     *
     * Example:
     * 36 = 6 * 6
     * Once i reaches 7, checking larger divisors is unnecessary.
     */

    public static int[] primesUpTo(int limit) {
        if (limit < 2) {
            return new int[0];
        }

        boolean[] composite = new boolean[limit + 1];

        for (int i = 2; i * i <= limit; i++) {
            if (!composite[i]) {
                for (int multiple = i * i; multiple <= limit; multiple += i) {
                    composite[multiple] = true;
                }
            }
        }

        int count = 0;

        for (int i = 2; i <= limit; i++) {
            if (!composite[i]) {
                count++;
            }
        }

        int[] primes = new int[count];
        int index = 0;

        for (int i = 2; i <= limit; i++) {
            if (!composite[i]) {
                primes[index] = i;
                index++;
            }
        }

        return primes;
    }

    // ================================================================
    // 13. GCD / LCM
    // ================================================================

    public static int gcdSimple(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int gcd = 1;
        int limit = Math.min(a, b);

        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    public static long lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        return Math.abs((long) a / gcd(a, b) * b);
    }

    // ================================================================
    // 14. FACTORS / DIVISORS 
    // ================================================================

    // Counts ALL divisors by checking every number from 1 up to 'number'
    public static int countDivisors(int number) {
        // Return 0 for invalid inputs (0 or negative numbers) instead of throwing an exception
        if (number <= 0) {
            return 0;
        }

        int count = 0;

        // Simple loop checking every number from 1 to 'number'
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++; // Found a divisor
            }
        }

        return count;
    }

    // Sums all PROPER divisors (divisors strictly smaller than the number itself)
    public static int sumProperDivisors(int number) {
        // Guard check: numbers <= 1 have no positive proper divisors
        if (number <= 1) {
            return 0;
        }

        int sum = 0;

        // A proper divisor cannot be larger than half the number (number / 2)
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i; // Add factor directly
            }
        }

        return sum;
    }

    // Perfect number: sum of proper divisors EQUALS the number (e.g., 6 -> 1 + 2 + 3 = 6)
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        return sumProperDivisors(number) == number;
    }

    // Abundant number: sum of proper divisors is GREATER than the number (e.g., 12 -> 1+2+3+4+6 = 16)
    public static boolean isAbundantNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return sumProperDivisors(number) > number;
    }

    // Deficient number: sum of proper divisors is LESS than the number (e.g., 8 -> 1+2+4 = 7)
    public static boolean isDeficientNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return sumProperDivisors(number) < number;
    }

    // ================================================================
    // 15. PRIME FACTORIZATION
    // ================================================================

    public static void printPrimeFactorization(int number) {
        if (number == 0) {
            System.out.println("0 has no prime factorization.");
            return;
        }

        number = Math.abs(number);

        for (int factor = 2; factor * factor <= number; factor++) {
            while (number % factor == 0) {
                System.out.print(factor + " ");
                number /= factor;
            }
        }

        if (number > 1) {
            System.out.print(number);
        }

        System.out.println();
    }

   // ================================================================
    // 16. FIBONACCI =
    // ================================================================

    public static long fibonacci(int n) {
        // Return -1 for invalid negative inputs instead of throwing an exception
        if (n < 0) {
            return -1;
        }

        // Base cases: position 0 is 0, position 1 is 1
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        long first = 0;
        long second = 1;
        long next = 0;

        // Loop from index 2 up to 'n'
        for (int i = 2; i <= n; i++) {
            next = first + second; // Calculate the next number
            first = second;        // Shift 'first' to the next position
            second = next;         // Shift 'second' to the next position
        }

        return next;
    }

   // ================================================================
    // 17. POW / MODULAR ARITHMETIC (No Exceptions - Beginner-Friendly)
    // ================================================================

    // Calculates base raised to exponent (base^exponent)
    public static long integerPower(long base, int exponent) {
        // Return -1 for invalid negative exponents instead of throwing an exception
        if (exponent < 0) {
            return -1;
        }

        long result = 1;

        // Multiply base by itself 'exponent' times
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

    // Calculates (base^exponent) % mod safely to prevent number overflow
    public static long modularPower(long base, long exponent, long mod) {
        // Return -1 for invalid inputs (non-positive modulus or negative exponent)
        if (mod <= 0 || exponent < 0) {
            return -1;
        }

        // Any number modulo 1 is always 0
        if (mod == 1) {
            return 0;
        }

        long result = 1;
        base = base % mod; // Reduce base to fit within modulo first

        // Simple loop approach: multiply and apply % mod on every step
        for (long i = 0; i < exponent; i++) {
            result = (result * base) % mod;
        }

        return result;
    }

    // ================================================================
    // 18. SUM OF SQUARES / SQUARE OF SUM
    // ================================================================

    public static long sumOfSquares(int n) {
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;
        }

        return sum;
    }

    public static long squareOfSum(int n) {
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum * sum;
    }

    // ================================================================
    // 19. SPECIAL NUMBER SEQUENCES
    // ================================================================

    public static long triangularNumber(int n) {
        return (long) n * (n + 1) / 2;
    }

    public static long pentagonalNumber(int n) {
        return (long) n * (3L * n - 1) / 2;
    }

    public static long hexagonalNumber(int n) {
        return (long) n * (2L * n - 1);
    }

    // ================================================================
    // 20. COLLATZ SEQUENCE
    // ================================================================

    public static int collatzSteps(long n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive.");
        }

        int steps = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }

            steps++;
        }

        return steps;
    }

    // ================================================================
    // 21. PYTHAGOREAN TRIPLES
    // ================================================================

    public static boolean isPythagoreanTriple(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        int[] values = {a, b, c};
        Arrays.sort(values);

        return (long) values[0] * values[0]
                + (long) values[1] * values[1]
                == (long) values[2] * values[2];
    }

    // ================================================================
    // 22. DIGIT / BASE CONVERSION
    // ================================================================

    public static String decimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        int value = number;

        while (value > 0) {
            result.append(value % 2);
            value /= 2;
        }

        return result.reverse().toString();
    }

    public static int binaryToDecimal(String binary) {
        int result = 0;

        for (int i = 0; i < binary.length(); i++) {
            char digit = binary.charAt(i);

            if (digit != '0' && digit != '1') {
                throw new IllegalArgumentException("Binary number can contain only 0 and 1.");
            }

            result = result * 2 + (digit - '0');
        }

        return result;
    }

    // ================================================================
    // 23. BIGINTEGER
    // ================================================================

    /*
     * Use BigInteger when normal long values are not large enough.
     *
     * Example:
     * BigInteger a = new BigInteger("1000000000000000000000000");
     * BigInteger b = new BigInteger("2");
     *
     * a.add(b)
     * a.subtract(b)
     * a.multiply(b)
     * a.divide(b)
     */

    public static BigInteger bigFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative integers.");
        }

        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    // ================================================================
    // 24. ARRAY HISTORY PATTERN
    // ================================================================

    /*
     * Example use:
     *
     * double[] history = new double[10];
     * int historyCount = 0;
     *
     * historyCount = addHistory(history, historyCount, result);
     *
     * When the array becomes full, the oldest value is removed by
     * shifting each element one position to the left.
     */

    public static int addHistory(double[] history, int historyCount, double value) {
        if (historyCount < history.length) {
            history[historyCount] = value;
            return historyCount + 1;
        }

        // Shift everything left.
        for (int i = 1; i < history.length; i++) {
            history[i - 1] = history[i];
        }

        // Put the new value at the end.
        history[history.length - 1] = value;

        return historyCount;
    }

    public static void printHistory(double[] history, int historyCount) {
        for (int i = 0; i < historyCount; i++) {
            System.out.println((i + 1) + ": " + history[i]);
        }
    }

    // ================================================================
    // 25. SIMPLE CALCULATOR PATTERN
    // ================================================================

    public static double calculate(double first, double second, char operator) {
        switch (operator) {
            case '+':
                return first + second;

            case '-':
                return first - second;

            case '*':
                return first * second;

            case '/':
                if (second == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }

                return first / second;

            default:
                throw new IllegalArgumentException("Unknown operator.");
        }
    }

    // ================================================================
    // 26. NESTED LOOP / PATTERN PRINTING
    // ================================================================

    public static void printSquare(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void printTriangle(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // ================================================================
    // 27. SIMPLE SORTING
    // ================================================================

    /*
     * Bubble sort:
     * Repeatedly compares neighboring values and swaps them when
     * they are in the wrong order.
     *
     * Time complexity: O(n^2)
     */

    public static void bubbleSort(int[] array) {
        for (int pass = 0; pass < array.length - 1; pass++) {
            boolean swapped = false;

            for (int i = 0; i < array.length - 1 - pass; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    // ================================================================
    // 28. COMMON METHOD PATTERN
    // ================================================================

    /*
     * General method structure:
     *
     * public static returnType methodName(parameters) {
     *     // process
     *     return result;
     * }
     *
     * "return" sends a value back to the place where the method was called.
     *
     * Example:
     * int answer = add(5, 3);
     *
     * The method returns 8, so:
     * answer = 8
     */

    public static int square(int number) {
        return number * number;
    }

    // ================================================================
    // 29. MAIN METHOD - RUNNABLE DEMONSTRATION
    // ================================================================

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" JAVA CHALLENGE REFERENCE DEMO");
        System.out.println("======================================");

        // ------------------------------------------------------------
        // Basic math
        // ------------------------------------------------------------

        System.out.println("\n--- BASIC MATH ---");
        System.out.println("5 + 3 = " + add(5, 3));
        System.out.println("5 - 3 = " + subtract(5, 3));
        System.out.println("5 * 3 = " + multiply(5, 3));
        System.out.println("5 / 3 = " + divide(5, 3));
        System.out.println("5 % 3 = " + remainder(5, 3));

        // ------------------------------------------------------------
        // Conditionals
        // ------------------------------------------------------------

        System.out.println("\n--- CONDITIONALS ---");
        System.out.println("10 is " + checkEvenOdd(10));
        System.out.println("-5 is " + checkSign(-5));
        System.out.println("Grade 87 = " + getGrade(87));

        // ------------------------------------------------------------
        // Arrays
        // ------------------------------------------------------------

        System.out.println("\n--- ARRAYS ---");

        int[] numbers = {5, 2, 9, 1, 7};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("Sum: " + sumArray(numbers));
        System.out.println("Average: " + averageArray(numbers));
        System.out.println("Minimum: " + minArray(numbers));
        System.out.println("Maximum: " + maxArray(numbers));
        System.out.println("Index of 9: " + linearSearch(numbers, 9));

        int[] sorted = copyArray(numbers);
        sortArray(sorted);

        System.out.println("Sorted: " + Arrays.toString(sorted));

        // ------------------------------------------------------------
        // Number problems
        // ------------------------------------------------------------

        System.out.println("\n--- NUMBER PROBLEMS ---");
        System.out.println("12345 digit sum: " + sumDigits(12345));
        System.out.println("12345 reversed: " + reverseNumber(12345));
        System.out.println("1221 palindrome: " + isNumberPalindrome(1221));
        System.out.println("7 factorial: " + factorial(7));
        System.out.println("10 choose 3: " + nCr(10, 3));
        System.out.println("10 permute 3: " + nPr(10, 3));

        // ------------------------------------------------------------
        // Prime / GCD / LCM
        // ------------------------------------------------------------

        System.out.println("\n--- NUMBER THEORY ---");
        System.out.println("29 prime: " + isPrime(29));
        System.out.println("GCD(48, 18): " + gcd(48, 18));
        System.out.println("LCM(12, 18): " + lcm(12, 18));
        System.out.println("Divisors of 36: " + countDivisors(36));
        System.out.println("Perfect number 28: " + isPerfectNumber(28));

        System.out.print("Prime factorization of 84: ");
        printPrimeFactorization(84);

        // ------------------------------------------------------------
        // Sequences
        // ------------------------------------------------------------

        System.out.println("\n--- SEQUENCES ---");
        System.out.println("Fibonacci(10): " + fibonacci(10));
        System.out.println("Triangular(10): " + triangularNumber(10));
        System.out.println("Pentagonal(5): " + pentagonalNumber(5));
        System.out.println("Hexagonal(5): " + hexagonalNumber(5));
        System.out.println("Collatz steps for 13: " + collatzSteps(13));

        // ------------------------------------------------------------
        // String problems
        // ------------------------------------------------------------

        System.out.println("\n--- STRINGS ---");
        System.out.println("Reverse 'hello': " + reverseString("hello"));
        System.out.println("Is 'level' palindrome: " + isPalindrome("level"));
        System.out.println("Number of 'a' in 'banana': "
                + countCharacters("banana", 'a'));

        // ------------------------------------------------------------
        // Base conversion
        // ------------------------------------------------------------

        System.out.println("\n--- BASE CONVERSION ---");
        System.out.println("25 in binary: " + decimalToBinary(25));
        System.out.println("11001 in decimal: " + binaryToDecimal("11001"));

        // ------------------------------------------------------------
        // BigInteger
        // ------------------------------------------------------------

        System.out.println("\n--- BIGINTEGER ---");
        System.out.println("50! = " + bigFactorial(50));

        // ------------------------------------------------------------
        // Pythagorean triple
        // ------------------------------------------------------------

        System.out.println("\n--- PYTHAGOREAN TRIPLE ---");
        System.out.println("(3, 4, 5): " + isPythagoreanTriple(3, 4, 5));

        // ------------------------------------------------------------
        // Patterns
        // ------------------------------------------------------------

        System.out.println("\n--- STAR TRIANGLE ---");
        printTriangle(5);

        // ------------------------------------------------------------
        // History array
        // ------------------------------------------------------------

        System.out.println("\n--- HISTORY ARRAY ---");

        double[] history = new double[3];
        int historyCount = 0;

        historyCount = addHistory(history, historyCount, 10.5);
        historyCount = addHistory(history, historyCount, 20.5);
        historyCount = addHistory(history, historyCount, 30.5);
        historyCount = addHistory(history, historyCount, 40.5);

        printHistory(history, historyCount);

        // ------------------------------------------------------------
        // End
        // ------------------------------------------------------------

        System.out.println("\n======================================");
        System.out.println(" DEMO COMPLETE");
        System.out.println("======================================");
    }
}






























// ANSWER TO THE LAST CHALLENGE [October 6. 2026]
import java.util.Scanner;

public class ArrayMenuProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create an empty array capable of holding 10 integers
        int[] numbers = new int[10];

        // Step 2: Use a for loop to prompt the user and populate the array with 10 integers
        System.out.println("--- Enter 10 Integers ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int choice = 0;

        // Step 3: Repeatedly display the menu until the user selects option 5 (Exit)
        while (choice != 5) {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Display all numbers");
            System.out.println("2. Display positive numbers");
            System.out.println("3. Display negative numbers");
            System.out.println("4. Count zeroes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            choice = scanner.nextInt();

            // Step 4: Handle the selected menu option
            switch (choice) {
                case 1:
                    System.out.print("All numbers: ");
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print(numbers[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Positive numbers: ");
                    for (int i = 0; i < numbers.length; i++) {
                        if (numbers[i] > 0) {
                            System.out.print(numbers[i] + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Negative numbers: ");
                    for (int i = 0; i < numbers.length; i++) {
                        if (numbers[i] < 0) {
                            System.out.print(numbers[i] + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 4:
                    int zeroCount = 0;
                    for (int i = 0; i < numbers.length; i++) {
                        if (numbers[i] == 0) {
                            zeroCount++;
                        }
                    }
                    System.out.println("Number of zeroes: " + zeroCount);
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option! Please enter a number from 1 to 5.");
                    break;
            }
        }

        scanner.close();
    }
}
