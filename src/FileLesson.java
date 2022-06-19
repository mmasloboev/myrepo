import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLesson {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }

        scanner.close();
        fileScanner.close();
    }
}
