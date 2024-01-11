package WorkOfFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public void Read(String nameFile){
        try(BufferedReader reader = new BufferedReader(new FileReader(nameFile))) {
            String line;
            System.out.print("Текст файла: ");
            while ((line = reader.readLine()) !=null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.err.println("Ошибка при чтении в файл: " + e.getMessage());
        }
    }
}
