package DZ5.clientsHandler;

import java.util.List;

class RunClientsHandler {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        ClientsHandler queueTest = new ClientsHandler(firstClients);
        queueTest.handleClients();
    }
}
