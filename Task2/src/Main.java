public class Main {
    public static void main(String[] args) {
        //        Задание 2
        // 1. intArray[8] не инициализирован
        // 2. d всегда равен 0, catch всегда будет срабатывать. А может так и задуманно =)

        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}