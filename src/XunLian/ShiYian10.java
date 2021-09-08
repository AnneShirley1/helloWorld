package XunLian;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 设计一个在 Windows 系统中可以使用的“计算器”窗口
 * 并实现（＋、－、×、％等）其功能,具体计算器的界面如下图所示
 */
public class ShiYian10 {
    public static class jisuanqi extends JFrame implements ActionListener {
        JTextArea f1;
        JButton d1, d2,d3;//固定模板
        JButton b[];
        boolean flag = false;
        public jisuanqi() {
            JPanel p1 = new JPanel();
            JPanel p2 = new JPanel();
            b = new JButton[16];
            String str = "123+456-789x0.=/";
            for (int i = 0; i < b.length; i++) {
                b[i] = new JButton(str.substring(i, i + 1));
            }
            f1 = new JTextArea();
            d1 = new JButton("清除");
            d1.setBackground(Color.gray);
            //按钮颜色设置
            d2 = new JButton("开根号");
            d2.setBackground(Color.pink);
            d3 = new JButton("正弦");
            d3.setBackground(Color.green);
            //按钮设置
            setLayout(new BorderLayout());
            add(p1, BorderLayout.NORTH);
            add(p2, BorderLayout.CENTER);
            p1.setLayout(new FlowLayout());
            p1.add(f1);
            p1.add(d1);
            p1.add(d2);
            d1.addActionListener(this);
            d2.addActionListener(this);
            p2.setLayout(new GridLayout(4, 5));
            for (int i = 0; i < b.length; i++) {
                p2.add(b[i]);
                b[i].addActionListener(this);
            }
            setSize(400, 250);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == d1)
                f1.setText(null);
            else if (e.getSource() == d2) {
                String s = f1.getText().trim();
                double d = Math.sqrt(Double.parseDouble(s));
                f1.setText(String.valueOf(d));
            }
            else if (e.getSource() == b[14]) {
                String s = f1.getText().trim();
                String[] rs;
                if (s.contains("+")) {
                    rs = s.split("\\+");
                    double d = Double.parseDouble(rs[0]) + Double.parseDouble(rs[1]);
                    f1.setText(String.valueOf(d));
                }
                else if (s.contains("x")) {
                    rs = s.split("x");
                    double d = Double.parseDouble(rs[0]) * Double.parseDouble(rs[1]);
                    f1.setText(String.valueOf(d));
                }
                else if (s.contains("-")) {
                    rs = s.split("-");
                    double d = Double.parseDouble(rs[0]) - Double.parseDouble(rs[1]);
                    f1.setText(String.valueOf(d));
                }
                else if (s.contains("/")) {
                    rs = s.split("/");
                    //按钮选项设置
                    double d = Double.parseDouble(rs[0]) / Double.parseDouble(rs[1]);
                    f1.setText(String.valueOf(d));
                }
                flag = true;
            } else {
                if (flag) {
                    f1.setText("");
                }
                f1.append(e.getActionCommand());
                flag = false;
            }
        }
        public static void main(String[] args) {
            jisuanqi sc = new jisuanqi();
            sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
