package S03.charClasses;

import java.util.ArrayList;

public class Wizard extends Monk {
    public Wizard(ArrayList<BaseHero> party) {
        super(17, 10, 0, new int[]{-5,-5}, 30, 9, false, true, "Wizard", party);
    }
}