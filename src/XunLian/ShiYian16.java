package XunLian;

import java.net.*;
import java.net.UnknownHostException;

/**
 * 编写一个Java程序，查询自己主机的地址和百度的IP地址；
 */
public class ShiYian16 {
    public static void main(String[] args)
    {
        String IP = null;
        String host = null;
        try
        {
            InetAddress ia = InetAddress.getLocalHost();
            host = ia.getHostName();//获取度计问算机答名内字容
            IP= ia.getHostAddress();//获取IP
        }
        catch(UnknownHostException e)
        {
            e.printStackTrace();
        }
        System.out.println(host);
        System.out.println(IP);
    }
}

