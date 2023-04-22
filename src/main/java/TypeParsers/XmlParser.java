package TypeParsers;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlParser extends Parseable {

    static String typeOfFile = "XML";
    public static void parseString(String path) {

        File inputFile = new File(path);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        Document doc = null;
        try {
            doc = dBuilder.parse(inputFile);
        } catch (SAXException | IOException e) {
            throw new RuntimeException(e);
        }
        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName("*");
        printCount(nodeList.getLength());
    }


    public static void printCount(int countedKeys) {
        System.out.println("The type of parsing file is " + typeOfFile
                + "\nCounted keys in the file is " + countedKeys);
    }
}
