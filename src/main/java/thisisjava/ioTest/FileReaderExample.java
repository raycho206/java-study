package thisisjava.ioTest;

import java.io.FileReader;

public class FileReaderExample {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:/Temp/test.txt");

        int readCharNo;
        char[] cbufs = new char[100];
        while ((readCharNo = fr.read(cbufs)) != -1) {
            String data = new String(cbufs, 0, readCharNo);
            System.out.print(data);
        }

        fr.close();
    }

}
