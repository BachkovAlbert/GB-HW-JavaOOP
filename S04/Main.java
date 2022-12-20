package S04;

import S04.charClasses.BaseHero;

import java.util.ArrayList;
import java.io.IOException;

public class Main {
    public static final int TEAM_SIZE = 10;
    public static final int GANG_SIZE = 10;
    public static int step = 1;  
    static ArrayList<BaseHero> lightSide;
    static ArrayList<BaseHero> darkSide;
    public static void main(String[] args) throws IOException  { 
        String [] lineUp1 = new String [] {"Peasant", "Robber", "Sniper", "Wizard"};
        String [] lineUp2 = new String [] {"Peasant", "Spearman", "Xbowman", "Monk"};
        Main.lightSide = Team.teamBuild(Main.TEAM_SIZE, lineUp1, 0, 0);   
        Main.darkSide = Team.teamBuild(Main.TEAM_SIZE, lineUp2, 0, Main. GANG_SIZE - 1);

        do {
            Turn.orderBySpeed();
            System.out.println(ConsoleView.view());
            step++;    
        } while ((char) System.in.read() != 'Q');
    }
}
