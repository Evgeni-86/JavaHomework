package algoritms;

import java.util.*;

public class GreedyAlgorithms {

    public static void main(String[] args) {

        List<String> finalStations = new ArrayList<>();

        Set<String> statesNeeded = new HashSet<>(Arrays.asList("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));
        Map<String, Set<String>> stations = new HashMap<>();
        stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));
        stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
        stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
        stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));
        stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));


        Set<String> statesNeededTemp = new HashSet<>(statesNeeded);

        while (statesNeededTemp.size() > 0) {
            String bestStation = null;
            Set<String> statesCovered = new HashSet<>();

            for (Map.Entry<String, Set<String>> entry : stations.entrySet()) {

                Set<String> intersection = new HashSet<>(statesNeededTemp);
                intersection.retainAll(entry.getValue());

                if (intersection.size() > statesCovered.size()) {
                    bestStation = entry.getKey();
                    statesCovered = intersection;
                }
            }

            if (bestStation == null){
                break;
            }

            finalStations.add(bestStation);
            statesNeededTemp.removeAll(statesCovered);

        }

        System.out.println(finalStations);

    }

}
