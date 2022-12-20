package S04.charClasses;

import java.util.ArrayList;

public class Spearman extends BaseHero {
    public Spearman(ArrayList<BaseHero> party, int x, int y) {
        super(4, 5, 0, new int[]{1,3}, 10, 4, false, false, "Spearman", party, x, y);
    }
}
