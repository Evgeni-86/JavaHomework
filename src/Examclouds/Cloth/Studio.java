package Examclouds.Cloth;

public class Studio {

    public static void dressMan(Clothes[] clothes) {
        for (Clothes elem : clothes) {
            if (elem instanceof MenClothes){
                elem.info();
            }
        }
    }

    public static void dressWoman(Clothes[] clothes) {
        for (Clothes elem : clothes) {
            if (elem instanceof WomenClothes){
                elem.info();
            }
        }
    }
}
