package DZ5.clientsHandler;

import java.util.*;

public class ClientsHandler {
    private final Queue<String> clientQueue;

    public ClientsHandler(List<String> clientQueue) {
        this.clientQueue = new ArrayDeque<>(clientQueue);
    }

    public void handleClients() {
        while (!clientQueue.isEmpty()) {
            String currentClient = clientQueue.poll();
            System.out.printf("%s сделала новый маникюр\n", currentClient);
            randomClient(currentClient);
        }
    }

    private void randomClient(String client) {
        if (Math.random() < 0.5)
            clientQueue.add("a friend of " + client);
    }
}

