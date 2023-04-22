package Utils;

import TypeParsers.JsonParser;
import TypeParsers.ProtobufParser;
import TypeParsers.XmlParser;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Utils {
    static Scanner scan = new Scanner(System.in);
    public static void readFile() throws IOException {
        System.out.println("Укажите файл:");
        String path = scan.nextLine();
        scan.close();
        String formatOfFile = checkType(path);
        File file = new File(path);
        switch (formatOfFile) {
                case "XML" -> XmlParser.parseString(file);
                case "JSON" -> JsonParser.parseString(file);
                case "PROTO" -> ProtobufParser.parseString(file);
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