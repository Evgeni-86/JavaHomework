package Lessons.lesson02;

public class CreateBox {
    public static void main(String[] args) {
        String str = "Я SmallBox";
        BigBox.number = 15;
        SmallBox new1 = BigBox.newBox(str);
        System.out.println(new1.getParentBoxNumber());
        BigBox.number = 20;
        SmallBox new2 = BigBox.newBox(str);
        System.out.println(new2.getParentBoxNumber());
    }
}
//---------------------------------------------------------
class BigBox {
    static int number;
    static SmallBox newBox (String str) {
        SmallBox newSmallBox = new SmallBox(number, str);
        System.out.println("Создана маленькая коробка");
        System.out.println("Я содержу строку "+"'"+newSmallBox.value+"'");
        System.out.println("Я в коробке с номером "+newSmallBox.getParentBoxNumber());
        return newSmallBox;
    }
}
//----------------------------------------------------------
class SmallBox {
    private int parentNumber;
    public String value;
    SmallBox(int pNum, String inputStr) { //Конструктор
        parentNumber = pNum;
        value = inputStr;
    }
    public int getParentBoxNumber() { //Геттер (получить значение)
        return parentNumber;
    }
}