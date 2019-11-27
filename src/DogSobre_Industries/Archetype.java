package DogSobre_Industries;

public class Archetype {

    // attributes

    private String name;
    private int hp;
    private int damage;
    private int speed;



    // method constructor

    public Archetype(String n, int hp, int d, int s){

        this.name = n;
        this.hp = hp;
        this.damage = d;
        this.speed = s;
    }

    public String getName()
    {
        return this.name;
    }

    public int getHp()
    {
        return this.hp;
    }

    public int getDamage()
    {
        return this.damage;
    }

    public int getSpeed()
    {
        return this.speed;
    }

    public void hurtCharacter(int appliedDamages)
    {
        // reduce life
        this.hp = this.hp - appliedDamages;
    }

    public String toString(){
        String out = "------------------\n";
        out = out + "Name : " + this.name + "\n";
        out = out + "Heal Point : " + this.hp + "\n";
        out = out + "Damage : " + this.damage + "\n";
        out = out + "Speed : " + this.speed + "\n";
        out = out + "------------------\n";
        return out;
    }

}
