package thisisjava.ioTest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableReader {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Temp/SerializableWriter.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerializableClassA classA = (SerializableClassA) ois.readObject();
        System.out.println("field1: " + classA.field1);
        System.out.println("field2.field1: " + classA.field2.field1);
        System.out.println("field3: " + classA.field3);
        System.out.println("field4: " + classA.field4);
    }

}
