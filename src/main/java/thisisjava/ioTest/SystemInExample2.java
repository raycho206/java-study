package thisisjava.ioTest;

import java.io.InputStream;

public class SystemInExample2 {

    public static void main(String[] args) throws Exception {
        InputStream is = System.in;

        byte[] datas = new byte[100];

        System.out.print("이름: ");
        int nameBytes = is.read(datas);
        System.out.println("nameBytes: " + nameBytes);
        printBytes(datas);
        String name = new String(datas, 0, nameBytes - 1);

        System.out.println();
        System.out.print("하고 싶은 말: ");
        int commentBytes = is.read(datas);
        System.out.println("commentBytes: " + commentBytes);
        printBytes(datas);
        String comment = new String(datas, 0, commentBytes - 1);

        System.out.println();
        System.out.println("입력한 이름: " + name);
        System.out.println("입력한 하고 싶은말: " + comment);
    }

    private static void printBytes(byte[] bytes) {
        for (byte b : bytes) {
            if (b == 0) {
                break;
            } else {
                System.out.print(" ");
            }

            System.out.print(b);
        }
    }

}
