package S03.charClasses;

import java.util.ArrayList;

public class Xbowman extends BaseHero {
    public Xbowman(ArrayList<BaseHero> party, int x, int y) {        
        super(6, 3, 16, new int[]{2,3}, 10, 4, false, false, "Xbowman", party, x, y);
    }
}