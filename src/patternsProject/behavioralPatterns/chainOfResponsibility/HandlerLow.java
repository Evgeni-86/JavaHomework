package patternsProject.behavioralPatterns.chainOfResponsibility;

public class HandlerLow implements Notifier {
    private TypeMessage typeMessage = TypeMessage.LOW;
    private Notifier nextNotifier;

    public void setNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    @Override
    public void showMessage(String message, TypeMessage typeMessage) {
        if (typeMessage == this.typeMessage) {
            System.out.println("Message LOW priority");
        } else {
            nextNotifier.showMessage(message, typeMessage);
        }
    }
}
