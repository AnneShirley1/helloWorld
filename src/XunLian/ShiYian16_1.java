package XunLian;
/**
 * 编写一个Java程序，利用URL访问百度的主页
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class ShiYian16_1 {
    public static void main(String[] args)
    {
        String urlName = "http://www.baidu.com";
        if (args.length>0)   urlName=args[0];
        new  ShiYian16_1().display(urlName);
    }
    public void display(String urlName)
    {
        try
        {
            URL url=new URL(urlName);
            InputStreamReader in=new InputStreamReader(url.openStream());
            BufferedReader br=new BufferedReader(in);
            String aLine;
            while((aLine=br.readLine())!=null)
                System.out.println(aLine);
        }
        catch(MalformedURLException murle)
        {  System.out.println(murle); }
        catch(IOException ioe)
        {  System.out.println(ioe);  }
    }
}