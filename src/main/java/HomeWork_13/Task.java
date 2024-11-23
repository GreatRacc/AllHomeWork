package HomeWork_13;

class Task implements Comparable<Task> {
    private final int id;
    private final String name;
    private final int priority;
    private final String category;

    private static int priorityByCategory(String category) {
        return switch (category.toLowerCase()) {
            case "баг" -> 1;
            case "фича" -> 2;
            case "документация" -> 3;
            default -> 4;
        };
    }

    public Task(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.priority = priorityByCategory(category);
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public int compareTo(Task o) {
        if (this.priority != o.priority) {
            return Integer.compare(this.priority, o.priority);
        }
        return this.category.compareTo(o.category);
    }

    @Override
    public String toString() {
        return "Задача по номеру поступления: " + id +
                ", содержание='" + name + '\'' +
                ", приоритет= '" + priority + '\'' +
                ", категория='" + category + '\'';
    }
}
