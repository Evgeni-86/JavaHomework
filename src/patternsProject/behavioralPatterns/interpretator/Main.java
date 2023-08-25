package patternsProject.behavioralPatterns.interpretator;

public class Main {
    public static void main(String[] args) {
        Expression javaDeveloper = getJavaExpression();
        Expression javaEEDeveloper = getJavaEEExpression();
        System.out.println(javaDeveloper.interpret("AAA"));
    }

    public static Expression getJavaExpression() {
        TerminalExpression java = new TerminalExpression("java");
        TerminalExpression javaCore = new TerminalExpression("javaCore");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        TerminalExpression java = new TerminalExpression("java");
        TerminalExpression javaEE = new TerminalExpression("javaEE");

        return new AndExpression(java, javaEE);
    }
}
