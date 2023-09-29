package algoritms;

import java.util.*;

public class Rukzak {

    public static void main(String[] args) {

        List<String> predmet = new ArrayList<>(Arrays.asList("гитара", "магнитофон", "ноутбук"));
        int[] stoimostPredmeta = new int[]{1500, 3000, 2000};
        int[] vesPredmeta = new int[]{1, 4, 3};
        int[] razmerRukzaka = new int[]{1, 2, 3, 4};
        Cell[][] tablitca = new Cell[3][4];


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < tablitca[i].length; j++) {//по столбцам 0 - 4
                int currenRazmerRukzaka = razmerRukzaka[j];

                if (tablitca[i][j] == null) {
                    tablitca[i][j] = new Cell();
                }

                //----------------------------
                String currentPredmetName = predmet.get(i);
                int cenaCurrentPredmetMaxTemp = stoimostPredmeta[i];
                int currentVes = vesPredmeta[i];

                //-----------------------
                int svobodnoeProstranstvo = (j + 1) - tablitca[i][j].ves;

                if (i > 0){

                    if (svobodnoeProstranstvo > 0) {//если оставшееся пространство 0

                        if (currentVes == svobodnoeProstranstvo){
                            tablitca[i][j].value = currentPredmetName;
                            tablitca[i][j].stoimost = cenaCurrentPredmetMaxTemp;
                            tablitca[i][j].ves = currentVes;
                        }

                        if ((svobodnoeProstranstvo - currentVes) > 0) {
                            int stoimosPreviosLinelement = tablitca[i - 1][j].stoimost;

                            int stoimostDopolnitElem = tablitca[i - 1][(svobodnoeProstranstvo - currentVes) - 1].stoimost;
                            System.out.println("stoimosPreviosLinelement " + stoimosPreviosLinelement);
                            System.out.println("stoimostDopolnitElem " + stoimostDopolnitElem);
                            int soimostCurrentAndDopolnitElement = cenaCurrentPredmetMaxTemp +
                                    (tablitca[i - 1][svobodnoeProstranstvo - 1].stoimost);

//                            System.out.println("stoimosPreviosLinelement " + stoimosPreviosLinelement +
//                                    "  " + "soimostCurrentAndDopolnitElement " + soimostCurrentAndDopolnitElement);

                        }
                    }
                } else {
                    tablitca[i][j].value = currentPredmetName;
                    tablitca[i][j].stoimost = cenaCurrentPredmetMaxTemp;
                    tablitca[i][j].ves = currentVes;
                }







                //---------------------------
//                if (i > 0){
//
//                    if (vesPredmeta[i] > currenRazmerRukzaka){
//                        Cell previosLineCell = tablitca[i - 1][j];
//                        tablitca[i][j] = previosLineCell;
//                    }
//
//                    if (vesPredmeta[i] <= currenRazmerRukzaka){
//                        int svobodnoeProstranstvo = (j + 1) - currentVes;
//                        System.out.println(svobodnoeProstranstvo + " " + currentPredmetName + " " + currentVes);
//
//                        if (svobodnoeProstranstvo > 0) {//если оставшееся пространство больше 0
//
//                            int stoimosPreviosLinelement = tablitca[i - 1][j].stoimost;
//
//                            int stoimostDopolnitElem = tablitca[i - 1][svobodnoeProstranstvo - 1].stoimost;
//                            System.out.println("stoimostDopolnitElem " + stoimostDopolnitElem);
//                            int soimostCurrentAndDopolnitElement = cenaCurrentPredmetMaxTemp +
//                                    (tablitca[i - 1][svobodnoeProstranstvo - 1].stoimost);
//
//                            System.out.println("stoimosPreviosLinelement " + stoimosPreviosLinelement +
//                                    "  " + "soimostCurrentAndDopolnitElement " + soimostCurrentAndDopolnitElement);
//                        }
//                        else {
//
//                            tablitca[i][j].value = currentPredmetName;
//                            tablitca[i][j].stoimost = cenaCurrentPredmetMaxTemp;
//                            tablitca[i][j].ves = currentVes;
//                        }
//                    }
//
//
//
//                }
//
//                    tablitca[i][j].value = currentPredmetName;
//                    tablitca[i][j].stoimost = cenaCurrentPredmetMaxTemp;
//                    tablitca[i][j].ves = currentVes;
//                //-----------------------




//                //-----------------------
//                if (i > 0){
//
//                    if (vesPredmeta[i] > currenRazmerRukzaka){
//                        Cell previosLineCell = tablitca[i - 1][j];
//                        tablitca[i][j] = previosLineCell;
//                    }
//
//                    if (vesPredmeta[i] <= currenRazmerRukzaka){
//                        int svobodnoeProstranstvo = (j + 1) - currentVes;
//                        System.out.println(svobodnoeProstranstvo + " " + currentPredmetName + " " + currentVes);
//
//                        if (svobodnoeProstranstvo > 0) {//если оставшееся пространство больше 0
//
//                            int stoimosPreviosLinelement = tablitca[i - 1][j].stoimost;
//
//                            int stoimostDopolnitElem = tablitca[i - 1][svobodnoeProstranstvo - 1].stoimost;
//                            System.out.println("stoimostDopolnitElem " + stoimostDopolnitElem);
//                            int soimostCurrentAndDopolnitElement = cenaCurrentPredmetMaxTemp +
//                                    (tablitca[i - 1][svobodnoeProstranstvo - 1].stoimost);
//
//                            System.out.println("stoimosPreviosLinelement " + stoimosPreviosLinelement +
//                                    "  " + "soimostCurrentAndDopolnitElement " + soimostCurrentAndDopolnitElement);
//                        }
//                        else {
//
//                            tablitca[i][j].value = currentPredmetName;
//                            tablitca[i][j].stoimost = cenaCurrentPredmetMaxTemp;
//                            tablitca[i][j].ves = currentVes;
//                        }
//                    }
//
//
//
//                } else {
//                    tablitca[i][j].value = currentPredmetName;
//                    tablitca[i][j].stoimost = cenaCurrentPredmetMaxTemp;
//                    tablitca[i][j].ves = currentVes;
//                }
//                //-----------------------




//                if (vesPredmeta[i] <= currenRazmerRukzaka) {
//
//                    int svobodnoeProstranstvo = (j + 1) - currentVes;
//                    System.out.println(svobodnoeProstranstvo + " " + currentPredmetName + " " + currentVes);
//
//                    if (i > 0 && svobodnoeProstranstvo > 0) {//если оставшееся пространство больше 0
//
//                        int stoimosPreviosLinelement = tablitca[i - 1][j].stoimost;
//
//                        int stoimostDopolnitElem = tablitca[i - 1][svobodnoeProstranstvo - 1].stoimost;
//                        System.out.println("stoimostDopolnitElem " + stoimostDopolnitElem);
//                        int soimostCurrentAndDopolnitElement = cenaCurrentPredmetMaxTemp +
//                                (tablitca[i - 1][svobodnoeProstranstvo - 1].stoimost);
//
//                        System.out.println("stoimosPreviosLinelement " + stoimosPreviosLinelement +
//                                "  " + "soimostCurrentAndDopolnitElement " + soimostCurrentAndDopolnitElement);
//                    } else {
//
//                        tablitca[i][j].value = currentPredmetName;
//                        tablitca[i][j].stoimost = cenaCurrentPredmetMaxTemp;
//                        tablitca[i][j].ves = currentVes;
//                    }
//
//                }
                //----------------------------

            }
        }


        for (Cell[] stroka : tablitca) {
            for (Cell stolbetc : stroka) {
                System.out.print(stolbetc.ves + " ");
                System.out.print(stolbetc.stoimost + " ");
                System.out.print(stolbetc.value + " ");
            }
            System.out.println();
            System.out.println("-----------------------");
        }

    }

}

class Cell {
    String value = "";
    int ves;
    int stoimost;

    @Override
    public String toString() {
        return "Cell{" +
                "value='" + value + '\'' +
                ", ves=" + ves +
                ", stoimost=" + stoimost +
                '}';
    }
}

