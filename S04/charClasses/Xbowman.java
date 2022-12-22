package S04.charClasses;

import java.util.ArrayList;

public class Xbowman extends BaseHero {
    public Xbowman(ArrayList<BaseHero> party, int x, int y) {        
        super(6, 3, 16, new int[]{2,3}, 10, 4, false, false, "Xbowman", party, x, y);  
    }

    public Xbowman(int attack, int defence, int shots, int[] damage, int health, int speed, boolean delivery, boolean magic, String name, ArrayList<BaseHero> party, int x, int y){
        super(attack, defence, shots, damage, health, speed, delivery, magic, name, party, x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> nparty) {
        if (status.equals("dead")) return;
        for (BaseHero h: party) {
            if (h.name.equals("Peasant") && h.status.equals("stand")) {
                shots++;
                h.status = "used";
                break;
            }
        }
        if (shots<1) {status = "used"; return;};
        BaseHero target = position.findNearest(nparty);
        double dist = position.distance(target.position);
        target.damage((dist < speed ?
                super.damageValue(target) :
                (super.damageValue(target)/2)));
        shots--;
        }
}