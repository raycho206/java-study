package thisisjava.ioTest;

import java.io.InputStream;

public class ConsoleTest {

    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        int asciiCode = is.read();
        System.out.println("asciiCode: " + asciiCode);
        System.out.println("(char) asciiCode: " + (char) asciiCode);
    }

}
