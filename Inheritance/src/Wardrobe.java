import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    private List<Cloth> clothes = new ArrayList<>();
    public void  addCloth(Cloth cloth) {
        this.clothes.add(cloth);
    }
    public void printInfo() {
        for (Cloth cloth: this.clothes) {
            System.out.println(cloth.getInfo());
        }
    }
    public void washAllClothes() {
        for (Cloth cloth: this.clothes) {
            if (cloth.needsToBeWashed()) {
                cloth.wash();
            }
        }
    }
    public void repairAllClothes() {
        for (Cloth cloth: this.clothes) {
            if (cloth.needsToBeRepaired()) {
                cloth.repair();
            }
        }
    }
    public List<Cloth> purge() {
        List<Cloth> purged = new ArrayList<>();
        for (int i = 0; i < clothes.size(); i++) {
            if (this.clothes.get(i).getCondition() == 0) {
                purged.add(this.clothes.get(i));
                this.clothes.remove(i);
            }
        }
        return purged;
    }
}
