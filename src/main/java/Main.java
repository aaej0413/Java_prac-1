import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double value = 1234.56;

        int score = (int)value;

        System.out.println(score == 1234.56);

        String str = Integer.toString(score);
        System.out.println(str);
    }
}
