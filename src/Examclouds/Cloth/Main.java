package Examclouds.Cloth;

public class Main {


    public static void main(String[] args) {

        Skirt skirt1 = new Skirt("skirt",Size.M,15.2,"black");
        Tie tie = new Tie("tie",Size.L,10.2,"white");
        Trousers trousers = new Trousers("trousers",Size.XS,19.2,"yellow");
        Tshirt tshirt = new Tshirt("t-shirt",Size.S,9.7,"green");

        Clothes[] clothes = {skirt1, tie, trousers, tshirt};

        Studio.dressMan(clothes);
        System.out.println("--------------------");
        Studio.dressWoman(clothes);

    }

}

