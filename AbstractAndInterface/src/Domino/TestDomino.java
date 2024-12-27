package Domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDomino {
    public static void main(String[] args) {
        Domino domino = new Domino(3, 5);
        Todo todo = new Todo();
        todo.addTask("Buy Milk", "low", true);
        todo.addTask("Take out the Trash", "high", false);
        todo.addTask("cook", "medium", false);
        domino.printAllFields();
        todo.printAllFields();

        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        Collections.sort(dominoes);
        for (int i = 0; i < dominoes.size(); i++) {
            System.out.print("[" + dominoes.get(i).getSideA() + ", " + dominoes.get(i).getSideB() + "]");
            if (!(i == dominoes.size() - 1)) {
                System.out.print(", ");
            }
        }
    }
}
