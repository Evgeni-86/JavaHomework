package patternsProject.creationalPatterns.prototype;

public class Main {
    public static void main(String[] args) {
        TaskFactory taskFactory = new TaskFactory();

        Task task = new Task("AAA", "BBBBB");
        taskFactory.setPrototype(task);
        Task taskCopy = taskFactory.cloneObject();

        System.out.println(task);
        System.out.println(taskCopy);
        System.out.println(task == taskCopy);
    }
}
