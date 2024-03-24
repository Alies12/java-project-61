package hexlet.code;

import java.util.Scanner;

public class ParityCheck {
    public static Object parityNumber;
    public static void parityNumber(){
        Cli.username();
        Scanner scan = new Scanner(System.in);
        var name = scan.nextLine();
        System.out.println("Hello " + name);
        int j = 0;
        for (int i = 0; i < 3; i++) {
            Scanner scan1 = new Scanner(System.in);
            String result = "";
            int randomNumber = RandomNumber.randomNumbers(100);
            System.out.println(randomNumber);
            if (randomNumber % 2 == 0) {
                result = "yes";
            } else {
                result = "no";
            }
            String userResult = scan1.nextLine();
            if (userResult.equals(result)) {
                j += 1;
                System.out.println("Correct!");
            } else {
                i += 3;
                System.out.println("Let's try again, " + name);
            }
        }
            if (j == 3) {
                System.out.println("Congratulations, " + name);
            }
        }
    }

