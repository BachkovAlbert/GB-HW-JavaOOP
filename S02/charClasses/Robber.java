package S02.charClasses;

import java.util.ArrayList;

public class Robber extends BaseHero{
    public Robber(ArrayList<BaseHero> party) {
        super(8, 3, 0, new int[]{2,4}, 10, 6, false, false, "Robber", party);
    }
}