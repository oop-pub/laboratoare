package Task1;

import java.util.ArrayList;

public class Area {
    private CandyBag bag;
    private int number;
    private String street;

    public Area(){
    }

    public Area(CandyBag bag, int number, String street) {
        this.bag = bag;
        this.number = number;
        this.street = street;
    }
    public void getBirthdayCard(){
        System.out.println("Strada:" + street + " Nr:" + number + '\n' + "La multi ani!" );

    }
    public void Afisare(){
        for(CandyBox box : bag.bag) {
            System.out.println(box.toString());
        }
    }

}
