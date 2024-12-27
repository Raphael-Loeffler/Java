public class Sharpie {
    public String color;
    public int width;
    public int inkAmount;

    public Sharpie(String color, int width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }
    public void use() {
        this.inkAmount -= 10;
    }
    //for SharpieSet
    public Sharpie(int inkAmount) {
        this.inkAmount = inkAmount;
    }
}