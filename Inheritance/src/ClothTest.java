import java.util.Arrays;
import java.util.List;

public class ClothTest {
    public static void main(String[] args) {
        List<Cloth> clothes = Arrays.asList(new Cloth("blue", 1, "overwear"), new Cloth("red", "underwear"), new Cloth("yellow", "overwear"), new Cloth("black", 0, "underwear"));
        Wardrobe wardrobe = new Wardrobe();
        for (Cloth cloth: clothes) {
            wardrobe.addCloth(cloth);
        }
        wardrobe.printInfo();
        clothes.getFirst().wear();
        clothes.getFirst().wear();
        clothes.getFirst().wear();
        clothes.getFirst().wear();
        clothes.getFirst().wear();
        clothes.getFirst().wear();
        System.out.println(clothes.getFirst().needsToBeWashed());
        clothes.getFirst().wash();
        System.out.println(clothes.getFirst().needsToBeRepaired());
        System.out.println(wardrobe.purge());
    }
}
