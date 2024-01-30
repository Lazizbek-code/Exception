import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

public class HandlingMultipleException {
    public static void main(String[] args) {
        try {
            m1();
            m2();
            m3();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void m3() throws IOException {
    }

    private static void m2() throws FileNotFoundException {
    }

    private static void m1() throws UnknownHostException {
    }
}
