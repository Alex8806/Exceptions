//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//        вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    float b = a();
    System.out.println(b);
    }

    public static float a() {
        boolean flag = true;
        float a = 0;
        Scanner s = new Scanner(System.in);
        while (flag) {
            try {
                System.out.println(" Type float number");
                a = s.nextFloat();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Error, you have typed not a number (put attention, use correct symbol (ex. 5,6) " + e.getClass().getName());
                s = new Scanner(System.in);
            }
        }
        return a;
    }



}