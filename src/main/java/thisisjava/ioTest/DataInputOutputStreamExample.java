package thisisjava.ioTest;

import java.io.*;

public class DataInputOutputStreamExample {

    public static void main(String[] args) throws Exception {
        final String fileUrl = "C:/Temp/DataInputOutputStreamExample.txt";

        FileOutputStream fos = new FileOutputStream(fileUrl);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("홍길동");
        dos.writeDouble(95.5);
        dos.writeInt(1);

        dos.writeUTF("감자바");
        dos.writeDouble(90.3);
        dos.writeInt(2);

        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(fileUrl);
        DataInputStream dis = new DataInputStream(fis);

        for (int i = 0; i < 2; i++) {
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println("name: " + name + " score: " + score + " order: " + order);
        }

        dis.close();
        fis.close();
    }

}
