package patternsProject.behavioralPatterns.templateMethod;

public abstract class WebsiteSample {
    public void showPage(){
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    protected void showPageContent(){}
}
