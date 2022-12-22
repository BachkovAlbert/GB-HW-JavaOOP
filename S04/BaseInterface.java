package S04;

import S04.charClasses.BaseHero;
import java.util.ArrayList;

public interface BaseInterface{
    void step(ArrayList<BaseHero> nparty);
    String getInfo();
}