public class NumberConverter {
    public static Integer stringToInteger(String str) {
        return Integer.valueOf(str);
    }

    public static String doubleToString(Double d) {
        return String.valueOf(d);
    }

    public static Double stringToDouble(String str) {
        return Double.valueOf(str);
    }

    public static String integerToString(Integer i) {
        return String.valueOf(i);
    }

    public static Double integerToDouble(Integer i) {
        return Double.valueOf(i);
    }

    public static Integer doubleToInteger(Double d) {
        return d.intValue();
    }

    public static void main(String[] args) {
        String strNum = "123";
        Integer intNum = 456;
        Double doubleNum = 7.89;
        System.out.println("String to Integer: " + stringToInteger(strNum));
        System.out.println("Double to String: " + doubleToString(doubleNum));
        System.out.println("String to Double: " + stringToDouble(strNum));
        System.out.println("Integer to String: " + integerToString(intNum));
        System.out.println("Integer to Double: " + integerToDouble(intNum));
        System.out.println("Double to Integer: " + doubleToInteger(doubleNum));
    }
}
