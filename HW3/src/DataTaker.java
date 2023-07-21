import java.util.Scanner;

public interface DataTaker {

    default public String DataInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите следующие данные , разделенные пробелом: (Фамилия Имя Отчество дата рождения(dd/mm/yyyy) номер телефона пол)");
        return sc.nextLine();
    }

    default boolean CheckTExtNoNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            char[] prohibitedSymbols = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '@', '!', '?', '$', '%', '+', '-'};
            for (char j : prohibitedSymbols
            ) {
                if (s.charAt(i) == j) return false;
            }
        }
        return true;
    }
}
