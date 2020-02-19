import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money:");
        double USA = scanner.nextDouble();


        double quydoi = USA*23000;

        System.out.println("Gia tri VND: " + quydoi + "k");


    }
}
