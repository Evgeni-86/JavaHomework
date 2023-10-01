package algoritms;

import java.util.*;

public class Rukzak {

    public static void main(String[] args) {

        String[] predmet = new String[]{"магнитофон", "ноутбук", "гитара"};
        int[] stoimostPredmeta = new int[]{3000, 2000, 1500};
        int[] vesPredmeta = new int[]{4, 3, 1};
        int[] razmerRukzaka = new int[]{1, 2, 3, 4};
        Cell[][] tablitca = new Cell[predmet.length][razmerRukzaka.length];



        for (int i = 0; i < predmet.length; i++) {

            for (int j = 0; j < tablitca[i].length; j++) {//по столбцам в линии
                int currenRazmerRukzaka = razmerRukzaka[j];
                if (tablitca[i][j] == null) {
                    tablitca[i][j] = new Cell();
                }
                int svobodnoeProstranstvo = (j + 1) - tablitca[i][j].ves;

                Cell dopolnitElement = new Cell();
                if (i > 0 && ((svobodnoeProstranstvo - vesPredmeta[i]) - 1) >= 0) { //останется пространство если добавить текущий предмет
                    dopolnitElement = tablitca[i - 1][(svobodnoeProstranstvo - vesPredmeta[i]) - 1];
                }

                Cell elementPredLinii = new Cell();
                if (i > 0) {
                    elementPredLinii = tablitca[i - 1][j];
                }

                int soimostCurrentAndDopolnitElement = stoimostPredmeta[i] + dopolnitElement.stoimost;
                //выбираем из двух вариантов
                if (vesPredmeta[i] <= currenRazmerRukzaka && soimostCurrentAndDopolnitElement > elementPredLinii.stoimost) {

                    tablitca[i][j].value.add(predmet[i]);
                    tablitca[i][j].value.addAll(dopolnitElement.value);
                    tablitca[i][j].stoimost = stoimostPredmeta[i] + dopolnitElement.stoimost;
                    tablitca[i][j].ves = vesPredmeta[i] + dopolnitElement.ves;
                } else {

                    tablitca[i][j].value.addAll(elementPredLinii.value);
                    tablitca[i][j].stoimost += elementPredLinii.stoimost;
                    tablitca[i][j].ves += elementPredLinii.ves;
                }
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
    ArrayList<String> value = new ArrayList<>();
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

