package thisisjava.ioTest;

import java.io.FileReader;
import java.io.Reader;

public class ReaderTest {

    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("C:/Temp/test.txt");
        int readData;
//        while ((readData = reader.read()) != -1) {
//            char charData = (char) readData;
//            System.out.println("charData: " + charData);
//        }

        while ((readData = reader.read(new char[2])) != -1) {
            System.out.println("읽은 문자 수: " + readData);
        }

        reader.close();
    }

}
