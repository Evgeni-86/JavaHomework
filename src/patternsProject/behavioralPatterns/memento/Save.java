package patternsProject.behavioralPatterns.memento;

public class Save {
    final private String level;
    final private int time;

    public Save(String level, int time) {
        this.level = level;
        this.time = time;
    }

    public String getLevel() {
        return level;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Save{" +
                "level='" + level + '\'' +
                ", time=" + time +
                '}';
    }
}
