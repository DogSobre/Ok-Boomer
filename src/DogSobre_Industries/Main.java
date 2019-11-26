package DogSobre_Industries;


import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Application was started");
        String help = "The commands you can write are 'help' and 'exit'";
        String str;

        do {
            //With this 3 follow lines, the user can write commands in our database
            Scanner userType = new Scanner(System.in);
            System.out.println("Type your command :");
            str = userType.nextLine();

            if (str.equals("help")) {
                System.out.println(help);
            } else if (str.equals("exit")) {
                System.out.println("You interrupted the program");
            } else {
                System.out.println(help);

            }
        }while(str.equals("exit") != true);
    }
}
