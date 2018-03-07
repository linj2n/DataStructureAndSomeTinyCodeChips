import java.util.*;
public class Power {
    public static double solution(double base, int exponent) {
        if (exponent == 0) return 1;
        double res = base;
        if (exponent < 0){
            base = 1 / base;
            exponent *= -1;
        }
        return calculatePower(base,exponent);
    }
    public static double calculatePower(double base, int exponent) {
        double res = 1;
        while (exponent-- != 0) {
            res *= base;
        }
        return res;
    }
    public static void test(double base, int exponent, double expected) {
        double res1 = solution(base,exponent);
        if ((res1 - expected < 0.0000001) && (res1 - expected > -0.0000001)) {
            System.out.println("Solution1: Test for " + base + "^"+ exponent + " PASSED!");
        } else {
            System.out.println("Solution1: Test for " + base + "^"+ exponent + " FAILED!");
            System.out.println("your output: " + res1 + " , expected: " + expected);
        }
    }
    public static void main(String[] args) {
        test(2,2,4);
        test(2,-1,0.5);
    }
}
