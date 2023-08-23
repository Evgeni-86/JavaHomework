package patternsProject.behavioralPatterns.templateMethod;

public class Main {
    public static void main(String[] args) {
        WebsiteSample newsPage = new NewsPage();
        WebsiteSample welcomePage = new WelcomePage();

        newsPage.showPage();
        welcomePage.showPage();
    }
}
