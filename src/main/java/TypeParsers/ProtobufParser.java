package TypeParsers;

import java.io.File;


public class ProtobufParser extends Parseable {

    static String typeOfFile = "JSON";

    public static void parseString(File file){

    }




    public static void printCount(int countedKeys) {
        System.out.println("The type of parsing file is" + typeOfFile
                + "\nCounted keys in the file is " + countedKeys);
    }
}
