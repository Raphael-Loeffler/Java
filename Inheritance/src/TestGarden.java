import java.util.Arrays;
import java.util.List;

public class TestGarden {
    public static void main(String[] args) {
        List<Flower> flowers = Arrays.asList(new Flower("yellow"), new Flower("blue"));
        List<Tree> trees = Arrays.asList(new Tree("purple"), new Tree("orange"));
        Garden garden = new Garden(flowers, trees);
        garden.represent();
        System.out.println();
        garden.water(40);
        garden.represent();
        System.out.println();
        garden.water(70);
        garden.represent();
    }
}
