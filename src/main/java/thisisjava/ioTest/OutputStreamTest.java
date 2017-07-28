package thisisjava.ioTest;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest {

    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("C:/Temp/test.txt");
        byte[] data = "ABC".getBytes();
        for (byte b : data) {
            System.out.println((char) b);
            os.write(b); //"A", "B", "C"를 하나씩 출력
        }
        System.out.println(new String(data));

        os.flush();
        os.close();
    }

}
