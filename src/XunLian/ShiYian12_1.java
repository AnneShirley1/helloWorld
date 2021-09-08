package XunLian;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**在窗口中设置两个按钮，分别用于画圆或者椭圆，
 * 并在绘图区域中显示字符串“画圆或者椭圆”，
 */
public class ShiYian12_1 {
    public static class Test extends JFrame {
        public Test() {
          setSize(500, 400);
            this.setLocationRelativeTo(null);//设置居中
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel jp = new JPanel();

            JButton jb1 = new JButton("画圆");
            JButton jb2 = new JButton("画椭圆");

            jp.add(jb1);
            jp.add(jb2);

            //给第一个按钮添加监听
            jb1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JFrame jf = new JFrame();
                    JPanel jp = new JPanel();
                    jf.setSize(400, 400);
                    jf.add(jp);
                    jf.setLocationRelativeTo(jb1);
                    jf.setVisible(true);
                }
            });
            //给第二个按钮添加监听
            jb2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JFrame jf = new JFrame();
                    JPanel jp = new JPanel();
                    jf.setSize(400, 400);
                    jf.add(jp);
                    jf.setLocationRelativeTo(jb1);
                    jf.setVisible(true);
                }
            });
            this.add(jp);
        }

        public static void main(String arg[]) {
            new Test().setVisible(true);
        }
    }
}
