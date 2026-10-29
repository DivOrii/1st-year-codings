public class LiveCoding {
    public static void main(String[] args) {



        System.out.println("Problem 1: Odd or Even");
        System.out.println();
        System.out.println(checkOddEven(2));
        System.out.println("0 = Odd, 1 = Even.");
        System.out.println();


        System.out.println("Problem 2: Triangle Classification");
        System.out.println(PrintClassifyTriangle(5,5,5) + " = Equillateral");
        System.out.println(PrintClassifyTriangle(5,5,3) + " = Isosceles");
        System.out.println(PrintClassifyTriangle(4,5,6) + " = Scalene");
        System.out.println(PrintClassifyTriangle(1,2,3) + " = Invalid Triangle");


    }
    // Problem 1: Returns 0 if odd, 1 if even
    static int checkOddEven(int number) {
        if (number % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    // Problem 2: Classifies a triangle
    static int PrintClassifyTriangle(int side1, int side2, int side3) {

        // Checking if the side lengths are positive. If not, then it's Invalid.
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return 0;
        }

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return 0;
        }

        // Equilateral: All three sides are equal
        if (side1 == side2 && side2 == side3) {
            return 1;
        }

        // Isosceles: Exactly two sides are equal
        if (side1 == side2 || side1 == side3 || side2 == side3) {
            return 2;
        }

        // Scalene: All three sides are different
        return 3;
    }
}
