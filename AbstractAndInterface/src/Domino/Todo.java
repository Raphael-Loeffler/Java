package Domino;

import java.util.ArrayList;
import java.util.List;

public class Todo implements Printable {
    private List<String> tasks;
    private List<String> priorities;
    private List<Boolean> done;
    public Todo() {
        this.tasks = new ArrayList<>();
        this.done = new ArrayList<>();
        this.priorities = new ArrayList<>();
    }
    public void addTask(String task, String priority, Boolean done) {
        this.tasks.add(task);
        this.priorities.add(priority);
        this.done.add(done);
    }
    @Override
    public void printAllFields() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Task: " + tasks.get(i) + " | Priority: " + priorities.get(i) + " | Done: " + done.get(i));
        }
    }
}
