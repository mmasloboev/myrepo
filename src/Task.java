import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt();
        if (x + y > 15600) {
            System.out.println("Превышена максимальная грузоподъёмность!");
        } else if (x + y > 12000) {
            System.out.println("Мост рухнет!");
        } else {
            System.out.println("Ура доехали!");
        }
    }
}
