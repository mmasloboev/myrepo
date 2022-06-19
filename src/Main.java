import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IndexOutOfBoundsException{
        int [] mass = new int[1];
        try {
            mass[1] = 2;
            mass[2] = 3;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ОШИБКА");
        }

    }
}
