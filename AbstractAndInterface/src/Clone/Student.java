package Clone;

public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }
    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age +  " year old " + this.gender + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.");
    }
    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }
    public Student (String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }
    public Student() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }
    public Student clone() {
        return new Student(this.name, this.age, this.gender, this.previousOrganization);
    }
}