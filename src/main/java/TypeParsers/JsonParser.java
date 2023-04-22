package TypeParsers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonParser extends Parseable {
    static String typeOfFile = "JSON";

    public static void countKeysInJsonFile(File jsonFile) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper.readTree(jsonFile);

        System.out.println(jsonNode.size());
    }


    public static void printCount(int countedKeys) {
        System.out.println("The type of parsing file is" + typeOfFile
                + "\nCounted keys in the file is " + countedKeys);
    }
}
