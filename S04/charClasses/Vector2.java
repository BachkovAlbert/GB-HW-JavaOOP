package S04.charClasses;

import S04.Main;

import java.util.ArrayList;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Vector2 {
    public int x, y;

    public Vector2 (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isSame(Vector2 pos) {
        return this.x == pos.x && this.y == pos.y;
    }

    public int distance(Vector2 pos) {
        return (int) sqrt(pow((pos.x - this.x), 2) + pow((pos.y - this.y), 2));
    }

    public BaseHero findNearest(ArrayList<BaseHero> nparty) {
        double dist = this.distance(nparty.get(0).position);
        int nearestInd = 0;
        for (int i = 1; i < nparty.size(); i++) {
            if (this.distance(nparty.get(i).position) < dist && !(nparty.get(i).status.equals("dead"))) {
                dist = this.distance(nparty.get(i).position);
                nearestInd = i;
            }
        }
        return nparty.get(nearestInd);
    }

    public boolean isValid(Vector2 pos, ArrayList<BaseHero> party) {
        for (BaseHero h : party) {
            if ((h.position.isSame(pos))
                    || (h.position.x >= Main.GANG_SIZE) || (h.position.y >= Main.GANG_SIZE))
                return false;
        }
        return true;
    }
}
