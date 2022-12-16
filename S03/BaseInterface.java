package S03;

import S03.charClasses.BaseHero;
import java.util.ArrayList;

public interface BaseInterface{
    
    void step(ArrayList<BaseHero> party);

    String getInfo();
}