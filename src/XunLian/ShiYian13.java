package XunLian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
    public class ShiYian13 extends JApplet implements ItemListener {
        Container ctp = this.getContentPane();
        //按钮设置
        JLabel lb1 = new JLabel("歌名");
        JLabel lb2 = new JLabel("播放");
        JLabel lb3 = new JLabel("暂停");
        //下滑目录
        String name[] = {"下雨的夜晚", "两只老虎", "夏天", "童话"};
        JComboBox cb = new JComboBox();
        public void init() {
            ctp.setLayout(new FlowLayout());
            for (int i = 0; i < name.length; i++) {
                cb.addItem(name[i]);
            }
            cb.addItemListener(this);
            ctp.add(lb1);
            ctp.add(cb);
            ctp.add(lb2);
            ctp.add(lb3);
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            int index = 0;
            String str = (String) e.getItem();
            for (int i = 0; i < name.length; i++) {
                if (str == name[i]) {
                    index = cb.getSelectedIndex();
                }
            }
        }
    }

