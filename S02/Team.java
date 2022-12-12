package S02;

import S01.charClasses.*;
import java.util.ArrayList;
import java.util.Random;

public class Team {
    public static ArrayList<Base> teamBuild(int teamCount) {
        Random rdm = new Random();
        ArrayList<Base> team = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            switch (rdm.nextInt(7)) {
                case 0 -> team.add(new Peasant());
                case 1 -> team.add(new Robber());
                case 2 -> team.add(new Sniper());
                case 3 -> team.add(new Wizard());
                case 4 -> team.add(new Spearman());
                case 5 -> team.add(new Xbowman());
                case 6 -> team.add(new Monk());
            }
        }
        return team;
    }

    public static void teamFilter(Base hero, ArrayList<Base> team) {
        for (Base pers : team) {
            if (pers.getClass() == hero.getClass()) System.out.println(pers);
        }
    }
}