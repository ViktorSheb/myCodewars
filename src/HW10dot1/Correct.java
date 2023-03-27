package HW10dot1;

public class Correct {
    public static String correct(String string) {
        string = string.replace('5', 'S');
        return string.replace('0', 'O')
                .replace('1', 'I');
    }

}
