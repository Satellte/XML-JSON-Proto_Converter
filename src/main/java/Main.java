import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        getTypeOfString(readString());

    }

    static StringBuilder readString(){
        File inputText = new File("./test.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(inputText);
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось найти файл");
        }
        StringBuilder inputString = new StringBuilder();
        while (scanner.hasNextLine()) {
            inputString.append(scanner.nextLine().replace("\n", ""));
        }
        scanner.close();
        return inputString;
    }

    static void getTypeOfString(StringBuilder inputString){}

}
