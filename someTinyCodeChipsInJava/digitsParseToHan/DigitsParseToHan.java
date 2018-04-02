package digitsParseToHan;
import java.util.*;
public class DigitsParseToHan {
    public static int MAX_DIGITS = 16;

    public static String fourDigitsConvertToHan(String str) {
        String[] hanUnit = {"十","百","千"};
        String[] hanDigit = {"零","一","二","三","四","五","六","七","八","九"};

        formatCheck(str);
        rangeCheck(str,4);

        int integer = Integer.parseInt(str);
        if (str.length() == 1) {
            return hanDigit[integer];
        }

        StringBuilder sb = new StringBuilder();
        int i = -1;

        while (integer != 0) {
            int digit = integer % 10;
            if (digit != 0 && i != -1) {
                sb.append(hanUnit[i]);
            }
            if (digit != 0 || ( sb.length() != 0 && sb.charAt(sb.length() - 1) != '零')) {
                sb.append(hanDigit[digit]);
            }
            ++ i;
            integer /= 10;
        }
        return sb.reverse().toString();
    }
    public static String parseToHan(String in) {

        rangeCheck(in,MAX_DIGITS);
        formatCheck(in);

        if (in.length() < 4) return fourDigitsConvertToHan(in);

        String[] unit = {"万","亿","万"};
        String res = "";

        int offSet  = -1;
        int t       = -1;
        int endIndex = in.length();

        for (t = in.length() >> 2; t > 0 && offSet < unit.length; t--) {

            String fourDigits = in.substring(endIndex - 4,endIndex);
            int subValue = Integer.parseInt(fourDigits);

            fourDigits = fourDigitsConvertToHan(fourDigits);
            boolean isFourDigits = (Integer.toString(subValue).length() == 4) ? true : false;

            if (offSet != -1 && subValue != 0) { 
                res = unit[offSet] + res;
            }

            res = fourDigits +  res;
            
            if (!isFourDigits && fourDigits.length() != 0) {
                res = "零" + res;
            }

            endIndex -= 4;   
            offSet = (offSet + 1) % 3;

        }
        
        if (endIndex > 0) {
            String finalDigits = in.substring(0,endIndex);
            finalDigits = fourDigitsConvertToHan(finalDigits);

            if (offSet != -1) { 
                res = unit[offSet] + res;
            }
            res = finalDigits + res;

        }
        return res;
    }
    private static void formatCheck(String in) {
        // insert codes..
    }
    private static void rangeCheck(String in, int maxRange) {
        // insert codes
    }
}

