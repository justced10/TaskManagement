public class Task {

    private String name;

    private Priority priority;



    // Constructor to initialize the task

    public Task(String name, Priority priority) {

        this.name = name;

        this.priority = priority;

    }



    // Method to display task details

    public void displayTaskDetails() {

        System.out.println("Task: " + name + " | Priority: " + priority + " (" + priority.getDescription() + ")");

    }



    // Getter for priority (used in sorting)

    public Priority getPriority() {

        return priority;

    }

}