public class Teacher {
    public void giveAnswer() {
        System.out.println("The teacher is answering the Question");
    }
    public void teach(Student student) {
        student.learn();
    }
}
