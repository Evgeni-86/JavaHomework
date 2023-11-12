package algoritms.greedyAlg;

import java.lang.reflect.Array;
import java.util.*;

//динамический подход
public class Rukzak {

    public static void main(String[] args) {

        String[] predmet = new String[]{"магнитофон", "ноутбук", "гитара"};
        int[] stoimostPredmeta = new int[]{3000, 2000, 1500};
        double[] vesPredmeta = new double[]{4, 3, 1};
        List<Double> razmerRukzaka = Arrays.asList(1.0, 2.0, 3.0, 4.0);

        Cell[][] tablitca = new Cell[predmet.length][razmerRukzaka.size()];

        for (int i = 0; i < predmet.length; i++) {

            for (int j = 0; j < tablitca[i].length; j++) {//по столбцам в линии (j как размер рюкзака)
                tablitca[i][j] = new Cell();

                Cell dopolnitElement = new Cell();
                if (i > 0 && (razmerRukzaka.get(j) - vesPredmeta[i]) > 0) { //останется ли пространство если добавить текущий предмет
                    int indexPodchodashegoVesa = razmerRukzaka.indexOf(razmerRukzaka.get(j) - vesPredmeta[i]);
                    dopolnitElement = tablitca[i - 1][indexPodchodashegoVesa];
                }

                Cell elementPredLinii = new Cell();
                if (i > 0) {
                    elementPredLinii = tablitca[i - 1][j];
                }

                int soimostCurrentAndDopolnitElement = stoimostPredmeta[i] + dopolnitElement.stoimost;
                //выбираем из двух вариантов
                if (vesPredmeta[i] <= razmerRukzaka.get(j) && soimostCurrentAndDopolnitElement > elementPredLinii.stoimost) {

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
    double ves;
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

