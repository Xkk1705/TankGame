package com.xk.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {//JFrame 对应窗口
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        //初始化面板
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 释放资源
        this.setVisible(true);

    }
}

// 1定义一个MyPanel，继承JPanel类 相当于画笔
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10,10,100,100);  //第一次自动调用
    }
}