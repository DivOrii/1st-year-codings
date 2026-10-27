import java.util.Scanner;

public class MinecraftArrayCheatSheet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        // Minecraft menu: choose which array quest to practice
        do {
            System.out.println("\n===== MINECRAFT JAVA ARRAY QUESTS =====");
            System.out.println(" 1. Display every element");
            System.out.println(" 2. Find the sum");
            System.out.println(" 3. Search for a number and count it");
            System.out.println(" 4. Find largest and smallest");
            System.out.println(" 5. Count positive, negative, and zero");
            System.out.println(" 6. Count even and odd");
            System.out.println(" 7. Show values greater than a target");
            System.out.println(" 8. Sum even and odd values separately");
            System.out.println(" 9. Count values from 10 to 50");
            System.out.println("10. Show every matching index");
            System.out.println("11. Print array backward");
            System.out.println("12. Copy array into another array");
            System.out.println("13. Replace negative values with zero");
            System.out.println("14. Find duplicate values");
            System.out.println("15. Sort ascending (Bubble Sort)");
            System.out.println("16. Display evens first, then odds");
            System.out.println("17. Find second-largest distinct value");
            System.out.println("18. Remove duplicates into a new array");
            System.out.println("19. Student grades summary");
            System.out.println("20. Multiplication table stored in an array");
            System.out.println("21. Frequency of each value");
            System.out.println("22. Compare two arrays in order");
            System.out.println("23. Rotate array right once");
            System.out.println("24. Find pairs that add to a target");
            System.out.println(" 0. Exit");
            System.out.print("Choose a quest: ");

            while (!input.hasNextInt()) {
                System.out.print("Please enter a number: ");
                input.next();
            }
            choice = input.nextInt();

            // Each case runs one array example
            switch (choice) {
                case 1: displayElements(); break;
                case 2: findSum(); break;
                case 3: searchAndCount(input); break;
                case 4: largestSmallest(); break;
                case 5: countSigns(); break;
                case 6: countEvenOdd(); break;
                case 7: greaterThanTarget(input); break;
                case 8: sumEvenOdd(); break;
                case 9: countRange(); break;
                case 10: showAllIndexes(input); break;
                case 11: printBackward(); break;
                case 12: copyArray(); break;
                case 13: replaceNegatives(); break;
                case 14: findDuplicates(); break;
                case 15: bubbleSort(); break;
                case 16: displayEvensThenOdds(); break;
                case 17: secondLargest(); break;
                case 18: removeDuplicates(); break;
                case 19: gradeSummary(); break;
                case 20: multiplicationTable(input); break;
                case 21: frequency(); break;
                case 22: compareArrays(); break;
                case 23: rotateRight(); break;
                case 24: findPairs(input); break;
                case 0: System.out.println("Quest complete. Goodbye!"); break;
                default: System.out.println("That quest number does not exist.");
            }
        } while (choice != 0);

        input.close();
    }

    // 1. Display every value in the array
    static void displayElements() {
        int[] moew = {6, 7, 9, 3, 5};

        // Walk through every slot, starting at index 0
        for (int i = 0; i < moew.length; i++) {
            System.out.println(moew[i]); // Show the value in this slot
        }
    }

    // 2. Add all values together
    static void findSum() {
        int[] moew = {6, 7, 9, 3, 5};
        int sum = 0; // Like starting with an empty inventory total

        for (int i = 0; i < moew.length; i++) {
            sum += moew[i]; // Add this value to the total
        }
        System.out.println("Sum: " + sum); // Output: 30
    }

    // 3. Search for a number and count its occurrences
    static void searchAndCount(Scanner input) {
        int[] moew = {6, 7, 9, 3, 5, 7};
        System.out.print("Which number are you searching for? ");
        int search = input.nextInt();
        int count = 0;

        for (int i = 0; i < moew.length; i++) {
            if (moew[i] == search) { // Is this slot the item we want?
                count++; // Count one match
            }
        }

        if (count > 0) {
            System.out.println("Found " + count + " time(s).");
        } else {
            System.out.println("Not found.");
        }
    }

    // 4. Find the highest and lowest values
    static void largestSmallest() {
        int[] moew = {6, 7, 9, 3, 5};
        int largest = moew[0];  // Start by checking the first slot
        int smallest = moew[0];

        for (int i = 1; i < moew.length; i++) {
            if (moew[i] > largest) {
                largest = moew[i]; // New champion!
            }
            if (moew[i] < smallest) {
                smallest = moew[i]; // New lowest value
            }
        }
        System.out.println("Largest: " + largest);   // 9
        System.out.println("Smallest: " + smallest); // 3
    }

    // 5. Count positive, negative, and zero values
    static void countSigns() {
        int[] moew = {6, -7, 0, 3, -5};
        int positive = 0, negative = 0, zero = 0;

        for (int i = 0; i < moew.length; i++) {
            if (moew[i] > 0) {
                positive++;
            } else if (moew[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }

    // 6. Count even and odd values
    static void countEvenOdd() {
        int[] moew = {6, 7, 9, 3, 5};
        int even = 0, odd = 0;

        for (int i = 0; i < moew.length; i++) {
            if (moew[i] % 2 == 0) {
                even++; // Even team
            } else {
                odd++; // Odd team
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }

    // 7. Display values greater than a chosen target
    static void greaterThanTarget(Scanner input) {
        int[] moew = {6, 7, 9, 3, 5};
        System.out.print("Enter target value: ");
        int target = input.nextInt();

        for (int i = 0; i < moew.length; i++) {
            if (moew[i] > target) {
                System.out.println(moew[i]);
            }
        }
    }

    // 8. Add even values and odd values separately
    static void sumEvenOdd() {
        int[] moew = {6, 7, 9, 3, 5};
        int evenSum = 0, oddSum = 0;

        for (int i = 0; i < moew.length; i++) {
            if (moew[i] % 2 == 0) {
                evenSum += moew[i]; // Store in even chest
            } else {
                oddSum += moew[i]; // Store in odd chest
            }
        }
        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: " + oddSum);
    }

    // 9. Count values from 10 to 50, including both ends
    static void countRange() {
        int[] moew = {6, 15, 50, 3, 42, 51};
        int count = 0;

        for (int i = 0; i < moew.length; i++) {
            if (moew[i] >= 10 && moew[i] <= 50) {
                count++; // This value is inside the range
            }
        }
        System.out.println("In range: " + count);
    }

    // 10. Display every index where a searched number appears
    static void showAllIndexes(Scanner input) {
        int[] moew = {7, 3, 7, 5, 7};
        System.out.print("Search for: ");
        int search = input.nextInt();
        boolean found = false;

        for (int i = 0; i < moew.length; i++) {
            if (moew[i] == search) {
                System.out.println("Found at index " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found.");
        }
    }

    // 11. Print the values from last to first
    static void printBackward() {
        int[] moew = {6, 7, 9, 3, 5};

        // Start at the last index and move backward
        for (int i = moew.length - 1; i >= 0; i--) {
            System.out.print(moew[i] + " ");
        }
        System.out.println();
    }

    // 12. Copy every value into a second array
    static void copyArray() {
        int[] moew = {6, 7, 9, 3, 5};
        int[] copy = new int[moew.length];

        for (int i = 0; i < moew.length; i++) {
            copy[i] = moew[i]; // Copy the matching slot
        }

        System.out.print("Copied array: ");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();
    }

    // 13. Replace every negative value with zero
    static void replaceNegatives() {
        int[] moew = {6, -7, 9, -3, 5};

        for (int i = 0; i < moew.length; i++) {
            if (moew[i] < 0) {
                moew[i] = 0; // Replace this slot's value
            }
        }

        printArray(moew);
    }

    // 14. Display each duplicate value only once
    static void findDuplicates() {
        int[] moew = {6, 7, 6, 3, 7, 5};

        for (int i = 0; i < moew.length; i++) {
            boolean appearedBefore = false;

            // Check if this value already appeared earlier
            for (int j = 0; j < i; j++) {
                if (moew[i] == moew[j]) {
                    appearedBefore = true;
                    break;
                }
            }

            if (!appearedBefore) {
                // Look ahead to see if this value repeats
                for (int j = i + 1; j < moew.length; j++) {
                    if (moew[i] == moew[j]) {
                        System.out.println(moew[i]);
                        break; // Print this duplicate only once
                    }
                }
            }
        }
    }

    // 15. Sort from smallest to largest with Bubble Sort
    static void bubbleSort() {
        int[] moew = {6, 7, 9, 3, 5};

        for (int i = 0; i < moew.length - 1; i++) {
            for (int j = 0; j < moew.length - 1 - i; j++) {
                if (moew[j] > moew[j + 1]) {
                    // Swap neighbors using a temporary storage slot
                    int temp = moew[j];
                    moew[j] = moew[j + 1];
                    moew[j + 1] = temp;
                }
            }
        }
        printArray(moew);
    }

    // 16. Display even values first, then odd values
    // Note: This changes the display order, not the array itself.
    static void displayEvensThenOdds() {
        int[] moew = {6, 7, 9, 3, 5};

        System.out.print("Even: ");
        for (int i = 0; i < moew.length; i++) {
            if (moew[i] % 2 == 0) {
                System.out.print(moew[i] + " ");
            }
        }

        System.out.print("\nOdd: ");
        for (int i = 0; i < moew.length; i++) {
            if (moew[i] % 2 != 0) {
                System.out.print(moew[i] + " ");
            }
        }
        System.out.println();
    }

    // 17. Find the second-largest DISTINCT value
    static void secondLargest() {
        int[] moew = {6, 7, 9, 3, 5};

        // Sort the array first
        for (int i = 0; i < moew.length - 1; i++) {
            for (int j = 0; j < moew.length - 1 - i; j++) {
                if (moew[j] > moew[j + 1]) {
                    int temp = moew[j];
                    moew[j] = moew[j + 1];
                    moew[j + 1] = temp;
                }
            }
        }

        int largest = moew[moew.length - 1];
        boolean found = false;

        // Search backward for a value smaller than the largest
        for (int i = moew.length - 2; i >= 0; i--) {
            if (moew[i] < largest) {
                System.out.println("Second largest: " + moew[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No second-largest distinct value.");
        }
    }

    // 18. Keep only unique values in a new array
    static void removeDuplicates() {
        int[] moew = {6, 7, 6, 3, 7, 5};
        int[] unique = new int[moew.length];
        int size = 0; // Number of unique values saved so far

        for (int i = 0; i < moew.length; i++) {
            boolean exists = false;

            for (int j = 0; j < size; j++) {
                if (moew[i] == unique[j]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                unique[size] = moew[i];
                size++; // One more unique value in the new array
            }
        }

        // Print only filled slots, not unused zero slots
        for (int i = 0; i < size; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();
    }

    // 19. Average, highest, lowest, and passing grades
    static void gradeSummary() {
        int[] moew = {88, 72, 95, 60, 75};
        int sum = 0, passed = 0;

        for (int i = 0; i < moew.length; i++) {
            sum += moew[i];
            if (moew[i] >= 75) {
                passed++; // 75 or higher is passing
            }
        }

        int highest = moew[0], lowest = moew[0];
        for (int i = 1; i < moew.length; i++) {
            if (moew[i] > highest) highest = moew[i];
            if (moew[i] < lowest) lowest = moew[i];
        }

        double average = (double) sum / moew.length;
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Passed: " + passed);
    }

    // 20. Store and display the first ten multiples
    static void multiplicationTable(Scanner input) {
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] moew = new int[10];

        for (int i = 0; i < moew.length; i++) {
            moew[i] = number * (i + 1); // Store multiples 1 to 10
        }

        for (int i = 0; i < moew.length; i++) {
            System.out.println(number + " x " + (i + 1) + " = " + moew[i]);
        }
    }

    // 21. Count the frequency of every distinct value
    static void frequency() {
        int[] moew = {6, 7, 6, 3, 7, 5};
        boolean[] counted = new boolean[moew.length];

        for (int i = 0; i < moew.length; i++) {
            if (counted[i]) {
                continue; // This slot was already counted
            }

            int count = 1; // Count the current value itself
            for (int j = i + 1; j < moew.length; j++) {
                if (moew[i] == moew[j]) {
                    count++;
                    counted[j] = true; // Mark this duplicate as counted
                }
            }

            System.out.println(moew[i] + " appears " + count + " time(s).");
        }
    }

    // 22. Check whether arrays match in the same order
    static void compareArrays() {
        int[] moew = {6, 7, 9, 3, 5};
        int[] other = {6, 7, 9, 3, 5};
        boolean same = true;

        for (int i = 0; i < moew.length; i++) {
            if (moew[i] != other[i]) {
                same = false;
                break; // One mismatch is enough
            }
        }

        if (same) {
            System.out.println("Arrays are the same.");
        } else {
            System.out.println("Arrays are different.");
        }
    }

    // 23. Rotate all values one position to the right
    static void rotateRight() {
        int[] moew = {6, 7, 9, 3, 5};

        int last = moew[moew.length - 1]; // Save the last value

        for (int i = moew.length - 1; i > 0; i--) {
            moew[i] = moew[i - 1]; // Shift each value right
        }

        moew[0] = last; // Put the saved last value first
        printArray(moew);
    }

    // 24. Find pairs whose sum equals the target
    static void findPairs(Scanner input) {
        int[] moew = {2, 4, 6, 8};
        System.out.print("Enter target sum: ");
        int target = input.nextInt();
        boolean found = false;

        // First loop picks one slot; second picks a later slot
        for (int i = 0; i < moew.length - 1; i++) {
            for (int j = i + 1; j < moew.length; j++) {
                if (moew[i] + moew[j] == target) {
                    System.out.println(moew[i] + " and " + moew[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found.");
        }
    }

    // Helper method: display any integer array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
