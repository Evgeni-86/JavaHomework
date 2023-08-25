package patternsProject.creationalPatterns.prototype;

public class Task implements Prototype {
    String name;
    String description;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Object copy() {
        Task taskCopy = new Task(name, description);
        return taskCopy;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
