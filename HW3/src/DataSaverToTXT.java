import java.io.FileWriter;
import java.io.IOException;

public class DataSaverToTXT {
    public void save(Entry entry) throws Exception {
        try (FileWriter writer = new FileWriter((Config.path + entry.getSurname()), true)) {
            writer.append(String.format("<%s>", entry.getSurname()));
            writer.append(String.format("<%s>", entry.getName()));
            writer.append(String.format("<%s>", entry.getFathername()));
            writer.append(String.format("<%s>", entry.getDob()));
            writer.append(String.format("<%s>", entry.getPhone()));
            writer.append(String.format("<%s>", entry.getSex()));
            writer.append("\n");
            writer.flush();
            writer.close();
            System.out.println("Готово. Файл " + entry.getSurname() + " Записан");
        } catch (IOException e) {
            throw new CustomException(e.getMessage() + " Ошибка при записи файла");
        }


    }
}
