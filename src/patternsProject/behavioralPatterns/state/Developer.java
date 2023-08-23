package patternsProject.behavioralPatterns.state;

public class Developer{
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void changeActivity(){
        if (activity instanceof Sleep){
            this.activity = new Training();
        } else if (activity instanceof Training) {
            this.activity = new Codding();
        } else if (activity instanceof Codding) {
            this.activity = new Read();
        } else if (activity instanceof Read) {
            this.activity = new Sleep();
        }
    }

    public void justDoIt(){
        this.activity.justDoIt();
    }
}
