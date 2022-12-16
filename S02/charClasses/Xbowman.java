package S02.charClasses;

import java.util.ArrayList;

public class Xbowman extends BaseHero {
    public Xbowman(ArrayList<BaseHero> party) {        
        super(6, 3, 16, new int[]{2,3}, 10, 4, false, false, "Xbowman", party);
    }
}