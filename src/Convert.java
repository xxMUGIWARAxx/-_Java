public class Convert {

    public static String convertArabianToRoman(int number) {
        int[] arabian = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < roman.length; i++) {
            while (number >= arabian[i]) {
                number -= arabian[i];
                builder.append(roman[i]);
            }
        }
        return builder.toString();
    }
}