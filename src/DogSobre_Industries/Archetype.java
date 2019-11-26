package DogSobre_Industries;

public class Archetype {

    // attributes

    private String name;
    private int hp;
    private int damage;
    private int speed;
    private String talent;


    // method constructor

    public Archetype(String n, int hp, int d, int s, String t){

        this.name = n;
        this.hp = hp;
        this.damage = d;
        this.speed = s;
        this.talent = t;
    }

    public String toString(){
        String out = "------------------\n";
        out = out + "Name : " + this.name + "\n";
        out = out + "Heal Point : " + this.hp + "\n";
        out = out + "Damage : " + this.damage + "\n";
        out = out + "Speed : " + this.speed + "\n";
        out = out + "Talent of the character : " + this.talent + "\n";
        out = out + "------------------\n";
        return out;
    }

}
