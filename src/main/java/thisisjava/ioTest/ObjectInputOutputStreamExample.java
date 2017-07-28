package thisisjava.ioTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {

    public static void main(String[] args) throws Exception {
        final String fileUrl = "C:/Temp/ObjectInputOutputStreamExample.txt";

        FileOutputStream fos = new FileOutputStream(fileUrl);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(10);
        oos.writeObject(3.14);
        oos.writeObject(new int[]{1, 2, 3});
        oos.writeObject("홍길동");

        oos.flush();
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(fileUrl);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Integer integerObj = (Integer) ois.readObject();
        Double doubleObj = (Double) ois.readObject();
        int[] intObjArray = (int[]) ois.readObject();
        String stringObj = (String) ois.readObject();

        ois.close();
        fis.close();

        System.out.println(integerObj);
        System.out.println(doubleObj);
        for (int i = 0; i < intObjArray.length; i++) {
            if (i < intObjArray.length - 1) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
        }
        System.out.println(stringObj);
    }

}
