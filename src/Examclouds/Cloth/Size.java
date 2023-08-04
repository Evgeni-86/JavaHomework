package Examclouds.Cloth;

public enum Size {
    XXS(32,"детский размер"),
    XS(34,"Подростковый размер"),
    S(36,"Средний размер"),
    M(38,"Взрослый размер"),
    L(40, "Взрослый размер");

    private int euro;
    private String description;

    Size(int euro, String description) {
        this.euro = euro;
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setEuroSize(int euroSize) {
        this.euro = euroSize;
    }

    public int getEuroSize() {
        return euro;
    }
}

