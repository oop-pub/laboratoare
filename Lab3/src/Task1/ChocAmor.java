package Task1;

public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor(){ }

    public ChocAmor(float length) {
        super();
        this.length = length;
    }

    public float getVolume() {
        return length * length * length;
    }

    public void printChocAmorDim() {
        System.out.println("length="+ length);
    }
    public String toString() {
        return "The" + super.toString() + "has volume " +  getVolume();
    }
}
