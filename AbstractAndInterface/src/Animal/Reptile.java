package Animal;

public class Reptile extends Animal {
    private String skinType;
    public Reptile(String name, char gender, int weight, int age, String skinType) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
        this.skinType = skinType;
    }
    public String getSkinType() {
        return this.skinType;
    }
    public String getName() {
        return this.name;
    }
    public String breed() {
        return  "laying eggs";
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