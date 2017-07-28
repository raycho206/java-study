package thisisjava.ioTest;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest {

    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:/Temp/test.txt");
//        int readByte;
//        while ((readByte = is.read()) != -1) {
//            System.out.println("readByte: " + readByte);
//        }

//        int readByteNo;
//        while ((readByteNo = is.read(new byte[2])) != -1) {
//            System.out.println("readByteNo :" + readByteNo);
//        }

        int readByteNo2;
        while ((readByteNo2 = is.read(new byte[2], 0, 2)) != -1) {
            System.out.println("실제로 읽은 바이트 수: " + readByteNo2);
        }

        is.close();
    }

}
