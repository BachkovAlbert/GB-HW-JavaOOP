package S02.charClasses;

import java.util.ArrayList;

public class Peasant extends BaseHero {
    public Peasant(ArrayList<BaseHero> party) {
        super(1, 1, 0, new int[]{1,1}, 1, 3, true, false, "Peasant", party);
    }    
}