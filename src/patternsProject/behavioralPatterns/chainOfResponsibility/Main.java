package patternsProject.behavioralPatterns.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        HandlerLow handlerLow = new HandlerLow();
        HandlerMedium handlerMedium = new HandlerMedium();
        HandlerHigh handlerHigh = new HandlerHigh();

        handlerLow.setNotifier(handlerMedium);
        handlerMedium.setNotifier(handlerHigh);

        handlerLow.showMessage("Message", TypeMessage.MEDIUM);
    }
}
