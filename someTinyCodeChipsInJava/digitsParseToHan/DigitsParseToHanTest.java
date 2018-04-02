package digitsParseToHan;
public class DigitsParseToHanTest {
    public static void testAndPrint(String str) {
        System.out.println(str + " = " + DigitsParseToHan.parseToHan(str));        
    }
    public static void test1() {
        testAndPrint("0");
    }
    public static void test2() {
        testAndPrint("1");
    }
    public static void test3() {
        testAndPrint("10");
    }
    public static void test4() {
        testAndPrint("100");
    }
    public static void test5() {
        testAndPrint("10000");
    }
    public static void test6() {
        testAndPrint("100000");
    }
    public static void test7() {
        testAndPrint("1000000");
    }
    public static void test8() {
        testAndPrint("10000000");
    }
    public static void test9() {
        testAndPrint("100000000");
    }
    public static void test10() {
        testAndPrint("1000000000");
    }

    public static void test11() {
        testAndPrint("101");
    }
    public static void test12() {
        testAndPrint("1001");
    }

    public static void test13() {
        testAndPrint("10001");
    }
    public static void test14() {
        testAndPrint("100001");
    }
    public static void test15() {
        testAndPrint("100101");
    }
    public static void test16() {
        testAndPrint("10010101");
    }
    public static void test17() {
        testAndPrint("1001001001");
    }

    public static void main(String[] args) {
        DigitsParseToHanTest.test1();
        DigitsParseToHanTest.test2();
        DigitsParseToHanTest.test3();
        DigitsParseToHanTest.test4();
        DigitsParseToHanTest.test5();
        DigitsParseToHanTest.test6();
        DigitsParseToHanTest.test7();
        DigitsParseToHanTest.test8();
        DigitsParseToHanTest.test9();
        DigitsParseToHanTest.test10();
        DigitsParseToHanTest.test11();
        DigitsParseToHanTest.test12();
        DigitsParseToHanTest.test13();
        DigitsParseToHanTest.test14();
        DigitsParseToHanTest.test15();
        DigitsParseToHanTest.test16();
        DigitsParseToHanTest.test17();
    }

}