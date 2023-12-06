
package asm2ap;

/**
 *
 * @author ADMIN
 */
public class Task {

    // Instance variables
    private String description; // The description of the task
    private String status; // The status of the task (e.g. pending, in progress, completed)
    private int process; // The percentage of the task completed

    // Constructor
    public Task(String description) {
        this.description = description;
        this.status = "pending";
        this.process = 0;
    }

    // Getter methods
    public String getDescription() {
        return this.description;
    }

    public String getStatus() {
        return this.status;
    }

    public int getProcess() {
        return this.process;
    }

    // Setter methods
    public void setStatus(String status) {
        this.status = status;
    }

    public void setProcess(int process) {
        this.process = process;
    }
}