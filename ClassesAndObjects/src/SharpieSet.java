import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    public List<Sharpie> listOfSharpies = new ArrayList<>();
    public void add(Sharpie sharpie) {
        this.listOfSharpies.add(sharpie);
    }
    public int countUsable() {
        int usable = 0;
        for (Sharpie IteratorSharpie: this.listOfSharpies) {
            if (IteratorSharpie.inkAmount > 0) {
                usable++;
            }
        }
        return usable;
    }
    public void removeTrash() {
        for (int i = 0; i < this.listOfSharpies.size(); i++) {
            if (this.listOfSharpies.get(i).inkAmount == 0) {
                this.listOfSharpies.remove(i);
                i--;
            }
        }
    }
}
