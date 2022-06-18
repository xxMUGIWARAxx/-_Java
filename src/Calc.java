public class Calc {
    public static int calc(int value, int value1, char ch) {
        int result = 0;
        switch (ch) {
            case '+' -> result = value + value1;
            case '-' -> result = value - value1;
            case '/' -> result = value / value1;
            case '*' -> result = value * value1;
            default -> System.out.println("Некорректная операция");
        }
        return result;
    }
}