package S03.charClasses;

import java.util.ArrayList;

public class Monk extends BaseHero {
    public Monk(ArrayList<BaseHero> party, int x, int y) {
        super(12, 7, 0, new int[]{-4,-4}, 30, 5, false, true, "Monk", party, x, y);
    }

    public Monk(int attack, int defence, int shots, int[] damage, int health, int speed, boolean delivery, boolean magic, String name, ArrayList<BaseHero> party, int x, int y){
        super(attack, defence, shots, damage, health, speed, delivery, magic, name, party, x, y);
    }

    public int mostWoundedHero(ArrayList<BaseHero> party){
        double residueHP = party.get(0).getHealth() / party.get(0).getMaxHealth();
        int indexWoundedHero = 0;
        for (int i = 1; i < party.size(); i++) {
            double hpLeftover = party.get(i).getHealth() / party.get(i).getMaxHealth();
            if (hpLeftover < residueHP){
                residueHP = hpLeftover;
                indexWoundedHero = i;
            }
        }
        return indexWoundedHero;
    }
    @Override
    public void step(ArrayList<BaseHero> party) {
        int indexWoundedHero = mostWoundedHero (party);
        int currentHPWoundedHero = party.get(indexWoundedHero).getHealth();
        int maxHPWoundedHero = party.get(indexWoundedHero).getMaxHealth();
        for (int i = 0; i < Math.abs(getDamage()[0]); i++) {
            if (currentHPWoundedHero + 1 < maxHPWoundedHero){
                currentHPWoundedHero += 1;
            }
        }
        party.get(indexWoundedHero).damage(getDamage()[0]);
    }
}