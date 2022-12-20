package S03;

import S03.charClasses.*;
import java.util.ArrayList;
import java.util.Random;

public class Team {
    public static ArrayList<BaseHero> teamBuild(int teamCount, String [] lineUp, int x, int y) {
        Random rdm = new Random();
        ArrayList<BaseHero> team = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            switch (lineUp[rdm.nextInt(lineUp.length)]) {
                case "Peasant" -> team.add(new Peasant(team, x++, y));
                case "Robber" -> team.add(new Robber(team, x++, y));
                case "Sniper" -> team.add(new Sniper(team, x++, y));
                case "Wizard" -> team.add(new Wizard(team, x++, y));
                case "Spearman" -> team.add(new Spearman(team, x++, y));
                case "Xbowman" -> team.add(new Xbowman(team, x++, y));
                case "Monk" -> team.add(new Monk(team, x++, y));
            }
        }
        return team;
    }

    public static void teamFilter(BaseHero hero, ArrayList<BaseHero> team) {
        for (BaseHero pers : team) {
            if (pers.getClass() == hero.getClass()) System.out.println(pers.getInfo());
        }
    }
}