package S04;

import S04.charClasses.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator; 

public class Team {
    public static ArrayList<BaseHero> teamBuild(int teamCount, String [] lineUp, int x, int y) {      
        ArrayList<BaseHero> team = new ArrayList<>();
        Random rdm = new Random();
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

    public static void sortBySpeed(ArrayList<BaseHero> team) {
        Comparator<BaseHero> comp = new Comparator<>() {
            @Override
            public int compare(BaseHero h1, BaseHero h2) {
                return Integer.compare(h1.speed, h2.speed); 
            }
        };
        team.sort(comp.reversed());
    }
}