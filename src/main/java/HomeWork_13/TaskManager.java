package HomeWork_13;

import java.util.PriorityQueue;

class TaskManager {
    private final PriorityQueue<Task> taskQueue;

    public TaskManager() {
        taskQueue = new PriorityQueue<>();
    }

    public void addTask(Task task) {
        taskQueue.offer(task);
    }

    public void displayTasks() {
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}
