import java.util.Scanner;

public class javaBasic {
    public static void main(String[] args) {
        System.out.println("\nInput nilai dari 0 - 100");
        Scanner scan = new Scanner(System.in);
        int nilai = scan.nextInt();

        if (nilai >= 0 && nilai <= 20) {
            System.out.println("Nilai Anda: E");
        } else if (nilai <= 40) {
            System.out.println("Nilai Anda: D");
        } else if (nilai <= 60) {
            System.out.println("Nilai Anda: C");
        } else if (nilai <= 80) {
            System.out.println("Nilai Anda: B");
        } else if (nilai <= 100) {
            System.out.println("Nilai Anda: A");
        } else {
            System.out.println("Rentang nilai dari 0 - 100");
        }

        System.out.println("\n");
        // ini adalah perubahan

    }
}
