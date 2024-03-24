package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static void Even(){
        Cli.username();
        Scanner scan = new Scanner(System.in);
        var name = scan.nextLine();
        System.out.println("Hello " + name);
    }
}
