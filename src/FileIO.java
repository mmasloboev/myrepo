import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Матфей\\OneDrive\\Рабочий стол\\fileio.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write("hello".getBytes());
        FileInputStream fileInputStream = new FileInputStream(file);
        int i;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
