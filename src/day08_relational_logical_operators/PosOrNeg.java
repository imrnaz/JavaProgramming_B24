package day08_relational_logical_operators;

public class PosOrNeg {
    public static void main(String[] args) {

        int number = 3;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        boolean isPositive = number > 0;


        System.out.println(number + " Is negative: " + isNegative);
        System.out.println(number + " Is positive: " + isPositive);
        System.out.println(number + " is zero: " + isZero);
    }
}
