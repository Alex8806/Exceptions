import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    // Задание 3
    // 1. catch (Throwable ex) перемещаем ниже, так как в иерархии он главнее
    // 2. В  printSum есть throws FileNotFoundException, но нет кода может её вызвать (тоже не критично, программа бы работала). теперь кидает сразу
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        FileReader file = new FileReader("dfgfdgdfgd");
        System.out.println(a + b);
    }

}
