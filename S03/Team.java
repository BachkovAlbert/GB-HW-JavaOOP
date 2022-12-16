package S03;

import S03.charClasses.*;
import java.util.ArrayList;
import java.util.Random;

public class Team {
    public static ArrayList<BaseHero> teamBuild(int teamCount, String [] lineUp) {
        Random rdm = new Random();
        ArrayList<BaseHero> team = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            switch (lineUp[rdm.nextInt(lineUp.length)]) {
                case "Peasant" -> team.add(new Peasant(team));
                case "Robber" -> team.add(new Robber(team));
                case "Sniper" -> team.add(new Sniper(team));
                case "Wizard" -> team.add(new Wizard(team));
                case "Spearman" -> team.add(new Spearman(team));
                case "Xbowman" -> team.add(new Xbowman(team));
                case "Monk" -> team.add(new Monk(team));
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