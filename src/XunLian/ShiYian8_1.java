package XunLian;

import java.io.*;

/**通过从键盘、文件等输入输出操作，
 *掌握字节流的输入输出、字符的输入输出、文件的输入输出等操作
 */
public class ShiYian8_1 {
    public static void main(String[] args) {
        BufferedReader br=null;
        BufferedWriter bw=null;
        String str=null;
        FileReader fr= null;
        FileWriter fw = null;
        String path ="E:\\java教材及相关资料\\ZhiMu2.txt";
        int c=0;

        br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入数据:");
        try {
            str=br.readLine();
            //从键盘上输入一个字符串，以回车结束。
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            bw.write("学习java");
            while(str != null){//用了循环可以多输入几次。
                if(str.equalsIgnoreCase("exit")){
                    break;
                }
                System.out.println("从键盘上输入的数据为：" + str);//输出屏幕
                bw.write(str);//写到文本
                //bw.newLine();
                System.out.print("请输入数据:");
                str=br.readLine();
            }
            bw.flush();
            System.out.println("end");

        }catch(FileNotFoundException e){

        } catch (IOException e) {  } finally{
            try {
                if(br != null)
                    br.close();
            } catch (IOException e) {

            }
            try {
                bw.close();
            } catch (IOException e) {

            }
            try {
                fw.close();
            } catch (IOException e) {

            }
        }

        try {
            fr = new FileReader(path);
            while((c = fr.read())!= -1){//从文本读取
                System.out.print((char)c);
            }
            System.out.println();
        } catch (FileNotFoundException e){

        } catch (Exception e) {

        }

    }
}
