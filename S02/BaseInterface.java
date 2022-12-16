package S02;

import S02.charClasses.BaseHero;
import java.util.ArrayList;

public interface BaseInterface{
    
    void step(ArrayList<BaseHero> party);

    String getInfo();
}