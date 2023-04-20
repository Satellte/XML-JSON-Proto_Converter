package TypeParsers;

public class ProtobufParser extends Parseable {

    public void parseString(StringBuilder input) {
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
