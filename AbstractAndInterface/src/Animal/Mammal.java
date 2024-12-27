package Animal;

public class Mammal extends Animal {
    private String type;
    public Mammal(String name, char gender, int weight, int age, String type) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
        this.type = type;
    }
    public String getType() {
        return this.type;
    }
    public String getName() {
        return this.name;
    }
    public String breed() {
        return "pushing miniature versions out";
    }
    public char getGender() {
        return this.gender;
    }
    public int getWeight() {
        return this.weight;
    }
    public int getAge() {
        return this.age;
    }
}
