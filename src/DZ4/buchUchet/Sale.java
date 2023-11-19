package DZ4.buchUchet;

public class Sale extends Deal {
    private String name;

    public Sale(String name, int amount) {
        super(String.format("Продажа %s на %d руб.", name, amount),
                amount, 0);
        this.name = name;
    }
}
