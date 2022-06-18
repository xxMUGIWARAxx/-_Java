import java.util.Scanner;

public class Input {
    public static String[] read() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        if (parts.length > 3) {
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }else if (parts.length<=1){
            throw new Exception("строка не является математической операцией");
        }
        return parts;
    }
}