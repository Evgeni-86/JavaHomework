package Examclouds.InternetMagazin;

public enum EnumMenu {
    LOGIN("ВОЙТИ"),
    CATALOG("КАТАЛОГИ"),
    BASKET("КОРЗИНА"),
    OUT("ВЫХОД"),
    PAY("ОПЛАТИТЬ"),
    BACK("НАЗАД"),
    BOOK("КНИГИ"),
    TOOL("ИНСТРУМЕНТЫ"),
    TOY("ИГРГУШКИ");

    private int number;
    private String description;

    EnumMenu(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
