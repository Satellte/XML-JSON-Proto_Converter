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
        switch (formatOfFile) {
                case "XML" -> XmlParser.parseString(path);
//                case "JSON" -> JsonParser.parseString(path);
//                case "PROTO" -> ProtobufParser.parseString(path);
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