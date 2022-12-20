package S04.charClasses;

import java.util.ArrayList;

public class Robber extends Xbowman{
    public Robber(ArrayList<BaseHero> party, int x, int y) {
        super(8, 3, 0, new int[]{2,4}, 10, 6, false, false, "Robber", party, x, y);
    }    
}