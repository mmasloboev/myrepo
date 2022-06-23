import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path);
        Scanner fileScanner = null;

        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
            System.err.println("Аварийное завершение работы программы");
            System.exit(-1);
        }

        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }

        fileScanner.close();
        scanner.close();
    }
}