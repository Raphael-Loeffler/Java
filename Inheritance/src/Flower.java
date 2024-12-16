public class Flower {
    private String color;
    private float waterAmount;
    public Flower(String color) {
        this.color = color;
        this.waterAmount = 0;
    }
    public void needWater() {
        if (this.waterAmount < 5) {
            System.out.println("The " + this.color + " Flower needs Water.");
        } else {
            System.out.println("The " + this.color + " Flower doesn't need Water.");
        }
    }
    public void water(float amount) {
        this.waterAmount += amount * 0.75f;
    }

    public float getWaterAmount() {
        return waterAmount;
    }
}
