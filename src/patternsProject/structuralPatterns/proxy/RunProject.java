package patternsProject.structuralPatterns.proxy;

public class RunProject {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://google");
        project.run();
    }
}
