package Task1;

public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli(){ }

    public Baravelli(float radius, float height) {
        super();
        this.radius = radius;
        this.height = height;
    }
    public float getVolume() {
        return (float) (3.14 * radius * radius * height);
    }
    public void printBaravelli() {
        System.out.println("radius=" + radius + ", height=" + height);
    }
    public String toString() {
        return "The" + super.toString() + "has volume " +  getVolume();
    }
}
