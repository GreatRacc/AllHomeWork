package HomeWork_13;

public class TaskMain {
    public static void main(String[] args) {
        TaskManager tasks = new TaskManager();
        tasks.addTask(new Task(1,"Добавить фичу в приложении", "Фича"));
        tasks.addTask(new Task(2,"Фикс бага в приложении", "Баг"));
        tasks.addTask(new Task(3,"Создать документацию для нового кода", "Документация"));
        tasks.addTask(new Task(4,"Фикс критического бага в приложении", "Баг"));
        tasks.addTask(new Task(5,"Поправить фичу в приложении", "Фича"));
        tasks.addTask(new Task(6,"Отдохнуть", "Прочее"));
        System.out.println("Задачи по приоритету:");
        tasks.displayTasks();
    }
}
