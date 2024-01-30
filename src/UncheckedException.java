import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("Welcome to reader");
        //        uncheckedExceptionExample();
        readFile();
    }

    public static void readFile() throws FileNotFoundException{
            InputStream inputStream = new FileInputStream("file..txt");
    }

    private static void uncheckedExceptionExample() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a/b);
        scanner.close();
    }
}
