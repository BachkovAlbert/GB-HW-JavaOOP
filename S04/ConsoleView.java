package S04;

import S04.charClasses.Vector2;

import java.util.Collections;

public class ConsoleView {
    private static StringBuilder view = new StringBuilder();
    public static StringBuilder view(){  
        if (Main.step == 1) {
            view.append(AnsiColors.ANSI_RED);
            view.append("First step!");
            view.append(AnsiColors.ANSI_RESET);
            view.append("\n");
        }
        else{
            view.append(AnsiColors.ANSI_RED);
            view.append("Step: ");
            view.append(Main.step);
            view.append(AnsiColors.ANSI_RESET);
            view.append("\n");
        }

        //Отображение  верхней части поля
        view.append("\u250c");
        view.append(String.join("", Collections.nCopies(Main.GANG_SIZE-1, "\u2500\u2500\u252c")));
        view.append("\u2500\u2500\u2510\n");

        //Отображение  средней части поля
        for (int i = 0; i < Main.GANG_SIZE; i++) {
            ConsoleView.getCharFull(i);
            view.append("\u251c");
            view.append(String.join("", Collections.nCopies(Main.GANG_SIZE-1, "\u2500\u2500\u253c")));
            view.append("\u2500\u2500\u2524\n");
        }
        //Отоборажение нижней части поля
        ConsoleView.getCharFull(Main.GANG_SIZE-1);
        view.append("\u2514");
        view.append(String.join("", Collections.nCopies(Main.GANG_SIZE-1, "\u2500\u2500\u2534")));
        view.append("\u2500\u2500\u2518\n");
        view.append("Press ENTER to continue. Press Q to exit\n");
        return view;
    }

    private static StringBuilder charInfo = new StringBuilder();
    private static void getChar(int x, int y) {
        for (int i = 0; i < Main.TEAM_SIZE; i++) {
            if (Main.lightSide.get(i).getPosition().isSame(new Vector2(x, y))) {
                if (Main.lightSide.get(i).getStatus().equals("dead")) {
                    view.append(AnsiColors.ANSI_RED);
                    view.append(Main.lightSide.get(i).getName(), 0, 2);
                    view.append(AnsiColors.ANSI_RESET);
                    charInfo.append("    ");
                    charInfo.append(AnsiColors.ANSI_RED);
                    charInfo.append(Main.lightSide.get(i).getName());
                    charInfo.append(" HP: ");
                    charInfo.append(Main.lightSide.get(i).getHealth());
                    charInfo.append(", Status: ");
                    charInfo.append(Main.lightSide.get(i).getStatus());
                    charInfo.append(AnsiColors.ANSI_RESET);
                    return;
                }
                else {
                    view.append(AnsiColors.ANSI_BLUE);
                    view.append(Main.lightSide.get(i).getName(), 0, 2);
                    view.append(AnsiColors.ANSI_RESET);
                    charInfo.append("    ");
                    charInfo.append(AnsiColors.ANSI_BLUE);
                    charInfo.append(Main.lightSide.get(i).getName());
                    charInfo.append(" HP: ");
                    charInfo.append(Main.lightSide.get(i).getHealth());
                    charInfo.append(", Status: ");
                    charInfo.append(Main.lightSide.get(i).getStatus());
                    charInfo.append(AnsiColors.ANSI_RESET);
                    return;
                }
            }
            if (Main.darkSide.get(i).getPosition().isSame(new Vector2(x, y))) {
                if (Main.darkSide.get(i).getStatus().equals("dead")) {
                    view.append(AnsiColors.ANSI_RED);
                    view.append(Main.darkSide.get(i).getName(), 0, 2);
                    view.append(AnsiColors.ANSI_RESET);
                    charInfo.append("    ");
                    charInfo.append(AnsiColors.ANSI_RED);
                    charInfo.append(Main.darkSide.get(i).getName());
                    charInfo.append(" HP: ");
                    charInfo.append(Main.darkSide.get(i).getHealth());
                    charInfo.append(", Status: ");
                    charInfo.append(Main.darkSide.get(i).getStatus());
                    charInfo.append(AnsiColors.ANSI_RESET);
                    return;
                }
                else {
                    view.append(AnsiColors.ANSI_GREEN);
                    view.append(Main.darkSide.get(i).getName(), 0, 2);
                    view.append(AnsiColors.ANSI_RESET);
                    charInfo.append("    ");
                    charInfo.append(AnsiColors.ANSI_GREEN);
                    charInfo.append(Main.darkSide.get(i).getName());
                    charInfo.append(" HP: ");
                    charInfo.append(Main.darkSide.get(i).getHealth());
                    charInfo.append(", Status: ");
                    charInfo.append(Main.darkSide.get(i).getStatus());
                    charInfo.append(AnsiColors.ANSI_RESET);
                    return;
                }
            }
        }
        view.append("  ");
    }

    public static void getCharFull (int x) {
        view.append("\u2502");
        ConsoleView.getChar(x, 0);
        for (int y = 1; y < Main.GANG_SIZE; y++) {
            view.append("\u2502");
            ConsoleView.getChar(x, y);
        }
        view.append(String.format("\u2502%s\n", charInfo));
        charInfo.delete(0, charInfo.length());
    }
}