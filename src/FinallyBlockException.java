import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class FinallyBlockException {
    public static void main(String[] args) {
//        m1();
//        m2();
//        System.out.println(m3());
//        m4();
    }

    private static void m4() {
        try (var scanner = new Scanner(new File("src/files/file.txt"), StandardCharsets.UTF_8)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error");

        }
    }

    // Bu holatda foydalanish tafsiya etilmaydi.
    private static int m3() {
        try {
            return 5;
        } finally {
            return 10;
        }
    }

    private static void m2() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("src/files/file.txt"), StandardCharsets.UTF_8);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Closing input stream...");
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static void m1() {
        try {
            if (new Random().nextBoolean()) {
                throw new Exception("Exception");
            } else {
                System.out.println("Success");
            }
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Finally");
        }
    }
}
