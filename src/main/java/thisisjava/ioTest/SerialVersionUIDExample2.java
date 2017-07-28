package thisisjava.ioTest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample2 {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Temp/SerialVersionUIDExample1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerializableClassC classC = (SerializableClassC) ois.readObject();
        System.out.println("field1: " + classC.field1);
    }

}
