package thisisjava.ioTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {

    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터 IP주소: " + localHost.getHostAddress());

            System.out.println();
            InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
            for (InetAddress ia : inetAddresses) {
                System.out.println("www.naver.com IP주소: " + ia.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
