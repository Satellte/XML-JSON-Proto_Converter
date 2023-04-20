package Utils;

import TypeParsers.JsonParser;
import TypeParsers.ProtobufParser;
import TypeParsers.XmlParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {
    static Scanner scan = new Scanner(System.in);
    public static void readFile(){
        System.out.println("Укажите файл:");
        String path = scan.nextLine();
        scan.close();
        String formatOfFile = checkType(path);
        File inputText = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(inputText);
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось найти файл");
        }
        StringBuilder inputString = new StringBuilder();
        while (scanner.hasNextLine()) {
            inputString.append(scanner.nextLine());
        }
        scanner.close();

            switch (formatOfFile) {
                case "XML" -> XmlParser.parseString(inputString);
                case "JSON" -> JsonParser.parseString(inputString);
                case "PROTO" -> ProtobufParser.parseString(inputString);
            }
        }

//    public static void getTypeOfFile(StringBuilder inputString){
//        if (inputString == null || inputString.isEmpty()) {
//            System.out.println("Не верный ввод");;
//        }
//
//        char firstChar = inputString.charAt(0);
//
//        if (firstChar == '{') {
//            System.out.println("Это JSON. Запускай парсер JSON");
//            JsonParser.parseString(inputString);
//        } else if (firstChar == '<') {
//            System.out.println("Это XML. Запускай парсер XML");
//            XmlParser.parseString(inputString);
//        } else {
//            System.out.println("Неподходящий тип");
//        }
//    }

    public static String checkType(String path){
        if (path == null) {
            System.out.println("Не верно указан путь");
            readFile();
        }
        String extension = path.substring(path.lastIndexOf(".") + 1).toUpperCase();
        return extension;
    }
}