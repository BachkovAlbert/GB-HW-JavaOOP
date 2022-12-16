package S02;

import S02.charClasses.BaseHero;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String [] lineUp1 = new String [] {"Peasant", "Robber", "Sniper", "Wizard"};
        String [] lineUp2 = new String [] {"Peasant", "Spearman", "Xbowman", "Monk"};
        ArrayList<BaseHero> lightSide = Team.teamBuild(10, lineUp1);   /// gathering1 = lightSide
        ArrayList<BaseHero> darkSide = Team.teamBuild(10, lineUp2);
        System.out.println("\nКоманда 1:");
        lightSide.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\nКоманда 2:");
        darkSide.forEach(n -> System.out.println(n.getInfo())); 
    }
}
