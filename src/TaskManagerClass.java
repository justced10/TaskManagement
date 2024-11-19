import java.util.*;

public class TaskManager {

    public static void main(String[] args) {

        // Create a list of tasks

        List<Task> tasks = new ArrayList<>();



        tasks.add(new Task("Finish project report", Priority.HIGH));

        tasks.add(new Task("Check emails", Priority.MEDIUM));

        tasks.add(new Task("Buy groceries", Priority.LOW));

        tasks.add(new Task("Schedule team meeting", Priority.HIGH));

        tasks.add(new Task("Clean the house", Priority.MEDIUM));



        // Sort tasks by priority (from HIGH to LOW)

        tasks.sort((task1, task2) -> task2.getPriority().ordinal() - task1.getPriority().ordinal());



        // Display sorted tasks

        System.out.println("Tasks sorted by priority (HIGH to LOW):");

        for (Task task : tasks) {

            task.displayTaskDetails();

        }

    }

}


