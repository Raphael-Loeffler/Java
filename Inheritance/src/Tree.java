public class Tree {
    private String color;
    private float waterAmount;
    public Tree(String color) {
        this.color = color;
        this.waterAmount = 0;
    }
    public void needWater() {
        if (this.waterAmount < 10) {
            System.out.println("The " + this.color + " Tree needs Water.");
        } else {
            System.out.println("The " + this.color + " Tree doesn't need Water.");
        }
    }
    public void water(float amount) {
        this.waterAmount += amount * 0.40f;
    }

    public float getWaterAmount() {
        return waterAmount;
    }
}
