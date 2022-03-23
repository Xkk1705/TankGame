package com.xk.tankgame;

import javax.swing.*;
import java.awt.*;

//绘图区域
public class MyPanel extends JPanel {
    //定义我的tank
    MyTank hero = null;
    public MyPanel() {
        hero = new MyTank(100,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750); //填充矩形，默认黑色
    }
}
