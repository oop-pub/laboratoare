package Task1;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Lindt lindt_1 = new Lindt(1,2,3);
        Lindt lindt_2 = new Lindt(1,2,3);

        System.out.println(lindt_1.equals(lindt_2));

        CandyBox box_1 = new CandyBox("vanilie","franta");
        CandyBox box_2 = new CandyBox("cioco","germania");
        CandyBox box_3 = new CandyBox("mure","Romania");
        CandyBag bag = new CandyBag();
        bag.bag.add(box_1);
        bag.bag.add(box_2);
        bag.bag.add(box_3);

        Area a = new Area(bag,41,"Splaiul Independentei");
        a.Afisare();
        a.getBirthdayCard();
    }
}
