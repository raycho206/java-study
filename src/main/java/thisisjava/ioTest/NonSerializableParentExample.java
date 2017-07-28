package thisisjava.ioTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExample {

    public static void main(String[] args) throws Exception {
        final String fileUrl = "C:/Temp/NonSerializableParentExample.txt";

        FileOutputStream fos = new FileOutputStream(fileUrl);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        NonSerializableChild writeChild = new NonSerializableChild();
        writeChild.field1 = "이몽룡";
        writeChild.field2 = "성춘향";
        oos.writeObject(writeChild);
        oos.flush();
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(fileUrl);
        ObjectInputStream ois = new ObjectInputStream(fis);
        NonSerializableChild readChild = (NonSerializableChild) ois.readObject();
        System.out.println("field1: " + readChild.field1);
        System.out.println("field2: " + readChild.field2);
        ois.close();
        fis.close();
    }

}
