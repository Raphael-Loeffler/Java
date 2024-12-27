import java.util.ArrayList;
import java.util.List;

public class Farm {
    public List<Animal> listOfAnimals = new ArrayList<>();
    private int limit;
    public Farm(int limit) {
        this.limit = limit;
    }
    public void breed() {
        if (this.listOfAnimals.size() < this.limit) {
            this.listOfAnimals.add(new Animal());
        } else {
            System.out.println("Not enough space in the Farm!");
        }
    }
    public void sell() {
        int leastHungry = this.listOfAnimals.getFirst().hunger;
        int winningIndex = 0;
        for (int i = 1; i < this.listOfAnimals.size(); i++) {
            if (this.listOfAnimals.get(i).hunger < leastHungry) {
                leastHungry = this.listOfAnimals.get(i).hunger;
                winningIndex = i;
            }
        }
        this.listOfAnimals.remove(winningIndex);
    }
}
