package Examclouds.StudentAspirant;

public class Aspirant extends Enrollee {
    public String scientificWork;

    @Override
    public int getScholarship() {
        if(this.averageMark > 5){
            return 2500;
        }
        return 2200;
    }
}


