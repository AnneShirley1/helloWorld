package XunLian;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**在窗口中设置两个按钮，分别用于画圆或者椭圆，
 * 并在绘图区域中显示字符串“画圆或者椭圆”，
 */
public class ShiYian12 {
    public static class App14_1 extends JFrame
    {
        //设置窗口上的按钮选项
        static JButton b1=new JButton("画圆");
        static JButton b2=new JButton("画椭圆");
        static JPanel pan=new MyPanel();
        static App14_1 frm = new App14_1();
        static int circle=0;
        public static void main(String[] args)
        {
            frm.setVisible(true);
            frm.setTitle("画圆或者椭圆");
            frm.setSize(300,250);
            //设置窗口大小
            frm.setLayout(null);
            frm.add(pan);
            pan.setBounds(0,0,300,300);
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        static class MyPanel extends JPanel implements ActionListener
        {
            MyPanel()
            {
                this.add(b1);   this.add(b2);
                b1.addActionListener(this);
                b2.addActionListener(this);
            }
            public void actionPerformed(ActionEvent e)
            {
                JButton bt=(JButton)e.getSource();
                if (bt==b1) circle=1;
                else circle=2;
                Graphics g=this.getGraphics();
                repaint();
            }
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                b1.setBounds(50,180,80,25);
                b2.setBounds(150,180,80,25);
                g.setFont(new Font("画圆或者椭圆",Font.ITALIC,20));
                g.setColor(Color.blue);
                //设置颜色
                g.drawString("画圆或者椭圆",100,30);
                //设置圆或者椭圆的大小
                if (circle==1) g.drawOval(100,70,70,70);
                else if (circle==2) g.drawOval(80,40,70,120);
            }
        }
    }

}

