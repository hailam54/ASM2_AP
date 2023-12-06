
package asm2ap;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class Report {
     // Instance variables
  private Worker worker; // The worker who generated the report
  private ArrayList<Task> tasks; // The list of tasks in the report

  // Constructor
  public Report(Worker worker) {
    this.worker = worker;
    this.tasks = new ArrayList<>();
  }

  // A method to add tasks to the report
  public void addTasks(ArrayList<Task> tasks) {
    this.tasks.addAll(tasks);
  }

  // A method to get the worker who generated the report
  public Worker getWorker() {
    return this.worker;
  }

  // A method to get the tasks in the report
  public ArrayList<Task> getTasks() {
    return this.tasks;
  }
}
