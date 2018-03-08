import java.util.*;
public class Print1ToMaxOfNDigits {
    public static void solution1(int n) {
        if (n <= 0) return;
        StringBuilder sb = new StringBuilder();
        while (n-- != 0) {
            sb.append('0');
        }
        while (!increment(sb)) {
            print1(sb);
        }
        System.out.println();
    }
    public static boolean increment(StringBuilder sb) {
        char[] digit = {'0','1','2','3','4','5','6','7','8','9'};
        boolean overflow = false;
        int takeOver = 0;
        for (int n = sb.length() - 1; n >= 0; n--) {
            int nSum = sb.charAt(n) - '0' + takeOver;
            if (n == (sb.length() - 1)) {
                nSum ++;    
            }
            if (nSum >= 10) {
                if (n == 0) {
                    overflow = true; break;
                }
                sb.setCharAt(n,'0');
                takeOver = 1;
            } else {
                sb.setCharAt(n,digit[nSum]);
                break;
            }
        }
        return overflow;     
    }
    public static void print1(StringBuilder sb) {
        boolean isBeginning0 = true;
        for (int i = 0; i < sb.length(); i++) {
            if (isBeginning0 == true && sb.charAt(i) != '0') {
                isBeginning0 = false;
            }
            if (!isBeginning0) {
                System.out.print(sb.charAt(i));
            }
        }
        System.out.print(" ");
    }
    public static void print(StringBuilder sb) {
        StringBuilder tempSb = new StringBuilder(sb.toString());
        int count = 0;
        for (int i = 0; i < sb.length() && tempSb.charAt(i) == '0'; i++) {
            count ++;
        }
        if (count != 0) {
            tempSb.delete(0,count);
        }
        System.out.print(tempSb.toString());
        System.out.print(" ");
    }
    public static void test(int n) {
        solution1(n);
    }
    public static void main(String[] args) {
        test(2);
    }
}
