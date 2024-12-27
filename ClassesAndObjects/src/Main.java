import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //BlogPost --- BEGIN ---
        BlogPost johnDoe = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        BlogPost timUrban = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        BlogPost williamTurton = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");
        System.out.println(johnDoe.authorName+ " - " + johnDoe.title + " - " + johnDoe.text + " - " + johnDoe.publicationDate);
        System.out.println(timUrban.authorName+ " - " + timUrban.title + " - " + timUrban.text + " - " + timUrban.publicationDate);
        System.out.println(williamTurton.authorName+ " - " + williamTurton.title + " - " + williamTurton.text + " - " + williamTurton.publicationDate);
        //BlogPost --- END ---
        //Animal --- BEGIN ---
        Animal panther = new Animal();
        panther.drink();
        panther.eat();
        System.out.println("Thirst: " + panther.thirst + " Hunger: " + panther.hunger);
        panther.play();
        panther.play();
        System.out.println("Thirst: " + panther.thirst + " Hunger: " + panther.hunger);
        //Animal --- END ---
        //Sharpie -- BEGIN ---
        Sharpie sharpie = new Sharpie("black", 5);
        System.out.println("Ink BEFORE: " + sharpie.inkAmount);
        sharpie.use();
        System.out.println("Ink AFTER: " + sharpie.inkAmount);
        //Sharpie --- END ---
        //TeacherStudent --- BEGIN ---
        Teacher teacher = new Teacher();
        Student student = new Student();
        student.question(teacher);
        teacher.teach(student);
        //TeacherStudent --- END ---
        //PetrolStation --- BEGIN ---
        Car car = new Car();
        Station station = new Station(1000);
        System.out.println("Gas amount Station BEFORE: " + station.gasAmount);
        System.out.println("Gas amount Car BEFORE: " + car.gasAmount);
        station.refill(car);
        System.out.println("Gas amount Station AFTER refill: " + station.gasAmount);
        System.out.println("Gas amount Car AFTER refill: " + car.gasAmount);
        //PetrolStation --- END ---
        //SharpieSet --- BEGIN ---
        Sharpie s1 = new Sharpie(100);
        Sharpie s2 = new Sharpie(0);
        Sharpie s3 = new Sharpie(0);
        Sharpie s4 = new Sharpie(100);
        Sharpie s5 = new Sharpie(0);
        SharpieSet sharpieSet = new SharpieSet();
        sharpieSet.add(s1);
        sharpieSet.add(s2);
        sharpieSet.add(s3);
        sharpieSet.add(s4);
        sharpieSet.add(s5);
        System.out.println("SharpieSet BEFORE: ");
        for (Sharpie iteratorSharpie: sharpieSet.listOfSharpies) {
            System.out.print(iteratorSharpie.inkAmount + "   ");
        }
        System.out.println();
        System.out.println("SharpieSet usable: " + sharpieSet.countUsable());
        sharpieSet.removeTrash();
        System.out.println("SharpieSet AFTER: ");
        for (Sharpie iteratorSharpie: sharpieSet.listOfSharpies) {
            System.out.print(iteratorSharpie.inkAmount + "   ");
        }
        System.out.println();
        //SharpieSet --- END ---
        //Farm --- BEGIN ---
        Farm farm = new Farm(10);
        farm.breed();
        farm.breed();
        farm.breed();
        farm.breed();
        farm.breed();
        farm.breed();
        farm.breed();
        farm.breed(); //bred eight times
        System.out.println(farm.listOfAnimals);
        farm.breed();
        farm.breed();
        System.out.println(farm.listOfAnimals);
        farm.breed();
        for (Animal animal: farm.listOfAnimals) {
            System.out.print(" " + animal.hunger + " ");
        }
        System.out.println();
        farm.listOfAnimals.get(0).play();
        farm.listOfAnimals.get(1).play();
        farm.listOfAnimals.get(2).play();
        farm.listOfAnimals.get(3).play();
        for (Animal animal: farm.listOfAnimals) {
            System.out.print(" " + animal.hunger + " ");
        }
        System.out.println();
        farm.sell();
        farm.sell();
        for (Animal animal: farm.listOfAnimals) {
            System.out.print(" " + animal.hunger + " ");
        }
        System.out.println();
        //Farm --- END ---
        //Blog --- BEGIN ---
        Blog blog = new Blog();
        blog.add(johnDoe);
        blog.add(timUrban);
        blog.add(williamTurton);
        for (BlogPost blogPost: blog.listOfBlogs) {
            System.out.print(blogPost.authorName + " - ");
        }
        System.out.println();
        blog.update(0, williamTurton);
        for (BlogPost blogPost: blog.listOfBlogs) {
            System.out.print(blogPost.authorName + " - ");
        }
        System.out.println();
        blog.delete(0);
        for (BlogPost blogPost: blog.listOfBlogs) {
            System.out.print(blogPost.authorName + " - ");
        }
        System.out.println();
        //Blog --- END ---
    }
}
