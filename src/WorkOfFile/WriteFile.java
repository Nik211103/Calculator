package WorkOfFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public void Write(String userAnswer, String nameFile){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile, true))) {
            writer.write(userAnswer);
            writer.newLine();
            System.out.println("Запись прошла успешна!");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
