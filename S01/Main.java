package S01;

import S01.charClasses.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Base> listClasses = new ArrayList<>();
        listClasses.add(new Peasant());
        listClasses.add(new Robber());
        listClasses.add(new Sniper());
        listClasses.add(new Wizard());
        listClasses.add(new Spearman());
        listClasses.add(new Xbowman());
        listClasses.add(new Monk());

        listClasses.forEach(n -> System.out.println(n));   // listClasses.forEach(System.out::println);
        
        System.out.println("\n---Отбор из 50 персонажей тех кто соответсвует указанному классу:---");
        int teamCount = 50;
        ArrayList<Base> team = Team.teamBuild(teamCount);
        Team.teamFilter(new Wizard(), team);
        Team.teamFilter(new Monk(), team);
    }
}
