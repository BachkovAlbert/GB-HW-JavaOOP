package S03.charClasses;

import S03.BaseInterface;
import java.util.Arrays;
import java.util.ArrayList;

public abstract class BaseHero implements BaseInterface {
    protected int attack;
    protected int defence;
    protected int shots;
    protected int[] damage;
    protected int health;  
	protected int maxHealth;  
    protected int speed;
    protected boolean delivery;       
    protected boolean magic;          
    protected String name;
    protected ArrayList<BaseHero> party; 
    protected int [] position = new int[2];

    public BaseHero(int attack, int defence, int shots, int[] damage, int health, int speed, boolean delivery, boolean magic, String name, ArrayList<BaseHero> party, int x, int y) { 
        this.attack = attack;
        this.defence = defence;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.name = name;
        this.party = party; 
        this.position[0] = x;       
        this.position[1] = y;
    }

    @Override
    public String getInfo() {
        return "attack = " + attack +
                ", defence = " + defence +
                ", shots = " + shots +
                ", damage = " + Arrays.toString(damage) +
                ", health = " + health +
                ", speed = " + speed +
                ", delivery = " + delivery +
                ", magic = " + magic +
                ", - " + name;
    }    

    public void damage(int damage) {    
        this.health = health - damage;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getHealth() { 
        return health;
    }
    public int getMaxHealth() { 
        return maxHealth;
    }

    public String getName(){
        return name;
    }

    // public int[] getPosition() {
    //     return position;
    // }

    public boolean isEqualPos(int[] pos) {
        return this.position[0]==pos[0] && this.position[1]==pos[1];
    }

    @Override
    public void step(ArrayList<BaseHero> party) {
    }
}