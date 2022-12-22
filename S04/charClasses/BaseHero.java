package S04.charClasses;
import S04.BaseInterface;

import java.util.Arrays;
import java.util.ArrayList;

    public abstract class BaseHero implements BaseInterface{  
    protected int attack;
    protected int defence;
    protected int shots;
    protected int[] damage;
    protected int health;  
	protected int maxHealth;  
    public int speed;           
    protected boolean delivery;       
    protected boolean magic;          
    protected String name;
    protected ArrayList<BaseHero> party; 
    protected String status;
    protected Vector2 position;

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
        this.position = new Vector2(x, y);
        this.status = "stand";
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

    protected void damage(int damage) {    
        health = health - damage;
        if (health <= 0) {
            status = "dead";
            health = 0;
        }
        if (health > maxHealth) health = maxHealth;
    }

    public int getHealth() { 
        return health;
    }
    
    public String getName(){
        return name;
    }

    public Vector2 getPosition() {
        return position;
    }

    @Override
    public void step(ArrayList<BaseHero> nparty) {
    }

    protected int damageValue (BaseHero h) {
        int flag = attack - h.defence;
        int value = 0;
        if (flag == 0) value = ((damage[0] + damage[1]) / 2);
        if (flag > 0) value = damage[1];
        if (flag < 0) value = damage[0];
        return value;
    }

    public String getStatus() {
        return status;
    }
}