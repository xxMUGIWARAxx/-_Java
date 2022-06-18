import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        String[] parts = Input.read();
        int[] numArray = Parse.parse(parts);
        char op = parts[1].charAt(0);
        int result = Calc.calc(numArray[0], numArray[1], op);
        if (Parse.isRome) {
            System.out.println(Convert.convertArabianToRoman(result));
        }
        if (Parse.isRome & result < 1) {
            throw new Exception("в римской системе нет отрицательных чисел");
        }
        else {
            System.out.println(result);
        }
    }
}