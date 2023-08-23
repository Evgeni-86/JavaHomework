package patternsProject.creationalPatterns.prototype;

public class TaskFactory {

    private Prototype prototype;

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    public Task cloneObject() {
        return (Task) prototype.copy();
    }
}
