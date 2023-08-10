package Examclouds.InnerClass;

public class User {
    private String login;
    private String password;


    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    //------------------------------------------
    class Query {
        public void printToLog() {
            System.out.println("пользователь " + login + " оправил запрос");
        }
    }
}

class Test {
    public static void main(String[] args) {
        User user1 = new User();
        user1.createQuery();

        User.Query query = user1.new Query();
        query.printToLog();

        User.Query query1 = new User().new Query();
        query1.printToLog();
    }
}