package patternsProject.structuralPatterns.facade;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer solve problem");
        } else {
            System.out.println("Developer is reading Habarr.....");
        }
    }
}
