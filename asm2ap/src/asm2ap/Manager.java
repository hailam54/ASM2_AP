
package asm2ap;
import java.util.ArrayList;
import java.util.HashMap;


public class Manager {
    // Instance variables

    private String name; // The name of the manager
    private HashMap<Worker, ArrayList<Task>> tasks; // A map of workers and their assigned tasks

    // Constructor
    public Manager(String name) {
        this.name = name;
        this.tasks = new HashMap<>();
    }

    // Getter methods
    public String getName() {
        return this.name;
    }

    public ArrayList<Task> getTasks(Worker worker) {
        return this.tasks.get(worker);
    }

    // A method to assign a task to a worker
    public void assignTask(Worker worker, Task task) {
        if (!this.tasks.containsKey(worker)) {
            this.tasks.put(worker, new ArrayList<>());
        }
        this.tasks.get(worker).add(task);
        System.out.println("The task '" + task.getDescription() + "' has been assigned to " + worker.getName() + ".");
    }

    // A method to remove a task from a worker
    public void removeTask(Worker worker, Task task) {
        if (this.tasks.containsKey(worker)) {
            this.tasks.get(worker).remove(task);
            System.out.println("The task '" + task.getDescription() + "' has been removed from " + worker.getName() + ".");
        } else {
            System.out.println("The worker " + worker.getName() + " does not have any tasks assigned.");
        }
    }
}