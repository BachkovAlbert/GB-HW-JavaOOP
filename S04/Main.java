package S04;

import S04.charClasses.BaseHero;
import java.util.ArrayList;

public class Main {
    public static final int GANG_SIZE = 10;
    static ArrayList<BaseHero> lightSide;
    static ArrayList<BaseHero> darkSide;
    public static void main(String[] args) { 
        String [] lineUp1 = new String [] {"Peasant", "Robber", "Sniper", "Wizard"};
        String [] lineUp2 = new String [] {"Peasant", "Spearman", "Xbowman", "Monk"};
        Main.lightSide = Team.teamBuild(10, lineUp1, 0, 0);   
        Main.darkSide = Team.teamBuild(10, lineUp2, 0, 9);
        ConsoleView.view(10);
        
    }
}
