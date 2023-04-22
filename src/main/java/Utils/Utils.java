package Utils;

import TypeParsers.JsonParser;
import TypeParsers.XmlParser;

import java.io.IOException;
import java.util.Scanner;

public class Utils {
    static Scanner scan = new Scanner(System.in);
    public static void readFile() throws IOException {
        System.out.println("Укажите файл:");
        String path = scan.nextLine();
        scan.close();
        String formatOfFile = checkType(path);
        switch (formatOfFile) {
                case "XML" -> XmlParser.parseString(path);
                case "JSON" -> JsonParser.countKeysInJsonFile(path);
//                case "PROTO" -> ProtobufParser.parseString(path);
            }
        }

    public static String checkType(String path) throws IOException {
        if (path == null) {
            System.out.println("Не верно указан путь");
            readFile();
        }
        String extension = path.substring(path.lastIndexOf(".") + 1).toUpperCase();
        return extension;
    }
}