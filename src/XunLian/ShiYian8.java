package XunLian;

import java.io.*;

/**创建一个文本文件xinxinyujisuankexue.txt，
 * 编写程序实现打开该文本文件，每次读取一行内容，
 * 将每行作为一个字符串读入，并将字符串输出显示到屏幕上。
 */
public class ShiYian8 {
    public static void main(String args[]) throws IOException {
        File filePath = new File("E:\\java教材及相关资料\\ZhiMu1.txt");
        //对文件的读取
        BufferedReader br;
        String s = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            while ((s = br.readLine()) != null) {
                System.out.println(s + "\r\n");
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }
}
