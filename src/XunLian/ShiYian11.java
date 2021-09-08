package XunLian;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**在窗口中放入一个用户名文本框，
 * 一个密码框和一个初始化为不可编辑的文本区组件。
 *  当用户输入用户名和密码正确后，文本区组件可进行编辑。
 */
public class ShiYian11 {
    public static class ChuangKo extends JFrame implements ActionListener {
        //设置窗口前置标题
        private JLabel[] jlArray = {new JLabel("用户名"), new JLabel("密码")};
        private JTextField jName = new JTextField();
        private JPasswordField jPassword = new JPasswordField();
        private JTextArea jText = new JTextArea(10, 30);
        private JScrollPane jsp = new JScrollPane(jText);

        public ChuangKo() {
            this.setLayout(null);
            //设置窗口大小
            jlArray[0].setBounds(20, 10, 50, 25);
            jName.setBounds(70, 10, 170, 25);
            jlArray[1].setBounds(20, 30, 50, 25);
            jPassword.setBounds(70, 35, 170, 25);
            jsp.setBounds(20, 70, 220, 100);
            jText.setEnabled(false);
            //设置窗口颜色
            jText.setDisabledTextColor(Color.RED);
            this.add(jsp);
            this.add(jlArray[0]);
            this.add(jlArray[1]);
            this.add(jName);
            this.add(jPassword);
            jName.addActionListener(this);
            jPassword.addActionListener(this);
            this.setResizable(false);
            this.setBounds(100, 100, 280, 220);
        }

        public void actionPerformed(ActionEvent e) {
            if (jName.getText().equals("abc") && String.valueOf(jPassword.getPassword()).equals("123")) {
              jText.setEnabled(true);
                jText.setText("E:\\java教材及相关资料\\ZhiMu3.txt");
                jText.setLineWrap(true);
            }
        }
        public static void main(String[] args) {
            ChuangKo frm = new ChuangKo();
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
