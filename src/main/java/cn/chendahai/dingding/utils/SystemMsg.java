package cn.chendahai.dingding.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SystemMsg {
    public static String getHostAddress() {
        String address = "";
        try {
            InetAddress addr = InetAddress.getLocalHost();
            address = addr.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return address;
    }

    public static void main(String[] args) {
        System.out.println(getHostAddress());
    }
}
