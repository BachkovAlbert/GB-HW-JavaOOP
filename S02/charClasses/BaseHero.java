package S02.charClasses;

import java.util.Arrays;
import java.util.ArrayList;

import S02.BaseInterface;

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

    public BaseHero(int attack, int defence, int shots, int[] damage, int health, int speed, boolean delivery, boolean magic, String name, ArrayList<BaseHero> party) {
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
    }

    @Override
    public String getInfo() {
        return "attack = " + attack +
                ", protection = " + defence +
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

    @Override
    public void step(ArrayList<BaseHero> party) {
    }
}