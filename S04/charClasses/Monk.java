package S04.charClasses;

import java.util.ArrayList;

public class Monk extends BaseHero {
    public Monk(ArrayList<BaseHero> party, int x, int y) {
        super(12, 7, 0, new int[]{-4,-4}, 30, 5, false, true, "Monk", party, x, y);
    }

    public Monk(int attack, int defence, int shots, int[] damage, int health, int speed, boolean delivery, boolean magic, String name, ArrayList<BaseHero> party, int x, int y){
        super(attack, defence, shots, damage, health, speed, delivery, magic, name, party, x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> nparty) {
        if (status.equals("dead")) return;
        double mostDamaged = party.get(0).maxHealth -
                party.get(0).health;
            int mostDamagedInd = 0;
            for (int i = 1; i < party.size(); i++) {
                if ((party.get(i).maxHealth -
                        party.get(i).health) > mostDamaged) {
                    mostDamaged = party.get(i).maxHealth -
                            party.get(i).health;
                    mostDamagedInd = i;
                }
            }
        party.get(mostDamagedInd).damage(damage[0]);
        party.get(mostDamagedInd).status = "stand"; 
    }
}