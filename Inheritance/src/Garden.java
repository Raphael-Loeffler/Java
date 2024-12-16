import java.util.List;

public class Garden {
    private List<Flower> flowers;
    private List<Tree> trees;
    public void water(int amount) {
        int plantsWhoNeedWater = 0;
        for (Flower iterator: this.flowers) {
            if (iterator.getWaterAmount() < 5) {
                plantsWhoNeedWater++;
            }
        }
        for (Tree iterator: this.trees) {
            if (iterator.getWaterAmount() < 10) {
                plantsWhoNeedWater++;
            }
        }
        for (Flower iterator: this.flowers) {
            if (iterator.getWaterAmount() < 5) {
                iterator.water(amount / plantsWhoNeedWater);
            }
        }
        for (Tree iterator: this.trees) {
            if (iterator.getWaterAmount() < 10) {
                iterator.water(amount / plantsWhoNeedWater);
            }
        }
        System.out.println("Watering the plants with " + amount);
    }
    public Garden(List<Flower> flowers, List<Tree> trees) {
        this.flowers = flowers;
        this.trees = trees;
    }
    public void represent() {
        for (Flower iterator: this.flowers) {
            iterator.needWater();
        }
        for (Tree iterator: this.trees) {
            iterator.needWater();
        }
    }
}
