package ShiXun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 class JSQ extends JFrame {
        public static void main(String[] args) {
            new JSQ();
        }
        public JSQ() {
            setTitle("计算器"); // 标题名称
            setSize(400, 350); // 窗口大小
            setLocationRelativeTo(null);// 窗口居中
            setLayout(new BorderLayout()); // 布局方式
            final JTextField lblxian = new JTextField(); // 文本输入框
            lblxian.setFont(new Font("宋体", Font.PLAIN, 60)); // 设置字体
            lblxian.setPreferredSize(new Dimension(230, 70)); // 设置显示器的大小
            JPanel panelxian = new JPanel(); // 容器
            panelxian.add(lblxian);
            add(panelxian, BorderLayout.NORTH); // 加到窗口上
            JPanel panelS = new JPanel();
            add(panelS, BorderLayout.SOUTH);
            panelS.setLayout(new GridLayout(5, 4)); // 设置布局方式,行和列
            JButton btnAC = new JButton("清空"); // 清空数字的按钮
            // 监听器
            btnAC.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lblxian.setText(""); // 设置数字为空，清空数字
                }
            });
            panelS.add(btnAC);
            add(panelS);
            JButton btnZhengFu = new JButton("+/-");
            panelS.add(btnZhengFu);
            add(panelS);
            JButton btnBai = new JButton("%"); // 百分号按钮
            // 监听器
            btnBai.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    double num = Double.parseDouble(lblxian.getText());
                    lblxian.setText("" + (num / 100));

                }
            });
            panelS.add(btnBai);
            add(panelS);
            JButton btnChu = new JButton("/"); // 除号按钮
            // 监听器
            btnChu.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lblxian.getText().indexOf("/") > 0) { // 判断是否有除号，有的话不能再输入除号
                    } else {
                        lblxian.setText(lblxian.getText() + "/");
                    }
                }
            });
            btnChu.setBackground(Color.orange);
            panelS.add(btnChu);
            add(panelS);
            JButton btn7 = new JButton("7"); // 数字7按钮
            btn7.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    lblxian.setText(lblxian.getText() + 7);


                }
            });
            panelS.add(btn7);
            add(panelS);
            JButton btn8 = new JButton("8");// 数组8的按钮
            btn8.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    lblxian.setText(lblxian.getText() + 8);

                }
            });
            panelS.add(btn8);
            add(panelS);
            JButton btn9 = new JButton("9");// 数字9的按钮
            btn9.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    lblxian.setText(lblxian.getText() + 9);

                }
            });
            panelS.add(btn9);
            add(panelS);
            JButton btnCheng = new JButton("X");// 乘号的按钮
            btnCheng.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) { // 判断是否有乘号，有的话，不能再输入乘号
                    if (lblxian.getText().indexOf("*") > 0) {

                    } else {
                        lblxian.setText(lblxian.getText() + "*");
                    }
                }
            });
            btnCheng.setBackground(Color.orange);
            panelS.add(btnCheng);
            add(panelS);
            JButton btn4 = new JButton("4"); // 数字4的按钮
            btn4.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    lblxian.setText(lblxian.getText() + 4);

                }
            });
            panelS.add(btn4);
            add(panelS);
            JButton btn5 = new JButton("5");// 数字5的按钮
            btn5.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    lblxian.setText(lblxian.getText() + 5);

                }
            });
            panelS.add(btn5);
            add(panelS);
            JButton btn6 = new JButton("6");// 数字6的按钮
            btn6.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    lblxian.setText(lblxian.getText() + 6);

                }
            });
            panelS.add(btn6);
            add(panelS);
            JButton btnJian = new JButton("-");// 减号的按钮
            btnJian.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lblxian.getText().indexOf("-") > 0) { // 判断是否有减号，有的话不用再输入减号

                    } else {
                        lblxian.setText(lblxian.getText() + "-");
                    }
                }
            });
            btnJian.setBackground(Color.orange);
            panelS.add(btnJian);
            add(panelS);
            JButton btn1 = new JButton("1");// 数字1的按钮
            btn1.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    lblxian.setText(lblxian.getText() + 1);

                }
            });
            panelS.add(btn1);
            add(panelS);
            JButton btn2 = new JButton("2");// 数字2的按钮
            btn2.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    lblxian.setText(lblxian.getText() + 2);

                }
            });
            panelS.add(btn2);
            add(panelS);
            JButton btn3 = new JButton("3");// 数字3的按钮
            btn3.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    lblxian.setText(lblxian.getText() + 3);

                }
            });
            panelS.add(btn3);
            add(panelS);
            JButton btnJia = new JButton("+");// 加号的按钮
            btnJia.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (lblxian.getText().indexOf("+") > 0) { // 判断是否有加号，有的话不能再输入加号

                    } else {
                        lblxian.setText(lblxian.getText() + "+");
                    }
                }
            });
            btnJia.setBackground(Color.orange);
            panelS.add(btnJia);
            add(panelS);
            JButton btn0 = new JButton("0");// 数字0的按钮
            btn0.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    lblxian.setText(lblxian.getText() + 0);

                }
            });
            panelS.add(btn0);
            add(panelS);
            JButton btnTui = new JButton("退格");// 退格的按钮
            btnTui.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    String c = lblxian.getText();
                    String num = c.substring(0, c.length() - 1); // 截图输入框中字符从0到倒数第二个的字符
                    lblxian.setText(num);

                }
            });
            panelS.add(btnTui);
            add(panelS);
            JButton btnDian = new JButton(".");// 小数点的按钮
            btnDian.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    lblxian.setText(lblxian.getText() + ".");
                }
            });
            panelS.add(btnDian);
            add(panelS);
            JButton btnDeng = new JButton("=");// 等号的按钮
            btnDeng.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    /**
                     * 加法计算
                     */
                    String content = lblxian.getText(); // 获取文本框的数
                    int i = content.indexOf("+"); // 搜索加号的位置
                    if (i > 0) {
                    // 加法
                        String num1 = content.substring(0, i); // 截取加号前的数字
                        String num2 = content.substring(i + 1, content.length());// 截取加号以后的数字
                        try {
                            double fNum = Double.parseDouble(num1);// 强行转化为double的数据类型
                            double sNum = Double.parseDouble(num2);// 强行转化为double的数据类型
                            double sum = fNum + sNum; // 两数相加
                            lblxian.setText("" + sum);// 输出到文本框

                        } catch (Exception e2) {

                        }
                    }
                /**
                * 减法计算
                 */
                    String content1 = lblxian.getText();// 获取文本框数字
                    int j = content1.indexOf("-"); // 搜索减号的位置
                    if (j > 0) {
                // 减法
                        String num1 = content1.substring(0, j); // 截取减号前的数字
                        String num2 = content1.substring(j + 1, content1.length()); // 截取减号后的数字
                        try {
                            double fNum = Double.parseDouble(num1);// 强行转化为double的数据类型
                            double sNum = Double.parseDouble(num2);// 强行转化为double的数据类型
                            double jian = fNum - sNum; // 两数相减
                            lblxian.setText("" + jian); // 设置文本框

                        } catch (Exception e2) {

                        }
                    }
                    /**
                     * 乘法计算
                     */
                    String content2 = lblxian.getText();// 获取文本框数字
                    int k = content2.indexOf("*"); // 搜索乘号的位置
                    if (k > 0) {
                    // 乘法
                        String num1 = content2.substring(0, k); // 截取乘号前的数字
                        String num2 = content2.substring(k + 1, content2.length());// 截取乘号后面的数字
                        try {
                            double fNum = Double.parseDouble(num1);// 强行转化为double的数据类型
                            double sNum = Double.parseDouble(num2);// 强行转化为double的数据类型
                            double cheng = fNum * sNum;// 两数相乘
                            lblxian.setText("" + cheng); // 设置文本框
                        } catch (Exception e2) {
                        }
                    }
                    /**
                    * 除法计算
                     */
                    String content3 = lblxian.getText();// 获取文本框的内容
                    int l = content3.indexOf("/"); // 搜索除号的位置
                    if (l > 0) {
                        // 除法
                        String num1 = content3.substring(0, l);// 截取除号前的数字
                        String num2 = content3.substring(l + 1, content3.length());// 截取除号后的数字
                        try {
                            double fNum = Double.parseDouble(num1);// 强行转化为double的数据类型
                            double sNum = Double.parseDouble(num2);// 强行转化为double的数据类型
                            double chu = fNum / sNum;// 两数相除
                            lblxian.setText("" + chu);// 设置文本框内容

                        } catch (Exception e2) {

                        }
                    }

                }
            });
            btnDeng.setBackground(Color.orange);
            panelS.add(btnDeng);
            add(panelS);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗口
            setVisible(true);// 显示窗口
        }
    }

