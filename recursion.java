package System.out;

public class recursion {

    public static void main(String[] args) {

        countdown(0);
        System.out.println("\nFactorial of 5 is " + factorial(5));

    }
//countdown uising recursion
    static void countdown(int CTnum) {
        if (CTnum == 100) {
            return;
        }
        System.out.println(CTnum);

        countdown(CTnum + 1);

    }

//factorial using recursion
    static int factorial(int FactorialNum) {
        if (FactorialNum > 1) {
            return FactorialNum * factorial(FactorialNum - 1);
        } else {
            return 1;
        }
    }
}
