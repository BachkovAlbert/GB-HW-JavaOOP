package S03.charClasses;

import java.util.ArrayList;

public class Sniper extends BaseHero {
    public Sniper(ArrayList<BaseHero> party, int x, int y) {
        super(12, 10, 32, new int[]{8,10}, 15, 9, false, false, "Sniper", party, x, y);
    }
}