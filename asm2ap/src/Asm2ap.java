
import asm2ap.Manager;
import asm2ap.Task;
import asm2ap.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class Asm2ap {

    public static int showMenu() {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Display the menu options
        System.out.println("Welcome to the Task Manager!");
        System.out.println("1. Create a new worker");
        System.out.println("2. Create a new task");
        System.out.println("3. Assign a task to a worker");
        System.out.println("4. Remove a task from a worker");
        System.out.println("5. Update the status and process of a task");
        System.out.println("6. Check the progress of a task");
        System.out.println("7. Exit");
        System.out.print("Please choose an option: ");

        // Get the user's choice
        int choice = sc.nextInt();

        // Return the choice
        return choice;
    }

    // The main method
    public static void main(String[] args) {
        
        // Create a Manager object
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager("Bob");

        // Create an ArrayList to store the workers
        ArrayList<Worker> workers = new ArrayList<>();

        // Create an ArrayList to store the tasks
        ArrayList<Task> tasks = new ArrayList<>();

        // A boolean variable to control the loop
        boolean running = true;

        // A loop to run the menu until the user chooses to exit
        while (running) {
            // Get the user's choice from the menu
            int choice = showMenu();

            // Perform different actions based on the choice
            switch (choice) {
                case 1:
                    // Create a new worker
                    System.out.println("Enter the name of the worker:");
                    String name = sc.nextLine();
                    Worker worker = new Worker(name);
                    workers.add(worker);
                    System.out.println("A new worker named " + name + " has been created.");
                    break;
                case 2:
                    // Create a new task
                    System.out.println("Enter the description of the task:");
                    String description = sc.nextLine();
                    Task task = new Task(description);
                    tasks.add(task);
                    System.out.println("A new task with description '" + description + "' has been created.");
                    break;
                case 3:
                    // Assign a task to a worker
                    System.out.println("Enter the ID of the worker (starting from 0):");
                    int workerIndex = sc.nextInt();
                    System.out.println("Enter the ID of the task (starting from 0):");
                    int taskIndex = sc.nextInt();
                    if (workerIndex >= 0 && workerIndex < workers.size() && taskIndex >= 0 && taskIndex < tasks.size()) {
                        Worker w = workers.get(workerIndex);
                        Task t = tasks.get(taskIndex);
                        manager.assignTask(w, t);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    // Remove a task from a worker
                    System.out.println("Enter the ID of the worker (starting from 0):");
                    int workerIndex1 = sc.nextInt();
                    System.out.println("Enter the ID of the task (starting from 0):");
                    int taskIndex1 = sc.nextInt();
                    if (workerIndex1 >= 0 && workerIndex1 < workers.size() && taskIndex1 >= 0 && taskIndex1 < tasks.size()) {
                        Worker w = workers.get(workerIndex1);
                        Task t = tasks.get(taskIndex1);
                        manager.removeTask(w, t);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 5:
                    // Update the status and process of a task
                    System.out.println("Enter the ID of the worker (starting from 0):");
                    int workerIndex2 = sc.nextInt();
                    System.out.println("Enter the ID of the task (starting from 0):");
                    int taskIndex2 = sc.nextInt();
                    if (workerIndex2 >= 0 && workerIndex2 < workers.size() && taskIndex2 >= 0 && taskIndex2 < tasks.size()) {
                        Worker w = workers.get(workerIndex2);
                        Task t = tasks.get(taskIndex2);
                        System.out.println("Enter the new status of the task:");
                        String status = sc.nextLine();
                        System.out.println("Enter the new process of the task (0-100):");
                        int process = sc.nextInt();
                        w.updateTaskStatus(t, status, process);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 6:
                    // Check the progress of a task
                    System.out.println("check report about work progress:");
                    System.out.println("Enter the ID of the worker (starting from 0):");
                    int workerIndex3 = sc.nextInt();
                    System.out.println("Enter the ID of the task (starting from 0):");
                    int taskIndex3 = sc.nextInt();
                    if (workerIndex3 >= 0 && workerIndex3 < workers.size() && taskIndex3 >= 0 && taskIndex3 < tasks.size()) {
                        Worker w = workers.get(workerIndex3);
                        Task t = tasks.get(taskIndex3);
                        w.checkTaskProcess(t);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                
                case 7:
                    // Exit the program
                    System.out.println("Thank you for using the Task Manager. Goodbye!");
                    running = false;
                    break;
                default:
                    // Invalid choice
                    System.out.println("Please enter a valid option.");
                    break;
                    
            }
        }
    }
}
