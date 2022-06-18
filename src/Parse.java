public class Parse {
    public static boolean isRome = false;
    public static int[] parse(String[] parts) throws Exception{
        int number;
        int number1;
        try {
            number = RomanNumbers.valueOf(parts[0]).getValue();
            number1 = RomanNumbers.valueOf(parts[2]).getValue();
            isRome = true;
        } catch (IllegalArgumentException e) {
            try {
                number = Integer.parseInt(parts[0]);
                number1 = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e2) {
                throw new Exception("используются одновременно разные системы счисления");
            }

        }
        if (number > 10 || number1 > 10 || number < 1 || number1 < 1){
            throw new Exception("калькулятор должен принимать на вход числа от 1 до 10 включительно, не более");
        }
        return new int[]{number, number1};
    }
}