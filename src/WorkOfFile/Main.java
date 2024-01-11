package WorkOfFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nameFile = "C:\\Users\\Ira\\IdeaProjects\\Calculator\\src\\WorkOfFile\\Text.txt";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте! Выберете операцию:");
        System.out.println("1. Запись текста в файл");
        System.out.println("2. Прочитать содержимое файла");
        byte userNum = scanner.nextByte();


        switch (userNum) {
            case 1:
                System.out.print("Напишите текст который необходимо записать: ");
                String e = scanner.nextLine();
                String userAnswer = scanner.nextLine();
                scanner.close();
                WriteFile writeFile = new WriteFile();
                writeFile.Write(userAnswer, nameFile);
                break;
            case 2:
                ReadFile readFile = new ReadFile();
                readFile.Read(nameFile);
                break;
            default:
                System.out.println("Введено не корректное значение!");
        }


    }

}
