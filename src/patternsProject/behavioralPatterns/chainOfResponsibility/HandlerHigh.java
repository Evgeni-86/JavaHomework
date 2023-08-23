package patternsProject.behavioralPatterns.chainOfResponsibility;

public class HandlerHigh implements Notifier{
    private TypeMessage typeMessage = TypeMessage.HIGH;
    private Notifier nextNotifier;

    public void setNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    @Override
    public void showMessage(String message, TypeMessage typeMessage) {
        if (typeMessage == this.typeMessage) {
            System.out.println("Message HIGH priority");
        } else {
            nextNotifier.showMessage(message, typeMessage);
        }
    }
}
