package patternsProject.structuralPatterns.facade;

public class Workflove {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblem(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }

}
