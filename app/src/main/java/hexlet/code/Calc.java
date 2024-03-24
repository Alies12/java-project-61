package hexlet.code;

import java.util.Scanner;

public class Calc {
    public static void CalculateNumber(){
        Cli.username();
        Scanner scan = new Scanner(System.in);
        var name = scan.nextLine();
        System.out.println("Hello " + name);
        int j = 0;
        for (int i = 0; i < 3; i++) {
            Scanner scan1 = new Scanner(System.in);
            int example = RandomNumber.randomNumbers(2);
            int number1 = RandomNumber.randomNumbers(100);
            int number2 = RandomNumber.randomNumbers(100);
            int result = 0;
            switch (example){
                case 0:
                     result = number1 - number2;
                    System.out.println(String.valueOf(number1) + "-" + number2);
                    break;
                case 1:
                     result = number1 + number2;
                    System.out.println(String.valueOf(number1) + "+" + number2);
                    break;

            }
            int userResult = scan1.nextInt();
            if (userResult == result){
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
