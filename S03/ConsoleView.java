package S03;

import java.util.Collections;

public class ConsoleView {
    public static void view(int teamSize) {

        System.out.println(
                "\u250c" + String.join("", Collections.nCopies(teamSize-1, "\u2500\u2500\u252c")) + "\u2500\u2510");

        for (int i = 1; i < teamSize; i++) {
            System.out.printf("\u2502%s", ConsoleView.getChar(i, 0, teamSize)+" ");
            for (int j = 1; j < teamSize; j++) {
                System.out.printf("\u2502%s", ConsoleView.getChar(i, j, teamSize));
            }
            System.out.printf("\u2502\n");

            System.out.println(
                    "\u251c" + String.join("", Collections.nCopies(teamSize-1, "\u2500\u2500\u253c")) + "\u2500\u2524");
        }

        System.out.printf("\u2502%s", ConsoleView.getChar(teamSize-1, 0, teamSize)+" ");
        for (int j = 1; j < teamSize; j++) {
            System.out.printf("\u2502%s", ConsoleView.getChar(teamSize-1, j, teamSize));
        }

        System.out.printf("\u2502\n", ConsoleView.getChar(teamSize-1, teamSize-1, teamSize));
        System.out.println(
                "\u2514" + String.join("", Collections.nCopies(teamSize-1, "\u2500\u2500\u2534")) + "\u2500\u2518");
    }

    private static String getChar(int x, int y, int teamSize) {
        String str = "  ";
        for (int i = 0; i < teamSize; i++) {
            if (Main.lightSide.get(i).isEqualPos(new int [] {x, y}))
                str = AnsiColors.ANSI_BLUE + Main.lightSide.get(i).getName().substring(0, 1)+AnsiColors.ANSI_RESET;
            if (Main.darkSide.get(i).isEqualPos(new int [] {x, y}))
                str = AnsiColors.ANSI_GREEN + Main.darkSide.get(i).getName().substring(0, 1)+AnsiColors.ANSI_RESET;
        }
        return str;
    }
}