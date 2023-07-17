import java.util.Scanner;
//4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

// свои исключения мы еще не проходили. Поэтому IF.
public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        String a = null;
        Scanner s;
        while (flag) {
            System.out.println("Type string");
            s = new Scanner(System.in);
            a = s.nextLine();
            if (a.isEmpty()) {
                System.out.println("Please, my friend, put something. String could not be empty.");
            } else {
                flag = false;
            }
        }
        System.out.println(a);
    }
}