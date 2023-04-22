package TypeParsers;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

public class XmlParser extends Parseable {

    int countedKeys = 0;
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
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        doc.getDocumentElement().normalize();

        NodeList nodeList = doc.getElementsByTagName("*");

        printCount(nodeList.getLength());

    }


    public static void printCount(int countedKeys) {
        System.out.println("Красивый вывод на печать счетчика XML" );
    }
}
