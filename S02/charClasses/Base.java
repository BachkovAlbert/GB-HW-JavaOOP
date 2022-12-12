package S02.charClasses;

import java.util.Arrays;

public abstract class Base {
    private int attack;
    private int defence;
    private int shots;
    private int[] damage;
    protected double health;
	protected int maxHealth;
    private int speed;
    private boolean delivery;
    private boolean magic;
    private String name;

    public Base(int attack, int defence, int shots, int[] damage, double health, int speed, boolean delivery, boolean magic, String name) {
        this.attack = attack;
        this.defence = defence;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.name = name;
    }

    @Override
    public String toString() {
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
}