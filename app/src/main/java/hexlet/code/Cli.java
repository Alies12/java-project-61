package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static Object username;
    public static void username() {
        Scanner scan = new Scanner(System.in);
        System.out.println("May I Have yor name?");
        String userName = scan.nextLine();
        System.out.println("Hello " + userName);
    }
}
