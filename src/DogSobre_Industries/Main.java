package DogSobre_Industries;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        // LISTE DE PERSOS
        List<Archetype> charList = new ArrayList<>();




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
            } else if (str.equals("exit"))
            {
                System.out.println("You interrupted the program");
            }

            // that's the condition to our archetype character

            else if (str.equals("goblin"))
            {
                Archetype perso1 = new Archetype("goblin", 13, 3, 36);

                //perso1.getName()
                System.out.println(perso1);
                perso1.hurtCharacter(10);
                System.out.println(perso1);

            }

            else if (str.equals("troll"))
            {
                Archetype perso2 = new Archetype("troll",68,15,18);
                System.out.println(perso2);
            }

            // test on fight mecanics
            else if (str.equals("fight"))
            {

                Archetype perso1 = new Archetype("goblin", 13, 3, 36);

                System.out.println(perso1);
                Archetype perso2 = new Archetype("troll",68,15,18);
                System.out.println(perso2);

                do
                {
                    int appliedDamages = perso1.getDamage();
                    perso2.hurtCharacter(appliedDamages);

                    System.out.println(perso1);
                    System.out.println(perso2);

                    appliedDamages = perso2.getDamage();
                    perso1.hurtCharacter(appliedDamages);

                    System.out.println(perso1);
                    System.out.println(perso2);
                }
                while (perso1.getHp()>0 && perso2.getHp()>0);
            }
            else
            {
                System.out.println(help);
            }

        }while(str.equals("exit") != true);



    }
}


// creer classe a part pour mettre le code (fight, choix des commandes)
// choix de commande (ok) : creer personnage (ddemander les infos du perso et appeler le new)