package TypeParsers;

public class JsonParser extends Parseable {


    public static void parseString(StringBuilder input) {
        System.out.println(input);
        this.countKeys();
    }

    public void countKeys() {
        System.out.println("Считаем ключи");
        this.printCount();
    }


    public void printCount() {
        System.out.println("Красивый вывод на печать счетчика XML" );
    }
}
