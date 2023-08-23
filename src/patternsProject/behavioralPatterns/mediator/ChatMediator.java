package patternsProject.behavioralPatterns.mediator;

import java.util.ArrayList;

public class ChatMediator implements Mediator {

    User admin;
    ArrayList<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUser(User user){
        users.add(user);
    }

    @Override
    public void broadcastEvent(User user, String message) {
        users.forEach((elem) -> {
            if (elem != user && users.size() > 0) {
                elem.handleMessage(message);
            }
        });
    }

}
