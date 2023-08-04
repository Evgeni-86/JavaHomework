package Examclouds.StudentAspirant;

public class Student extends Enrollee {
    public String group;

    @Override
    public int getScholarship() {
        if(this.averageMark > 5){
            return 2000;
        }
        return 1900;
    }
}
