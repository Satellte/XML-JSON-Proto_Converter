package TypeParsers;

public class ProtobufParser extends Parseable {

    public static void parseString(StringBuilder input) {
        System.out.println(input);
        countKeys();
    }

    public static void countKeys() {
        System.out.println("Считаем ключи");
        printCount();
    }


    public static void printCount() {
        System.out.println("Красивый вывод на печать счетчика ProtoBuf" );
    }
}
