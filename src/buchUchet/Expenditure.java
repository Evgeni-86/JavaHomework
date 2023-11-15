package buchUchet;

public class Expenditure extends Deal{
    private String name;

    public Expenditure(String name, int amount) {
        super(String.format("Покупка %s на %d руб.", name, amount),
                0, amount);
        this.name = name;
    }
}
