package thisisjava.ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

    public static void main(String[] args) throws Exception {
        String originalFileName = "C:/Temp/test.jpg";
        String targetFileName = "C:/Temp/test_copy.jpg";

        File originalFile = new File(originalFileName);
        File targetFile = new File(targetFileName);

        FileInputStream fis = new FileInputStream(originalFile);
        FileOutputStream fos = new FileOutputStream(targetFile);

        int readByteNo;
        byte[] readBytes = new byte[100];
        while ((readByteNo = fis.read(readBytes)) != -1) {
            System.out.println("readByteNo: " + readByteNo);
            fos.write(readBytes, 0, readByteNo);
        }

//        byte[] readBytes = new byte[(int) originalFile.length()];
//        while ((readByteNo = fis.read(readBytes)) != -1) {
//            System.out.println("readByteNo: " + readByteNo);
//            fos.write(readBytes);
//        }

//        byte[] readBytes = new byte[100];
//        while ((readByteNo = fis.read(readBytes)) != -1) {
//            System.out.println("readByteNo: " + readByteNo);
//            if (readBytes.length == 100) {
//                fos.write(readBytes);
//            } else {
//                fos.write(readBytes, 0, readByteNo);
//            }
//        }

        fos.flush();
        fos.close();
        fis.close();

        System.out.println("복사가 잘 되었습니다.");
    }

}
