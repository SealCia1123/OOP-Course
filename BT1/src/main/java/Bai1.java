import java.util.Random;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int userNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Du doan so ngau nhien (1-100): ");
        userNumber = sc.nextInt();
        System.out.println("So ban da chon: " + userNumber);
    }
}
