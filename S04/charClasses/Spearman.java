package S04.charClasses;

import java.util.ArrayList;

public class Spearman extends BaseHero {
    public Spearman(ArrayList<BaseHero> party, int x, int y) {
        super(4, 5, 0, new int[]{1,3}, 10, 4, false, false, "Spearman", party, x, y);
    }

    public Spearman(int attack, int defence, int shots, int[] damage, int health, int speed, boolean delivery, boolean magic, String name, ArrayList<BaseHero> party, int x, int y){
        super(attack, defence, shots, damage, health, speed, delivery, magic, name, party, x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> nparty) {
        if (status.equals("dead")) return;
        BaseHero target = position.findNearest(nparty);
        if (position.distance(target.position) <= (int) Math.sqrt(2)) {
            target.damage(damage[1]);
            return;
        }
        if (target.position.x < position.x && position.isValid(new Vector2(--position.x, position.y), party)) {
            --position.x;
            return;
        }
        if (target.position.x > position.x && position.isValid(new Vector2(++position.x, position.y), party)) {
            ++position.x;
            return;
        }
        if (target.position.y < position.y && position.isValid(new Vector2(position.x, --position.y), party)) {
            --position.y;
            return;
        }
        if (target.position.y > position.y && position.isValid(new Vector2(position.x, ++position.y), party)) {
            ++position.y;
        }
    }
}
