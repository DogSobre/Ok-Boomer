package DogSobre_Industries;
import javax.xml.namespace.QName;
import java.awt.*;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        // write your code here
        System.out.println("Application was started");
        String help = "I don't understand, please use :" + "\n" + "- help" + "\n" + "- archetype" + "\n" + "- exit" + "\n";
        String str;

        do {

            //With this 3 follow lines, the user can write commands in our database

            Scanner userType = new Scanner(System.in);
            System.out.println("Type your command :");
            str = userType.nextLine();

            //Conditions of display for the commands

            if (str.equals("help")) {
                System.out.println(help);
            } else if (str.equals("exit")) {
                System.out.println("You interrupted the program");
            }

            // that's the condition to our archetype character

            else if (str.equals("archetype")){
                Archetype perso1 = new Archetype("Tryndamère", 547, 68, 315, "On each stroke, the resistance of the character increases and its damage");
                System.out.println(perso1);
            }
            else {
                System.out.println(help);

            }
        }while(str.equals("exit") != true);
    }
}
