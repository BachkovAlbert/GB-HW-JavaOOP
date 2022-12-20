package S04;

public class Turn {
    public static void orderBySpeed() {
        if (Main.step == 1) {
            Team.sortBySpeed(Main.lightSide);
            Team.sortBySpeed(Main.darkSide);
        } else {
            Main.lightSide.forEach(n -> n.step(Main.darkSide));
            Main.darkSide.forEach(n -> n.step(Main.lightSide));
        }
    }
}
