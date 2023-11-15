package passwordChecker;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        PasswordChecker passwordChecker = PasswordChecker.getPasswordChecker();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите минимальную длину пароля: ");
        passwordChecker.setMinLength(scanner.nextInt());
        System.out.print("Введите максимальное число повторений символа подряд: ");
        passwordChecker.setMaxRepeats(scanner.nextInt());
        scanner.nextLine();

        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("end")) {
            if (passwordChecker.verify(input))
                System.out.println("Подходит!");
            else
                System.out.println("Не подходит!");
        }
    }
}
