package patternsProject.behavioralPatterns.mediator;

public class User {
    String userName;
    ChatMediator chatMediator;

    public User(String userName, ChatMediator chatMediator) {
        this.userName = userName;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String message){
        chatMediator.broadcastEvent(this, message);
    }

    public void handleMessage(String message){
        System.out.println(userName + " got a message : " + message);
    }
}
