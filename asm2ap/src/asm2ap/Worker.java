
package asm2ap;

/**
 *
 * @author ADMIN
 */
public class Worker extends Manager {
      // Constructor
  public Worker(String name) {
    super(name);
  }

  // A method to add a task to the worker's list
  public void addTask(Task task) {
    super.assignTask(this, task);
  }

  // A method to check the progress of a task
  public void checkTaskProcess(Task task) {
    System.out.println("The task '" + task.getDescription() + "' is " + task.getStatus() + " and " + task.getProcess() + "% completed.");
  }

  // A method to update the status and process of a task
  public void updateTaskStatus(Task task, String status, int process) {
    task.setStatus(status);
    task.setProcess(process);
    System.out.println("The task '" + task.getDescription() + "' has been updated to " + status + " and " + process + "% completed.");
  }

  // A method to generate a report of the worker's tasks
  public Report generateReport() {
    Report report = new Report(this);
    report.addTasks(super.getTasks(this));
    return report;
  }
}
