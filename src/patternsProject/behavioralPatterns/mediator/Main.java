package patternsProject.behavioralPatterns.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediator();

        User admin = new User("Admin", chatMediator);
        chatMediator.setAdmin(admin);

        User user1 = new User("user 1", chatMediator);
        User user2 = new User("user 2", chatMediator);
        User user3 = new User("user 3", chatMediator);
        User user4 = new User("user 4", chatMediator);
        User user5 = new User("user 5", chatMediator);
        User user6 = new User("user 6", chatMediator);
        User user7 = new User("user 7", chatMediator);


        chatMediator.addUser(admin);
        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);
        chatMediator.addUser(user5);
        chatMediator.addUser(user6);
        chatMediator.addUser(user7);

        admin.sendMessage("AAAAAAAAAA");

        user2.sendMessage("BBBBBBBBBBBBBB");
    }
}
