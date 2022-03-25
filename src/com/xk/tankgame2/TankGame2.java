package com.xk.tankgame2;

import javax.swing.*;

public class TankGame2 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        TankGame2 tankgame2 = new TankGame2();

    }
    public TankGame2() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 释放资源
        this.setVisible(true);
        this.addKeyListener(mp);

    }
}
