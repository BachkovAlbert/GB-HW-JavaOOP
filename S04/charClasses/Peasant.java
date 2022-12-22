package S04.charClasses;

import java.util.ArrayList;

public class Peasant extends BaseHero {
    public Peasant(ArrayList<BaseHero> nparty, int x, int y) {
        super(1, 1, 0, new int[]{1,1}, 1, 3, true, false, "Peasant", nparty, x, y);
    }    

    @Override
    public void step(ArrayList<BaseHero> nparty){
        if (status.equals("dead")) return;
        if (status.equals("used")) status = "stand";
    }
}