package patternsProject.behavioralPatterns.chainOfResponsibility;

public class HandlerMedium implements Notifier{
    private TypeMessage typeMessage = TypeMessage.MEDIUM;
    private Notifier nextNotifier;

    public void setNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    @Override
    public void showMessage(String message, TypeMessage typeMessage) {
        if (typeMessage == this.typeMessage) {
            System.out.println("Message MEDIUM priority");
        } else {
            nextNotifier.showMessage(message, typeMessage);
        }
    }
}
