package Task1;


public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public Lindt(){ }
    public Lindt(float length, float width, float height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getVolume() {

        return height * length * width;
    }

    public void printLindtDim() {
        System.out.println("length=" + length + ", width=" + width + ", height=" + height );

    }

    public String toString() {
        return "The" + super.toString() + "has volume " +  getVolume();
    }
}
