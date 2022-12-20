package S04.charClasses;

import java.util.ArrayList;

public class Peasant extends BaseHero {
    public Peasant(ArrayList<BaseHero> party, int x, int y) {
        super(1, 1, 0, new int[]{1,1}, 1, 3, true, false, "Peasant", party, x, y);
    }    
}