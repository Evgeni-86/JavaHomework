package Sber.Dz1path3;
//Елочка из N звезд
public class Z10 {
    public static void main(String[] args) {
        int input = 15;
        StringBuilder sb = new StringBuilder();
        int shiftString = input;

        for (int i = 0; i < input; i++) {

            for (int j = 0; j <= i; j++) {
                if (j == 0){
                    //в первой строке прибавляем одну звезду
                    sb.append("*");
                } else {
                    //со второй прибавляем по две звезды
                    sb.append("**");
                }
            }
            //при форматировании увеличиваем ширину на 1
            System.out.printf("%"+ shiftString++ +"s\n", sb.toString());
            sb.setLength(0);
        }
        System.out.printf("%"+ shiftString / 2 +"s\n", "|");
    }
}
