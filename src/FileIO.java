import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Матфей\\OneDrive\\Документы\\filelesson.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write("Hi, I am Mathew and I learn writing to file in Java!!!".getBytes());
        fileOutputStream.write("\n".getBytes());
        fileOutputStream.write("It's easy!".getBytes());
        fileOutputStream.write("\n".getBytes());
        fileOutputStream.write("But now I want to learn output from files!".getBytes());

        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        int i;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
