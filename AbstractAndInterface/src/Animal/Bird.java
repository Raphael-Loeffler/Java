package Animal;

public class Bird extends Animal {
    private String featherSize;
    public Bird(String name, char gender, int weight, int age, String featherSize) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
        this.featherSize = featherSize;
    }
    public String getFeatherSize() {
        return this.featherSize;
    }
    public String getName() {
        return this.name;
    }
    public String breed() {
        return "laying eggs";
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
