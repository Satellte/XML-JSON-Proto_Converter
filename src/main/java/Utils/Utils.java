package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {
    public static StringBuilder readString(){
        File inputText = new File("./test.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(inputText);
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось найти файл");
        }
        StringBuilder inputString = new StringBuilder();
        while (scanner.hasNextLine()) {
//            inputString.append(scanner.nextLine().replace("\n", ""));
            inputString.append(scanner.nextLine());
        }
        scanner.close();
        return inputString;
    }

    public static void getTypeOfString(StringBuilder inputString){
        if (inputString == null || inputString.isEmpty()) {
            System.out.println("Не верный ввод");;
        }

        char firstChar = inputString.charAt(0);

        if (firstChar == '{') {
            System.out.println("Это JSON. Запускай парсер JSON");
        } else if (firstChar == '<') {
            System.out.println("Это XML. Запускай парсер XML");
        } else {
            System.out.println("Неподходящий тип");
        }
    }
}
