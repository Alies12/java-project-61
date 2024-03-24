package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc \n0 - Exit");
            Scanner scan = new Scanner(System.in);
            int numberGame = scan.nextInt();
            switch (numberGame){
                case 1:
                    Greet.Even();
                    break;
                case 2:
                    ParityCheck.parityNumber();
                    break;
                case 3:
                    Calc.CalculateNumber();
                    break;
            }
    }
}
